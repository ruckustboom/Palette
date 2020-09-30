package ruckustboom.palette

// https://design.firefox.com/photon/visuals/color.html
public object Firefox : ColorPalette {
    // Blue
    public val blue40: String = "45A1FF"
    public val blue50: String = "0A84FF"
    public val blue60: String = "0060DF"
    public val blue70: String = "003EAA"
    public val blue80: String = "002275"
    public val blue90: String = "000F40"

    // Teal
    public val teal50: String = "00FEFF"
    public val teal60: String = "00C8D7"
    public val teal70: String = "008EA4"
    public val teal80: String = "005A71"
    public val teal90: String = "002D3E"

    // Magenta
    public val magenta50: String = "FF1AD9"
    public val magenta60: String = "ED00B5"
    public val magenta70: String = "B5007F"
    public val magenta80: String = "7D004F"
    public val magenta90: String = "440027"

    // Green
    public val green50: String = "30E60B"
    public val green60: String = "12BC00"
    public val green70: String = "058B00"
    public val green80: String = "006504"
    public val green90: String = "003706"

    // Yellow
    public val yellow50: String = "FFE900"
    public val yellow60: String = "D7B600"
    public val yellow70: String = "A47F00"
    public val yellow80: String = "715100"
    public val yellow90: String = "3E2800"

    // Red
    public val red50: String = "FF0039"
    public val red60: String = "D70022"
    public val red70: String = "A4000F"
    public val red80: String = "5A0002"
    public val red90: String = "3E0200"

    // Purple
    public val purple30: String = "C069FF"
    public val purple40: String = "AD3BFF"
    public val purple50: String = "9400FF"
    public val purple60: String = "8000D7"
    public val purple70: String = "6200A4"
    public val purple80: String = "440071"
    public val purple90: String = "25003E"

    // Orange
    public val orange50: String = "FF9400"
    public val orange60: String = "D76E00"
    public val orange70: String = "A44900"
    public val orange80: String = "712B00"
    public val orange90: String = "3E1300"

    // Ink
    public val ink70: String = "363959"
    public val ink80: String = "202340"
    public val ink90: String = "0F1126"

    // Grey
    public val grey10: String = "F9F9FA"
    public val grey20: String = "EDEDF0"
    public val grey30: String = "D7D7DB"
    public val grey40: String = "B1B1B3"
    public val grey50: String = "737373"
    public val grey60: String = "4A4A4F"
    public val grey70: String = "38383D"
    public val grey80: String = "2A2A2E"
    public val grey90: String = "0C0C0D"

    // White
    public val white100: String = "FFFFFF"

    override fun toList(): List<Pair<String, String>> = listOf(
        "Blue 40" to blue40,
        "Blue 50" to blue50,
        "Blue 60" to blue60,
        "Blue 70" to blue70,
        "Blue 80" to blue80,
        "Blue 90" to blue90,
        "Teal 50" to teal50,
        "Teal 60" to teal60,
        "Teal 70" to teal70,
        "Teal 80" to teal80,
        "Teal 90" to teal90,
        "Magenta 50" to magenta50,
        "Magenta 60" to magenta60,
        "Magenta 70" to magenta70,
        "Magenta 80" to magenta80,
        "Magenta 90" to magenta90,
        "Green 50" to green50,
        "Green 60" to green60,
        "Green 70" to green70,
        "Green 80" to green80,
        "Green 90" to green90,
        "Yellow 50" to yellow50,
        "Yellow 60" to yellow60,
        "Yellow 70" to yellow70,
        "Yellow 80" to yellow80,
        "Yellow 90" to yellow90,
        "Red 50" to red50,
        "Red 60" to red60,
        "Red 70" to red70,
        "Red 80" to red80,
        "Red 90" to red90,
        "Purple 30" to purple30,
        "Purple 40" to purple40,
        "Purple 50" to purple50,
        "Purple 60" to purple60,
        "Purple 70" to purple70,
        "Purple 80" to purple80,
        "Purple 90" to purple90,
        "Orange 50" to orange50,
        "Orange 60" to orange60,
        "Orange 70" to orange70,
        "Orange 80" to orange80,
        "Orange 90" to orange90,
        "Ink 70" to ink70,
        "Ink 80" to ink80,
        "Ink 90" to ink90,
        "Gray 10" to grey10,
        "Gray 20" to grey20,
        "Gray 30" to grey30,
        "Gray 40" to grey40,
        "Gray 50" to grey50,
        "Gray 60" to grey60,
        "Gray 70" to grey70,
        "Gray 80" to grey80,
        "Gray 90" to grey90,
        "White 100" to white100,
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Firefox" to null as String?) {
        branch("Blue" to blue50) {
            branch("40" to blue40)
            branch("50" to blue50)
            branch("60" to blue60)
            branch("70" to blue70)
            branch("80" to blue80)
            branch("90" to blue90)
        }
        branch("Teal" to teal50) {
            branch("50" to teal50)
            branch("60" to teal60)
            branch("70" to teal70)
            branch("80" to teal80)
            branch("90" to teal90)
        }
        branch("Magenta" to magenta50) {
            branch("50" to magenta50)
            branch("60" to magenta60)
            branch("70" to magenta70)
            branch("80" to magenta80)
            branch("90" to magenta90)
        }
        branch("Green" to green50) {
            branch("50" to green50)
            branch("60" to green60)
            branch("70" to green70)
            branch("80" to green80)
            branch("90" to green90)
        }
        branch("Yellow" to yellow50) {
            branch("50" to yellow50)
            branch("60" to yellow60)
            branch("70" to yellow70)
            branch("80" to yellow80)
            branch("90" to yellow90)
        }
        branch("Red" to red50) {
            branch("50" to red50)
            branch("60" to red60)
            branch("70" to red70)
            branch("80" to red80)
            branch("90" to red90)
        }
        branch("Purple" to purple50) {
            branch("30" to purple30)
            branch("40" to purple40)
            branch("50" to purple50)
            branch("60" to purple60)
            branch("70" to purple70)
            branch("80" to purple80)
            branch("90" to purple90)
        }
        branch("Orange" to orange50) {
            branch("50" to orange50)
            branch("60" to orange60)
            branch("70" to orange70)
            branch("80" to orange80)
            branch("90" to orange90)
        }
        branch("Ink" to ink70) {
            branch("70" to ink70)
            branch("80" to ink80)
            branch("90" to ink90)
        }
        branch("Grey" to grey10) {
            branch("10" to grey10)
            branch("20" to grey20)
            branch("30" to grey30)
            branch("40" to grey40)
            branch("50" to grey50)
            branch("60" to grey60)
            branch("70" to grey70)
            branch("80" to grey80)
            branch("90" to grey90)
        }
        branch("White" to white100) {
            branch("100" to white100)
        }
    }
}
