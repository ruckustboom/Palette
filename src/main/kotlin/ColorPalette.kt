package ruckustboom.palette

public data class Tree<out T>(val value: T, val children: List<Tree<T>>)

public interface ColorPalette {
    public fun toList(): List<Pair<String, String>>
    public fun toTree(): Tree<Pair<String, String?>>
}

public fun main() {
    Material.toTree().forEach { (name, color) ->
        if (color != null) {
            println("$name: #$color")
        }
    }
}

// Helpers

public fun <T> Tree<T>.forEach(isPostFix: Boolean = false, action: (T) -> Unit) {
    if (!isPostFix) action(value)
    children.forEach { it.forEach(isPostFix, action) }
    if (isPostFix) action(value)
}

public fun <T> Tree<T>.forEachWithPath(isPostFix: Boolean = false, action: (path: List<T>, T) -> Unit) {
    forEachWithPath(emptyList(), isPostFix, action)
}

private fun <T> Tree<T>.forEachWithPath(path: List<T>, isPostFix: Boolean, action: (path: List<T>, T) -> Unit) {
    if (!isPostFix) action(path, value)
    children.forEach { it.forEachWithPath(path + value, isPostFix, action) }
    if (isPostFix) action(path, value)
}

public interface TreeBuilder<T> {
    public fun branch(value: T, children: (TreeBuilder<T>.() -> Unit)? = null)
}

private class TreeBuilderImpl<T>(private val value: T) : TreeBuilder<T> {
    private val children = mutableListOf<Tree<T>>()

    fun build() = Tree(value, children)

    override fun branch(value: T, children: (TreeBuilder<T>.() -> Unit)?) {
        this.children +=
            if (children == null) Tree(value, emptyList())
            else TreeBuilderImpl(value).apply(children).build()
    }
}

public fun <T> tree(value: T, children: (TreeBuilder<T>.() -> Unit)? = null): Tree<T> =
    if (children == null) Tree(value, emptyList())
    else TreeBuilderImpl(value).apply(children).build()

public fun <T> Tree<T>.prettyPrint(convert: (T) -> String = { it.toString() }) {
    prettyPrint(0, convert)
}

private fun <T> Tree<T>.prettyPrint(indent: Int, convert: (T) -> String = { it.toString() }) {
    repeat(indent) { print("  ") }
    println(convert(value))
    for (child in children) child.prettyPrint(indent + 1, convert)
}

public fun ColorPalette.prettyPrint(
    stringify: (name: String, color: String?) -> String = { n, c ->
        buildString {
            append(n)
            if (c != null) {
                append(": #")
                append(c)
            }
        }
    }
) {
    toTree().prettyPrint { (n, c) -> stringify(n, c) }
}
