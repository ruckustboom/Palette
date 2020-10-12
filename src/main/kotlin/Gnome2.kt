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

    override fun toList(): List<Pair<String, String>> = listOf(
        "Basic 3D Highlight" to basic3DHighlight,
        "Basic 3D Medium" to basic3DMedium,
        "Basic 3D Dark" to basic3DDark,
        "Basic 3D Shadow" to basic3DShadow,
        "Green Highlight" to greenHighlight,
        "Green Medium" to greenMedium,
        "Green Dark" to greenDark,
        "Green Shadow" to greenShadow,
        "Red Highlight" to redHighlight,
        "Red Medium" to redMedium,
        "Red Dark" to redDark,
        "Red Shadow" to redShadow,
        "Purple Highlight" to purpleHighlight,
        "Purple Medium" to purpleMedium,
        "Purple Dark" to purpleDark,
        "Purple Shadow" to purpleShadow,
        "Blue Highlight" to blueHighlight,
        "Blue Medium" to blueMedium,
        "Blue Dark" to blueDark,
        "Blue Shadow" to blueShadow,
        "Face Skin Highlight" to faceSkinHighlight,
        "Face Skin Medium" to faceSkinMedium,
        "Face Skin Dark" to faceSkinDark,
        "Face Skin Shadow" to faceSkinShadow,
        "Accent Red" to accentRed,
        "Accent Red Dark" to accentRedDark,
        "Accent Yellow" to accentYellow,
        "Accent Yellow Dark" to accentYellowDark,
        "Accent Green" to accentGreen,
        "Accent Green Dark" to accentGreenDark,
        "White" to white,
        "Black" to black,
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
