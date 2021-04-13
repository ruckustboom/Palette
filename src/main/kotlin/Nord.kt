package ruckustboom.palette

// https://www.nordtheme.com/
public object Nord : ColorPalette {
    // Polar Night
    public val nord0: String = "2E3440"
    public val nord1: String = "3B4252"
    public val nord2: String = "434C5E"
    public val nord3: String = "4C566A"

    // Snow Storm
    public val nord4: String = "D8DEE9"
    public val nord5: String = "E5E9F0"
    public val nord6: String = "ECEFF4"

    // Frost
    public val nord7: String = "8FBCBB"
    public val nord8: String = "88C0D0"
    public val nord9: String = "81A1C1"
    public val nord10: String = "5E81AC"

    // Aurora
    public val nord11: String = "BF616A"
    public val nord12: String = "D08770"
    public val nord13: String = "EBCB8B"
    public val nord14: String = "A3BE8C"
    public val nord15: String = "B48EAD"

    override fun toList(): List<Pair<String, String>> = listOf(
        "nord0" to nord0,
        "nord1" to nord1,
        "nord2" to nord2,
        "nord3" to nord3,
        "nord4" to nord4,
        "nord5" to nord5,
        "nord6" to nord6,
        "nord7" to nord7,
        "nord8" to nord8,
        "nord9" to nord9,
        "nord10" to nord10,
        "nord11" to nord11,
        "nord12" to nord12,
        "nord13" to nord13,
        "nord14" to nord14,
        "nord15" to nord15,
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Nord" to null as String?) {
        branch("Polar Night" to null) {
            branch("nord0" to nord0)
            branch("nord1" to nord1)
            branch("nord2" to nord2)
            branch("nord3" to nord3)
        }
        branch("Snow Storm" to null) {
            branch("nord4" to nord4)
            branch("nord5" to nord5)
            branch("nord6" to nord6)
        }
        branch("Frost" to null) {
            branch("nord7" to nord7)
            branch("nord8" to nord8)
            branch("nord9" to nord9)
            branch("nord10" to nord10)
        }
        branch("Aurora" to null) {
            branch("nord11" to nord11)
            branch("nord12" to nord12)
            branch("nord13" to nord13)
            branch("nord14" to nord14)
            branch("nord15" to nord15)
        }
    }
}
