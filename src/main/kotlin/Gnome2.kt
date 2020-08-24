package ruckustboom.palette

// https://developer.gnome.org/hig-book/unstable/design-color.html.en
public object Gnome2 : ColorPalette {
    // Basic

    // 3D
    public val basic3DHighlight: String = "EAE8E3"
    public val basic3DMedium: String = "BAB5AB"
    public val basic3DDark: String = "807D74"
    public val basic3DShadow: String = "565248"

    // Green
    public val greenHighlight: String = "C5D2C8"
    public val greenMedium: String = "83A67F"
    public val greenDark: String = "5D7555"
    public val greenShadow: String = "445632"

    // Red
    public val redHighlight: String = "E0B6AF"
    public val redMedium: String = "C1665A"
    public val redDark: String = "884631"
    public val redShadow: String = "663822"

    // Purple
    public val purpleHighlight: String = "ADA7C8"
    public val purpleMedium: String = "887FA3"
    public val purpleDark: String = "625B81"
    public val purpleShadow: String = "494066"

    // Blue
    public val blueHighlight: String = "9DB8D2"
    public val blueMedium: String = "7590AE"
    public val blueDark: String = "4B6983"
    public val blueShadow: String = "314E6C"

    // Face Skin
    public val faceSkinHighlight: String = "EFE0CD"
    public val faceSkinMedium: String = "E0C39E"
    public val faceSkinDark: String = "B39169"
    public val faceSkinShadow: String = "826647"

    // Accent

    // Red
    public val accentRed: String = "DF421E"
    public val accentRedDark: String = "990000"

    // Yellow
    public val accentYellow: String = "EED680"
    public val accentYellowDark: String = "D1940C"

    // Green
    public val accentGreen: String = "46A046"
    public val accentGreenDark: String = "267726"

    // Neutral
    public val white: String = "FFFFFF"
    public val black: String = "000000"

    private fun <T> branch(t: T): T = t

    // TODO: Fix names
    override fun toList(): List<Pair<String, String>> = listOf(
        "Highlight" to basic3DHighlight,
        "Medium" to basic3DMedium,
        "Dark" to basic3DDark,
        "Shadow" to basic3DShadow,
        "Highlight" to greenHighlight,
        "Medium" to greenMedium,
        "Dark" to greenDark,
        "Shadow" to greenShadow,
        "Highlight" to redHighlight,
        "Medium" to redMedium,
        "Dark" to redDark,
        "Shadow" to redShadow,
        "Highlight" to purpleHighlight,
        "Medium" to purpleMedium,
        "Dark" to purpleDark,
        "Shadow" to purpleShadow,
        "Highlight" to blueHighlight,
        "Medium" to blueMedium,
        "Dark" to blueDark,
        "Shadow" to blueShadow,
        "Highlight" to faceSkinHighlight,
        "Medium" to faceSkinMedium,
        "Dark" to faceSkinDark,
        "Shadow" to faceSkinShadow,
        "Red" to accentRed,
        "Dark" to accentRedDark,
        "Yellow" to accentYellow,
        "Dark" to accentYellowDark,
        "Green" to accentGreen,
        "Dark" to accentGreenDark,
        "White" to white,
        "Black" to black
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Gnome 2" to null as String?) {
        branch("Basic 3D" to basic3DMedium) {
            branch("Highlight" to basic3DHighlight)
            branch("Medium" to basic3DMedium)
            branch("Dark" to basic3DDark)
            branch("Shadow" to basic3DShadow)
        }
        branch("Green" to greenMedium) {
            branch("Highlight" to greenHighlight)
            branch("Medium" to greenMedium)
            branch("Dark" to greenDark)
            branch("Shadow" to greenShadow)
        }
        branch("Red" to redMedium) {
            branch("Highlight" to redHighlight)
            branch("Medium" to redMedium)
            branch("Dark" to redDark)
            branch("Shadow" to redShadow)
        }
        branch("Purple" to purpleMedium) {
            branch("Highlight" to purpleHighlight)
            branch("Medium" to purpleMedium)
            branch("Dark" to purpleDark)
            branch("Shadow" to purpleShadow)
        }
        branch("Blue" to blueMedium) {
            branch("Highlight" to blueHighlight)
            branch("Medium" to blueMedium)
            branch("Dark" to blueDark)
            branch("Shadow" to blueShadow)
        }
        branch("Face Skin" to faceSkinMedium) {
            branch("Highlight" to faceSkinHighlight)
            branch("Medium" to faceSkinMedium)
            branch("Dark" to faceSkinDark)
            branch("Shadow" to faceSkinShadow)
        }
        branch("Accent" to null) {
            branch("Red" to accentRed) {
                branch("Dark" to accentRedDark)
            }
            branch("Yellow" to accentYellow) {
                branch("Dark" to accentYellowDark)
            }
            branch("Green" to accentGreen) {
                branch("Dark" to accentGreenDark)
            }
        }
        branch("White" to white)
        branch("Black" to black)
    }
}
