package ruckustboom.palette

// https://www.carbondesignsystem.com/guidelines/color/overview/
public object Carbon : ColorPalette {
    // Neutral
    public val black: String = "000000"
    public val white: String = "FFFFFF"

    // Red
    public val red100: String = "2D0709"
    public val red90: String = "520408"
    public val red80: String = "750E13"
    public val red70: String = "A2191F"
    public val red60: String = "DA1E28"
    public val red50: String = "FA4D56"
    public val red40: String = "FF8389"
    public val red30: String = "FFB3B8"
    public val red20: String = "FFD7D9"
    public val red10: String = "FFF1F1"

    // Magenta
    public val magenta100: String = "2A0A18"
    public val magenta90: String = "510224"
    public val magenta80: String = "740937"
    public val magenta70: String = "9F1853"
    public val magenta60: String = "D02670"
    public val magenta50: String = "EE5396"
    public val magenta40: String = "FF7EB6"
    public val magenta30: String = "FFAFD2"
    public val magenta20: String = "FFD6E8"
    public val magenta10: String = "FFF0F7"

    // Purple
    public val purple100: String = "1C0F30"
    public val purple90: String = "31135E"
    public val purple80: String = "491D8B"
    public val purple70: String = "6929C4"
    public val purple60: String = "8A3FFC"
    public val purple50: String = "A56EFF"
    public val purple40: String = "BE95FF"
    public val purple30: String = "D4BBFF"
    public val purple20: String = "E8DAFF"
    public val purple10: String = "F6F2FF"

    // Blue
    public val blue100: String = "001141"
    public val blue90: String = "001D6C"
    public val blue80: String = "002D9C"
    public val blue70: String = "0043CE"
    public val blue60: String = "0F62FE"
    public val blue50: String = "4589FF"
    public val blue40: String = "78A9FF"
    public val blue30: String = "A6C8FF"
    public val blue20: String = "D0E2FF"
    public val blue10: String = "EDF5FF"

    // Cyan
    public val cyan100: String = "061727"
    public val cyan90: String = "012749"
    public val cyan80: String = "003A6D"
    public val cyan70: String = "00539A"
    public val cyan60: String = "0072C3"
    public val cyan50: String = "1192E8"
    public val cyan40: String = "33B1FF"
    public val cyan30: String = "82CFFF"
    public val cyan20: String = "BAE6FF"
    public val cyan10: String = "E5F6FF"

    // Teal
    public val teal100: String = "081A1C"
    public val teal90: String = "022B30"
    public val teal80: String = "004144"
    public val teal70: String = "005D5D"
    public val teal60: String = "007D79"
    public val teal50: String = "009D9A"
    public val teal40: String = "08BDBA"
    public val teal30: String = "3DDBD9"
    public val teal20: String = "9EF0F0"
    public val teal10: String = "D9FBFB"

    // Green
    public val green100: String = "071908"
    public val green90: String = "022D0D"
    public val green80: String = "044317"
    public val green70: String = "0E6027"
    public val green60: String = "198038"
    public val green50: String = "24A148"
    public val green40: String = "42BE65"
    public val green30: String = "6FDC8C"
    public val green20: String = "A7F0BA"
    public val green10: String = "DEFBE6"

    // Cool Gray
    public val coolGray100: String = "121619"
    public val coolGray90: String = "21272A"
    public val coolGray80: String = "343A3F"
    public val coolGray70: String = "4D5358"
    public val coolGray60: String = "697077"
    public val coolGray50: String = "878D96"
    public val coolGray40: String = "A2A9B0"
    public val coolGray30: String = "C1C7CD"
    public val coolGray20: String = "DDE1E6"
    public val coolGray10: String = "F2F4F8"

    // Gray
    public val gray100: String = "161616"
    public val gray90: String = "262626"
    public val gray80: String = "393939"
    public val gray70: String = "525252"
    public val gray60: String = "6F6F6F"
    public val gray50: String = "8D8D8D"
    public val gray40: String = "A8A8A8"
    public val gray30: String = "C6C6C6"
    public val gray20: String = "E0E0E0"
    public val gray10: String = "F4F4F4"

    // Warm Gray
    public val warmGray100: String = "171414"
    public val warmGray90: String = "272525"
    public val warmGray80: String = "3C3838"
    public val warmGray70: String = "565151"
    public val warmGray60: String = "726E6E"
    public val warmGray50: String = "8F8B8B"
    public val warmGray40: String = "ADA8A8"
    public val warmGray30: String = "CAC5C4"
    public val warmGray20: String = "E5E0DF"
    public val warmGray10: String = "F7F3F2"

    // Yellow
    public val yellow100: String = "1C1500"
    public val yellow90: String = "302400"
    public val yellow80: String = "483700"
    public val yellow70: String = "684E00"
    public val yellow60: String = "8E6A00"
    public val yellow50: String = "B28600"
    public val yellow40: String = "D2A106"
    public val yellow30: String = "F1C21B"
    public val yellow20: String = "FDDC69"
    public val yellow10: String = "FCF4D6"

    // Orange
    public val orange100: String = "231000"
    public val orange90: String = "3E1A00"
    public val orange80: String = "5E2900"
    public val orange70: String = "8A3800"
    public val orange60: String = "BA4E00"
    public val orange50: String = "EB6200"
    public val orange40: String = "FF832B"
    public val orange30: String = "FFB784"
    public val orange20: String = "FFD9BE"
    public val orange10: String = "FFF2E8"

    override fun toList(): List<Pair<String, String>> = listOf(
        "Black" to black,
        "White" to white,
        "Red 100" to red100,
        "Red 90" to red90,
        "Red 80" to red80,
        "Red 70" to red70,
        "Red 60" to red60,
        "Red 50" to red50,
        "Red 40" to red40,
        "Red 30" to red30,
        "Red 20" to red20,
        "Red 10" to red10,
        "Magenta 100" to magenta100,
        "Magenta 90" to magenta90,
        "Magenta 80" to magenta80,
        "Magenta 70" to magenta70,
        "Magenta 60" to magenta60,
        "Magenta 50" to magenta50,
        "Magenta 40" to magenta40,
        "Magenta 30" to magenta30,
        "Magenta 20" to magenta20,
        "Magenta 10" to magenta10,
        "Purple 100" to purple100,
        "Purple 90" to purple90,
        "Purple 80" to purple80,
        "Purple 70" to purple70,
        "Purple 60" to purple60,
        "Purple 50" to purple50,
        "Purple 40" to purple40,
        "Purple 30" to purple30,
        "Purple 20" to purple20,
        "Purple 10" to purple10,
        "Blue 100" to blue100,
        "Blue 90" to blue90,
        "Blue 80" to blue80,
        "Blue 70" to blue70,
        "Blue 60" to blue60,
        "Blue 50" to blue50,
        "Blue 40" to blue40,
        "Blue 30" to blue30,
        "Blue 20" to blue20,
        "Blue 10" to blue10,
        "Cyan 100" to cyan100,
        "Cyan 90" to cyan90,
        "Cyan 80" to cyan80,
        "Cyan 70" to cyan70,
        "Cyan 60" to cyan60,
        "Cyan 50" to cyan50,
        "Cyan 40" to cyan40,
        "Cyan 30" to cyan30,
        "Cyan 20" to cyan20,
        "Cyan 10" to cyan10,
        "Teal 100" to teal100,
        "Teal 90" to teal90,
        "Teal 80" to teal80,
        "Teal 70" to teal70,
        "Teal 60" to teal60,
        "Teal 50" to teal50,
        "Teal 40" to teal40,
        "Teal 30" to teal30,
        "Teal 20" to teal20,
        "Teal 10" to teal10,
        "Green 100" to green100,
        "Green 90" to green90,
        "Green 80" to green80,
        "Green 70" to green70,
        "Green 60" to green60,
        "Green 50" to green50,
        "Green 40" to green40,
        "Green 30" to green30,
        "Green 20" to green20,
        "Green 10" to green10,
        "Cool Gray 100" to coolGray100,
        "Cool Gray 90" to coolGray90,
        "Cool Gray 80" to coolGray80,
        "Cool Gray 70" to coolGray70,
        "Cool Gray 60" to coolGray60,
        "Cool Gray 50" to coolGray50,
        "Cool Gray 40" to coolGray40,
        "Cool Gray 30" to coolGray30,
        "Cool Gray 20" to coolGray20,
        "Cool Gray 10" to coolGray10,
        "Gray 100" to gray100,
        "Gray 90" to gray90,
        "Gray 80" to gray80,
        "Gray 70" to gray70,
        "Gray 60" to gray60,
        "Gray 50" to gray50,
        "Gray 40" to gray40,
        "Gray 30" to gray30,
        "Gray 20" to gray20,
        "Gray 10" to gray10,
        "Warm Gray 100" to warmGray100,
        "Warm Gray 90" to warmGray90,
        "Warm Gray 80" to warmGray80,
        "Warm Gray 70" to warmGray70,
        "Warm Gray 60" to warmGray60,
        "Warm Gray 50" to warmGray50,
        "Warm Gray 40" to warmGray40,
        "Warm Gray 30" to warmGray30,
        "Warm Gray 20" to warmGray20,
        "Warm Gray 10" to warmGray10,
        "Yellow 100" to yellow100,
        "Yellow 90" to yellow90,
        "Yellow 80" to yellow80,
        "Yellow 70" to yellow70,
        "Yellow 60" to yellow60,
        "Yellow 50" to yellow50,
        "Yellow 40" to yellow40,
        "Yellow 30" to yellow30,
        "Yellow 20" to yellow20,
        "Yellow 10" to yellow10,
        "Orange 100" to orange100,
        "Orange 90" to orange90,
        "Orange 80" to orange80,
        "Orange 70" to orange70,
        "Orange 60" to orange60,
        "Orange 50" to orange50,
        "Orange 40" to orange40,
        "Orange 30" to orange30,
        "Orange 20" to orange20,
        "Orange 10" to orange10,
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Firefox" to null as String?) {
        branch("Black" to black)
        branch("White" to white)
        branch("Red" to null) {
            branch("Red 100" to red100)
            branch("Red 90" to red90)
            branch("Red 80" to red80)
            branch("Red 70" to red70)
            branch("Red 60" to red60)
            branch("Red 50" to red50)
            branch("Red 40" to red40)
            branch("Red 30" to red30)
            branch("Red 20" to red20)
            branch("Red 10" to red10)
        }
        branch("Magenta" to null) {
            branch("Magenta 100" to magenta100)
            branch("Magenta 90" to magenta90)
            branch("Magenta 80" to magenta80)
            branch("Magenta 70" to magenta70)
            branch("Magenta 60" to magenta60)
            branch("Magenta 50" to magenta50)
            branch("Magenta 40" to magenta40)
            branch("Magenta 30" to magenta30)
            branch("Magenta 20" to magenta20)
            branch("Magenta 10" to magenta10)
        }
        branch("Purple" to null) {
            branch("Purple 100" to purple100)
            branch("Purple 90" to purple90)
            branch("Purple 80" to purple80)
            branch("Purple 70" to purple70)
            branch("Purple 60" to purple60)
            branch("Purple 50" to purple50)
            branch("Purple 40" to purple40)
            branch("Purple 30" to purple30)
            branch("Purple 20" to purple20)
            branch("Purple 10" to purple10)
        }
        branch("Blue" to null) {
            branch("Blue 100" to blue100)
            branch("Blue 90" to blue90)
            branch("Blue 80" to blue80)
            branch("Blue 70" to blue70)
            branch("Blue 60" to blue60)
            branch("Blue 50" to blue50)
            branch("Blue 40" to blue40)
            branch("Blue 30" to blue30)
            branch("Blue 20" to blue20)
            branch("Blue 10" to blue10)
        }
        branch("Cyan" to null) {
            branch("Cyan 100" to cyan100)
            branch("Cyan 90" to cyan90)
            branch("Cyan 80" to cyan80)
            branch("Cyan 70" to cyan70)
            branch("Cyan 60" to cyan60)
            branch("Cyan 50" to cyan50)
            branch("Cyan 40" to cyan40)
            branch("Cyan 30" to cyan30)
            branch("Cyan 20" to cyan20)
            branch("Cyan 10" to cyan10)
        }
        branch("Teal" to null) {
            branch("Teal 100" to teal100)
            branch("Teal 90" to teal90)
            branch("Teal 80" to teal80)
            branch("Teal 70" to teal70)
            branch("Teal 60" to teal60)
            branch("Teal 50" to teal50)
            branch("Teal 40" to teal40)
            branch("Teal 30" to teal30)
            branch("Teal 20" to teal20)
            branch("Teal 10" to teal10)
        }
        branch("Green" to null) {
            branch("Green 100" to green100)
            branch("Green 90" to green90)
            branch("Green 80" to green80)
            branch("Green 70" to green70)
            branch("Green 60" to green60)
            branch("Green 50" to green50)
            branch("Green 40" to green40)
            branch("Green 30" to green30)
            branch("Green 20" to green20)
            branch("Green 10" to green10)
        }
        branch("Cool Gray" to null) {
            branch("Cool Gray 100" to coolGray100)
            branch("Cool Gray 90" to coolGray90)
            branch("Cool Gray 80" to coolGray80)
            branch("Cool Gray 70" to coolGray70)
            branch("Cool Gray 60" to coolGray60)
            branch("Cool Gray 50" to coolGray50)
            branch("Cool Gray 40" to coolGray40)
            branch("Cool Gray 30" to coolGray30)
            branch("Cool Gray 20" to coolGray20)
            branch("Cool Gray 10" to coolGray10)
        }
        branch("Gray" to null) {
            branch("Gray 100" to gray100)
            branch("Gray 90" to gray90)
            branch("Gray 80" to gray80)
            branch("Gray 70" to gray70)
            branch("Gray 60" to gray60)
            branch("Gray 50" to gray50)
            branch("Gray 40" to gray40)
            branch("Gray 30" to gray30)
            branch("Gray 20" to gray20)
            branch("Gray 10" to gray10)
        }
        branch("Warm Gray" to null) {
            branch("Warm Gray 100" to warmGray100)
            branch("Warm Gray 90" to warmGray90)
            branch("Warm Gray 80" to warmGray80)
            branch("Warm Gray 70" to warmGray70)
            branch("Warm Gray 60" to warmGray60)
            branch("Warm Gray 50" to warmGray50)
            branch("Warm Gray 40" to warmGray40)
            branch("Warm Gray 30" to warmGray30)
            branch("Warm Gray 20" to warmGray20)
            branch("Warm Gray 10" to warmGray10)
        }
        branch("Yellow" to null) {
            branch("Yellow 100" to yellow100)
            branch("Yellow 90" to yellow90)
            branch("Yellow 80" to yellow80)
            branch("Yellow 70" to yellow70)
            branch("Yellow 60" to yellow60)
            branch("Yellow 50" to yellow50)
            branch("Yellow 40" to yellow40)
            branch("Yellow 30" to yellow30)
            branch("Yellow 20" to yellow20)
            branch("Yellow 10" to yellow10)
        }
        branch("Orange" to null) {
            branch("Orange 100" to orange100)
            branch("Orange 90" to orange90)
            branch("Orange 80" to orange80)
            branch("Orange 70" to orange70)
            branch("Orange 60" to orange60)
            branch("Orange 50" to orange50)
            branch("Orange 40" to orange40)
            branch("Orange 30" to orange30)
            branch("Orange 20" to orange20)
            branch("Orange 10" to orange10)
        }
    }
}
