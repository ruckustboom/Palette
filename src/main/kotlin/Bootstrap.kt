package ruckustboom.palette

// https://getbootstrap.com/docs/4.5/getting-started/theming/#color
public object Bootstrap : ColorPalette {
    public val blue: String = "007BFF"
    public val indigo: String = "6610F2"
    public val purple: String = "6F42C1"
    public val pink: String = "E83E8C"
    public val red: String = "DC3545"
    public val orange: String = "FD7E14"
    public val yellow: String = "FFC107"
    public val green: String = "28A745"
    public val teal: String = "20C997"
    public val cyan: String = "17A2B8"

    public val gray100: String = "f8f9fa"
    public val gray200: String = "e9ecef"
    public val gray300: String = "dee2e6"
    public val gray400: String = "ced4da"
    public val gray500: String = "adb5bd"
    public val gray600: String = "6c757d"
    public val gray700: String = "495057"
    public val gray800: String = "343a40"
    public val gray900: String = "212529"

    override fun toList(): List<Pair<String, String>> {
        TODO("Not yet implemented")
    }

    override fun toTree(): Tree<Pair<String, String?>> = tree("Bootstrap" to null as String?) {
        branch("Blue" to blue)
        branch("Indigo" to indigo)
        branch("Purple" to purple)
        branch("Pink" to pink)
        branch("Red" to red)
        branch("Orange" to orange)
        branch("Yellow" to yellow)
        branch("Green" to green)
        branch("Teal" to teal)
        branch("Cyan" to cyan)
        branch("Gray" to gray500) {
            branch("100" to gray100)
            branch("200" to gray200)
            branch("300" to gray300)
            branch("400" to gray400)
            branch("500" to gray500)
            branch("600" to gray600)
            branch("700" to gray700)
            branch("800" to gray800)
            branch("900" to gray900)
        }
    }
}
