package ruckustboom.palette

// https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/color/
@Suppress("ClassName")
public object iOS : ColorPalette {
    // Blue
    public val blueLight: String = "007AFF"
    public val blueLightAccessible: String = "0040DD"
    public val blueDark: String = "0A84FF"
    public val blueDarkAccessible: String = "409CFF"

    // Green
    public val greenLight: String = "34C759"
    public val greenLightAccessible: String = "248A3D"
    public val greenDark: String = "30D158"
    public val greenDarkAccessible: String = "30DB5B"

    // Indigo
    public val indigoLight: String = "5856D6"
    public val indigoLightAccessible: String = "3634A3"
    public val indigoDark: String = "5E5CE6"
    public val indigoDarkAccessible: String = "7D7AFF"

    // Orange
    public val orangeLight: String = "FF9500"
    public val orangeLightAccessible: String = "C93400"
    public val orangeDark: String = "FF9F0A"
    public val orangeDarkAccessible: String = "FFB340"

    // Pink
    public val pinkLight: String = "FF2D55"
    public val pinkLightAccessible: String = "D30F45"
    public val pinkDark: String = "FF375F"
    public val pinkDarkAccessible: String = "FF6482"

    // Purple
    public val purpleLight: String = "AF52DE"
    public val purpleLightAccessible: String = "8944AB"
    public val purpleDark: String = "BF5AF2"
    public val purpleDarkAccessible: String = "DA8FFF"

    // Red
    public val redLight: String = "FF3B30"
    public val redLightAccessible: String = "D70015"
    public val redDark: String = "FF453A"
    public val redDarkAccessible: String = "FF6961"

    // Teal
    public val tealLight: String = "5AC8FA"
    public val tealLightAccessible: String = "0071A4"
    public val tealDark: String = "64D2FF"
    public val tealDarkAccessible: String = "70D7FF"

    // Yellow
    public val yellowLight: String = "FFCC00"
    public val yellowLightAccessible: String = "B25000"
    public val yellowDark: String = "FFD60A"
    public val yellowDarkAccessible: String = "FFD426"

    // Gray
    public val grayLight: String = "8E8E93"
    public val grayLightAccessible: String = "6C6C70"
    public val grayDark: String = "8E8E93"
    public val grayDarkAccessible: String = "AEAEB2"

    // Gray (2)
    public val gray2Light: String = "AEAEB2"
    public val gray2LightAccessible: String = "8E8E93"
    public val gray2Dark: String = "636366"
    public val gray2DarkAccessible: String = "7C7C80"

    // Gray (3)
    public val gray3Light: String = "C7C7CC"
    public val gray3LightAccessible: String = "AEAEB2"
    public val gray3Dark: String = "48484A"
    public val gray3DarkAccessible: String = "545456"

    // Gray (4)
    public val gray4Light: String = "D1D1D6"
    public val gray4LightAccessible: String = "BCBCC0"
    public val gray4Dark: String = "3A3A3C"
    public val gray4DarkAccessible: String = "444446"

    // Gray (5)
    public val gray5Light: String = "E5E5EA"
    public val gray5LightAccessible: String = "D8D8DC"
    public val gray5Dark: String = "2C2C2E"
    public val gray5DarkAccessible: String = "363638"

    // Gray (6)
    public val gray6Light: String = "F2F2F7"
    public val gray6LightAccessible: String = "EBEBF0"
    public val gray6Dark: String = "1C1C1E"
    public val gray6DarkAccessible: String = "242426"

    // TODO: Fix names
    override fun toList(): List<Pair<String, String>> = listOf(
        "Light" to blueLight,
        "Accessible" to blueLightAccessible,
        "Dark" to blueDark,
        "Accessible" to blueDarkAccessible,
        "Light" to greenLight,
        "Accessible" to greenLightAccessible,
        "Dark" to greenDark,
        "Accessible" to greenDarkAccessible,
        "Light" to indigoLight,
        "Accessible" to indigoLightAccessible,
        "Dark" to indigoDark,
        "Accessible" to indigoDarkAccessible,
        "Light" to orangeLight,
        "Accessible" to orangeLightAccessible,
        "Dark" to orangeDark,
        "Accessible" to orangeDarkAccessible,
        "Light" to pinkLight,
        "Accessible" to pinkLightAccessible,
        "Dark" to pinkDark,
        "Accessible" to pinkDarkAccessible,
        "Light" to purpleLight,
        "Accessible" to purpleLightAccessible,
        "Dark" to purpleDark,
        "Accessible" to purpleDarkAccessible,
        "Light" to redLight,
        "Accessible" to redLightAccessible,
        "Dark" to redDark,
        "Accessible" to redDarkAccessible,
        "Light" to tealLight,
        "Accessible" to tealLightAccessible,
        "Dark" to tealDark,
        "Accessible" to tealDarkAccessible,
        "Light" to yellowLight,
        "Accessible" to yellowLightAccessible,
        "Dark" to yellowDark,
        "Accessible" to yellowDarkAccessible,
        "Light" to grayLight,
        "Accessible" to grayLightAccessible,
        "Dark" to grayDark,
        "Accessible" to grayDarkAccessible,
        "Light" to gray2Light,
        "Accessible" to gray2LightAccessible,
        "Dark" to gray2Dark,
        "Accessible" to gray2DarkAccessible,
        "Light" to gray3Light,
        "Accessible" to gray3LightAccessible,
        "Dark" to gray3Dark,
        "Accessible" to gray3DarkAccessible,
        "Light" to gray4Light,
        "Accessible" to gray4LightAccessible,
        "Dark" to gray4Dark,
        "Accessible" to gray4DarkAccessible,
        "Light" to gray5Light,
        "Accessible" to gray5LightAccessible,
        "Dark" to gray5Dark,
        "Accessible" to gray5DarkAccessible,
        "Light" to gray6Light,
        "Accessible" to gray6LightAccessible,
        "Dark" to gray6Dark,
        "Accessible" to gray6DarkAccessible
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("iOS" to null as String?) {
        branch("Blue" to blueLight) {
            branch("Light" to blueLight) {
                branch("Accessible" to blueLightAccessible)
            }
            branch("Dark" to blueDark) {
                branch("Accessible" to blueDarkAccessible)
            }
        }
        branch("Green" to greenLight) {
            branch("Light" to greenLight) {
                branch("Accessible" to greenLightAccessible)
            }
            branch("Dark" to greenDark) {
                branch("Accessible" to greenDarkAccessible)
            }
        }
        branch("Indigo" to indigoLight) {
            branch("Light" to indigoLight) {
                branch("Accessible" to indigoLightAccessible)
            }
            branch("Dark" to indigoDark) {
                branch("Accessible" to indigoDarkAccessible)
            }
        }
        branch("Orange" to orangeLight) {
            branch("Light" to orangeLight) {
                branch("Accessible" to orangeLightAccessible)
            }
            branch("Dark" to orangeDark) {
                branch("Accessible" to orangeDarkAccessible)
            }
        }
        branch("Pink" to pinkLight) {
            branch("Light" to pinkLight) {
                branch("Accessible" to pinkLightAccessible)
            }
            branch("Dark" to pinkDark) {
                branch("Accessible" to pinkDarkAccessible)
            }
        }
        branch("Purple" to purpleLight) {
            branch("Light" to purpleLight) {
                branch("Accessible" to purpleLightAccessible)
            }
            branch("Dark" to purpleDark) {
                branch("Accessible" to purpleDarkAccessible)
            }
        }
        branch("Red" to redLight) {
            branch("Light" to redLight) {
                branch("Accessible" to redLightAccessible)
            }
            branch("Dark" to redDark) {
                branch("Accessible" to redDarkAccessible)
            }
        }
        branch("Teal" to tealLight) {
            branch("Light" to tealLight) {
                branch("Accessible" to tealLightAccessible)
            }
            branch("Dark" to tealDark) {
                branch("Accessible" to tealDarkAccessible)
            }
        }
        branch("Yellow" to yellowLight) {
            branch("Light" to yellowLight) {
                branch("Accessible" to yellowLightAccessible)
            }
            branch("Dark" to yellowDark) {
                branch("Accessible" to yellowDarkAccessible)
            }
        }
        branch("Gray" to grayLight) {
            branch("Light" to grayLight) {
                branch("Accessible" to grayLightAccessible)
            }
            branch("Dark" to grayDark) {
                branch("Accessible" to grayDarkAccessible)
            }
        }
        branch("Gray (2)" to gray2Light) {
            branch("Light" to gray2Light) {
                branch("Accessible" to gray2LightAccessible)
            }
            branch("Dark" to gray2Dark) {
                branch("Accessible" to gray2DarkAccessible)
            }
        }
        branch("Gray (3)" to gray3Light) {
            branch("Light" to gray3Light) {
                branch("Accessible" to gray3LightAccessible)
            }
            branch("Dark" to gray3Dark) {
                branch("Accessible" to gray3DarkAccessible)
            }
        }
        branch("Gray (4)" to gray4Light) {
            branch("Light" to gray4Light) {
                branch("Accessible" to gray4LightAccessible)
            }
            branch("Dark" to gray4Dark) {
                branch("Accessible" to gray4DarkAccessible)
            }
        }
        branch("Gray (5)" to gray5Light) {
            branch("Light" to gray5Light) {
                branch("Accessible" to gray5LightAccessible)
            }
            branch("Dark" to gray5Dark) {
                branch("Accessible" to gray5DarkAccessible)
            }
        }
        branch("Gray (6)" to gray6Light) {
            branch("Light" to gray6Light) {
                branch("Accessible" to gray6LightAccessible)
            }
            branch("Dark" to gray6Dark) {
                branch("Accessible" to gray6DarkAccessible)
            }
        }
    }
}
