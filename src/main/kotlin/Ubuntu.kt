package ruckustboom.palette

// https://design.ubuntu.com/brand/colour-palette/
public object Ubuntu : ColorPalette {
    // Core Colors
    public val ubuntuOrange: String get() = ubuntuOrange100
    public val canonicalAubergine: String get() = canonicalAubergine100
    public val white: String = "FFFFFF"
    public val black: String = "000000"

    // Supporting Colors
    public val lightAubergine: String get() = lightAubergine100
    public val midAubergine: String get() = midAubergine100
    public val darkAubergine: String get() = darkAubergine100

    // Neutral Colors
    public val warmGrey: String get() = warmGrey100
    public val coolGray: String = "333333"
    public val textGray: String = "111111"

    // Tints

    // Ubuntu Orange
    public val ubuntuOrange100: String = "E95420"
    public val ubuntuOrange90: String = "EB6536"
    public val ubuntuOrange80: String = "ED764D"
    public val ubuntuOrange70: String = "F08763"
    public val ubuntuOrange60: String = "F29879"
    public val ubuntuOrange50: String = "F4AA90"
    public val ubuntuOrange45: String = "F5B29B"
    public val ubuntuOrange40: String = "F6BBA6"
    public val ubuntuOrange35: String = "F7C3B1"
    public val ubuntuOrange30: String = "F8CCBC"
    public val ubuntuOrange25: String = "FAD4C7"
    public val ubuntuOrange20: String = "FBDDD2"
    public val ubuntuOrange15: String = "FCE5DE"
    public val ubuntuOrange10: String = "FDEEE9"

    // Canonical Aubergine
    public val canonicalAubergine100: String = "772953"
    public val canonicalAubergine90: String = "843E64"
    public val canonicalAubergine80: String = "925375"
    public val canonicalAubergine70: String = "9F6986"
    public val canonicalAubergine60: String = "AD7E97"
    public val canonicalAubergine50: String = "BB94A9"
    public val canonicalAubergine45: String = "C19EB1"
    public val canonicalAubergine40: String = "C8A9BA"
    public val canonicalAubergine35: String = "CFB4C2"
    public val canonicalAubergine30: String = "D6BECB"
    public val canonicalAubergine25: String = "DDC9D4"
    public val canonicalAubergine20: String = "E3D4DC"
    public val canonicalAubergine15: String = "EADEE5"
    public val canonicalAubergine10: String = "F1E9ED"

    // Light Aubergine
    public val lightAubergine100: String = "77216F"
    public val lightAubergine90: String = "84377D"
    public val lightAubergine80: String = "924D8B"
    public val lightAubergine70: String = "9F639A"
    public val lightAubergine60: String = "AD79A8"
    public val lightAubergine50: String = "BB90B7"
    public val lightAubergine45: String = "C19BBE"
    public val lightAubergine40: String = "C8A6C5"
    public val lightAubergine35: String = "CFB1CC"
    public val lightAubergine30: String = "D6BCD3"
    public val lightAubergine25: String = "DDC7DB"
    public val lightAubergine20: String = "E3D2E2"
    public val lightAubergine15: String = "EADDE9"
    public val lightAubergine10: String = "F1E8F0"

    // Mid Aubergine
    public val midAubergine100: String = "5E2750"
    public val midAubergine90: String = "6E3C61"
    public val midAubergine80: String = "7E5273"
    public val midAubergine70: String = "8E6784"
    public val midAubergine60: String = "9E7D96"
    public val midAubergine50: String = "AE93A7"
    public val midAubergine45: String = "B69DB0"
    public val midAubergine40: String = "BEA8B9"
    public val midAubergine35: String = "C6B3C1"
    public val midAubergine30: String = "CEBECA"
    public val midAubergine25: String = "D6C9D3"
    public val midAubergine20: String = "DED3DC"
    public val midAubergine15: String = "E6DEE4"
    public val midAubergine10: String = "EEE9ED"

    // Dark Aubergine
    public val darkAubergine100: String = "2C001E"
    public val darkAubergine90: String = "411934"
    public val darkAubergine80: String = "56334B"
    public val darkAubergine70: String = "6B4C61"
    public val darkAubergine60: String = "806678"
    public val darkAubergine50: String = "957F8E"
    public val darkAubergine45: String = "A08C99"
    public val darkAubergine40: String = "AA99A5"
    public val darkAubergine35: String = "B5A5B0"
    public val darkAubergine30: String = "BFB2BB"
    public val darkAubergine25: String = "CABFC6"
    public val darkAubergine20: String = "D4CCD2"
    public val darkAubergine15: String = "DFD8DD"
    public val darkAubergine10: String = "E9E5E8"

    // Warm Grey
    public val warmGrey100: String = "AEA79F"
    public val warmGrey90: String = "B6AFA8"
    public val warmGrey80: String = "BEB8B2"
    public val warmGrey70: String = "C6C1BB"
    public val warmGrey60: String = "CECAC5"
    public val warmGrey50: String = "D6D3CF"
    public val warmGrey45: String = "DAD7D3"
    public val warmGrey40: String = "DEDBD8"
    public val warmGrey35: String = "E2E0DD"
    public val warmGrey30: String = "E6E4E2"
    public val warmGrey25: String = "EAE9E7"
    public val warmGrey20: String = "EEEDEB"
    public val warmGrey15: String = "F2F1F0"
    public val warmGrey10: String = "F6F6F5"

    // TODO: Fix names
    override fun toList(): List<Pair<String, String>> = listOf(
        "Ubuntu Orange" to ubuntuOrange,
        "100%" to ubuntuOrange100,
        "90%" to ubuntuOrange90,
        "80%" to ubuntuOrange80,
        "70%" to ubuntuOrange70,
        "60%" to ubuntuOrange60,
        "50%" to ubuntuOrange50,
        "45%" to ubuntuOrange45,
        "40%" to ubuntuOrange40,
        "35%" to ubuntuOrange35,
        "30%" to ubuntuOrange30,
        "25%" to ubuntuOrange25,
        "20%" to ubuntuOrange20,
        "15%" to ubuntuOrange15,
        "10%" to ubuntuOrange10,
        "Canonical Aubergine" to canonicalAubergine,
        "100%" to canonicalAubergine100,
        "90%" to canonicalAubergine90,
        "80%" to canonicalAubergine80,
        "70%" to canonicalAubergine70,
        "60%" to canonicalAubergine60,
        "50%" to canonicalAubergine50,
        "45%" to canonicalAubergine45,
        "40%" to canonicalAubergine40,
        "35%" to canonicalAubergine35,
        "30%" to canonicalAubergine30,
        "25%" to canonicalAubergine25,
        "20%" to canonicalAubergine20,
        "15%" to canonicalAubergine15,
        "10%" to canonicalAubergine10,
        "White" to white,
        "Black" to black,
        "Light Aubergine" to lightAubergine,
        "100%" to lightAubergine100,
        "90%" to lightAubergine90,
        "80%" to lightAubergine80,
        "70%" to lightAubergine70,
        "60%" to lightAubergine60,
        "50%" to lightAubergine50,
        "45%" to lightAubergine45,
        "40%" to lightAubergine40,
        "35%" to lightAubergine35,
        "30%" to lightAubergine30,
        "25%" to lightAubergine25,
        "20%" to lightAubergine20,
        "15%" to lightAubergine15,
        "10%" to lightAubergine10,
        "Mid Aubergine" to midAubergine,
        "100%" to midAubergine100,
        "90%" to midAubergine90,
        "80%" to midAubergine80,
        "70%" to midAubergine70,
        "60%" to midAubergine60,
        "50%" to midAubergine50,
        "45%" to midAubergine45,
        "40%" to midAubergine40,
        "35%" to midAubergine35,
        "30%" to midAubergine30,
        "25%" to midAubergine25,
        "20%" to midAubergine20,
        "15%" to midAubergine15,
        "10%" to midAubergine10,
        "Dark Aubergine" to darkAubergine,
        "100%" to darkAubergine100,
        "90%" to darkAubergine90,
        "80%" to darkAubergine80,
        "70%" to darkAubergine70,
        "60%" to darkAubergine60,
        "50%" to darkAubergine50,
        "45%" to darkAubergine45,
        "40%" to darkAubergine40,
        "35%" to darkAubergine35,
        "30%" to darkAubergine30,
        "25%" to darkAubergine25,
        "20%" to darkAubergine20,
        "15%" to darkAubergine15,
        "10%" to darkAubergine10,
        "Warm Grey" to warmGrey,
        "100%" to warmGrey100,
        "90%" to warmGrey90,
        "80%" to warmGrey80,
        "70%" to warmGrey70,
        "60%" to warmGrey60,
        "50%" to warmGrey50,
        "45%" to warmGrey45,
        "40%" to warmGrey40,
        "35%" to warmGrey35,
        "30%" to warmGrey30,
        "25%" to warmGrey25,
        "20%" to warmGrey20,
        "15%" to warmGrey15,
        "10%" to warmGrey10,
        "Cool Gray" to coolGray,
        "Text Gray" to textGray
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Ubuntu" to null as String?) {
        branch("Core" to null) {
            branch("Ubuntu Orange" to ubuntuOrange) {
                branch("100%" to ubuntuOrange100)
                branch("90%" to ubuntuOrange90)
                branch("80%" to ubuntuOrange80)
                branch("70%" to ubuntuOrange70)
                branch("60%" to ubuntuOrange60)
                branch("50%" to ubuntuOrange50)
                branch("45%" to ubuntuOrange45)
                branch("40%" to ubuntuOrange40)
                branch("35%" to ubuntuOrange35)
                branch("30%" to ubuntuOrange30)
                branch("25%" to ubuntuOrange25)
                branch("20%" to ubuntuOrange20)
                branch("15%" to ubuntuOrange15)
                branch("10%" to ubuntuOrange10)
            }
            branch("Canonical Aubergine" to canonicalAubergine) {
                branch("100%" to canonicalAubergine100)
                branch("90%" to canonicalAubergine90)
                branch("80%" to canonicalAubergine80)
                branch("70%" to canonicalAubergine70)
                branch("60%" to canonicalAubergine60)
                branch("50%" to canonicalAubergine50)
                branch("45%" to canonicalAubergine45)
                branch("40%" to canonicalAubergine40)
                branch("35%" to canonicalAubergine35)
                branch("30%" to canonicalAubergine30)
                branch("25%" to canonicalAubergine25)
                branch("20%" to canonicalAubergine20)
                branch("15%" to canonicalAubergine15)
                branch("10%" to canonicalAubergine10)
            }
            branch("White" to white)
            branch("Black" to black)
        }
        branch("Supporting" to null) {
            branch("Light Aubergine" to lightAubergine) {
                branch("100%" to lightAubergine100)
                branch("90%" to lightAubergine90)
                branch("80%" to lightAubergine80)
                branch("70%" to lightAubergine70)
                branch("60%" to lightAubergine60)
                branch("50%" to lightAubergine50)
                branch("45%" to lightAubergine45)
                branch("40%" to lightAubergine40)
                branch("35%" to lightAubergine35)
                branch("30%" to lightAubergine30)
                branch("25%" to lightAubergine25)
                branch("20%" to lightAubergine20)
                branch("15%" to lightAubergine15)
                branch("10%" to lightAubergine10)
            }
            branch("Mid Aubergine" to midAubergine) {
                branch("100%" to midAubergine100)
                branch("90%" to midAubergine90)
                branch("80%" to midAubergine80)
                branch("70%" to midAubergine70)
                branch("60%" to midAubergine60)
                branch("50%" to midAubergine50)
                branch("45%" to midAubergine45)
                branch("40%" to midAubergine40)
                branch("35%" to midAubergine35)
                branch("30%" to midAubergine30)
                branch("25%" to midAubergine25)
                branch("20%" to midAubergine20)
                branch("15%" to midAubergine15)
                branch("10%" to midAubergine10)
            }
            branch("Dark Aubergine" to darkAubergine) {
                branch("100%" to darkAubergine100)
                branch("90%" to darkAubergine90)
                branch("80%" to darkAubergine80)
                branch("70%" to darkAubergine70)
                branch("60%" to darkAubergine60)
                branch("50%" to darkAubergine50)
                branch("45%" to darkAubergine45)
                branch("40%" to darkAubergine40)
                branch("35%" to darkAubergine35)
                branch("30%" to darkAubergine30)
                branch("25%" to darkAubergine25)
                branch("20%" to darkAubergine20)
                branch("15%" to darkAubergine15)
                branch("10%" to darkAubergine10)
            }
        }
        branch("Neutral" to null) {
            branch("Warm Grey" to warmGrey) {
                branch("100%" to warmGrey100)
                branch("90%" to warmGrey90)
                branch("80%" to warmGrey80)
                branch("70%" to warmGrey70)
                branch("60%" to warmGrey60)
                branch("50%" to warmGrey50)
                branch("45%" to warmGrey45)
                branch("40%" to warmGrey40)
                branch("35%" to warmGrey35)
                branch("30%" to warmGrey30)
                branch("25%" to warmGrey25)
                branch("20%" to warmGrey20)
                branch("15%" to warmGrey15)
                branch("10%" to warmGrey10)
            }
            branch("Cool Gray" to coolGray)
            branch("Text Gray" to textGray)
        }
    }
}
