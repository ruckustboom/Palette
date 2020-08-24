package ruckustboom.palette

// https://developer.gnome.org/hig/stable/icon-design.html.en
public object Gnome3 : ColorPalette {
    public val blue1: String = "99C1F1"
    public val blue2: String = "62A0EA"
    public val blue3: String = "3584E4"
    public val blue4: String = "1C71D8"
    public val blue5: String = "1A5FB4"

    public val green1: String = "8FF0A4"
    public val green2: String = "57E389"
    public val green3: String = "33D17A"
    public val green4: String = "2EC27E"
    public val green5: String = "26A269"

    public val yellow1: String = "F9F06B"
    public val yellow2: String = "F8E45C"
    public val yellow3: String = "F6D32D"
    public val yellow4: String = "F5C211"
    public val yellow5: String = "E5A50A"

    public val orange1: String = "FFBE6F"
    public val orange2: String = "FFA348"
    public val orange3: String = "FF7800"
    public val orange4: String = "E66100"
    public val orange5: String = "C64600"

    public val red1: String = "F66151"
    public val red2: String = "ED333B"
    public val red3: String = "E01B24"
    public val red4: String = "C01C28"
    public val red5: String = "A51D2D"

    public val purple1: String = "DC8ADD"
    public val purple2: String = "C061CB"
    public val purple3: String = "9141AC"
    public val purple4: String = "813D9C"
    public val purple5: String = "613583"

    public val brown1: String = "CDAB8F"
    public val brown2: String = "B5835A"
    public val brown3: String = "986A44"
    public val brown4: String = "865E3C"
    public val brown5: String = "63452C"

    public val light1: String = "FFFFFF"
    public val light2: String = "F6F5F4"
    public val light3: String = "DEDDDA"
    public val light4: String = "C0BFBC"
    public val light5: String = "9A9996"

    public val dark1: String = "77767B"
    public val dark2: String = "5E5C64"
    public val dark3: String = "3D3846"
    public val dark4: String = "241F31"
    public val dark5: String = "000000"

    private fun <T> branch(t: T): T = t

    // TODO: Fix names
    override fun toList(): List<Pair<String, String>> = listOf(
        "1" to blue1,
        "2" to blue2,
        "3" to blue3,
        "4" to blue4,
        "5" to blue5,
        "1" to green1,
        "2" to green2,
        "3" to green3,
        "4" to green4,
        "5" to green5,
        "1" to yellow1,
        "2" to yellow2,
        "3" to yellow3,
        "4" to yellow4,
        "5" to yellow5,
        "1" to orange1,
        "2" to orange2,
        "3" to orange3,
        "4" to orange4,
        "5" to orange5,
        "1" to red1,
        "2" to red2,
        "3" to red3,
        "4" to red4,
        "5" to red5,
        "1" to purple1,
        "2" to purple2,
        "3" to purple3,
        "4" to purple4,
        "5" to purple5,
        "1" to brown1,
        "2" to brown2,
        "3" to brown3,
        "4" to brown4,
        "5" to brown5,
        "1" to light1,
        "2" to light2,
        "3" to light3,
        "4" to light4,
        "5" to light5,
        "1" to dark1,
        "2" to dark2,
        "3" to dark3,
        "4" to dark4,
        "5" to dark5
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Gnome 3" to null as String?) {
        branch("Blue" to blue3) {
            branch("1" to blue1)
            branch("2" to blue2)
            branch("3" to blue3)
            branch("4" to blue4)
            branch("5" to blue5)
        }
        branch("Green" to green3) {
            branch("1" to green1)
            branch("2" to green2)
            branch("3" to green3)
            branch("4" to green4)
            branch("5" to green5)
        }
        branch("Yellow" to yellow3) {
            branch("1" to yellow1)
            branch("2" to yellow2)
            branch("3" to yellow3)
            branch("4" to yellow4)
            branch("5" to yellow5)
        }
        branch("Orange" to orange3) {
            branch("1" to orange1)
            branch("2" to orange2)
            branch("3" to orange3)
            branch("4" to orange4)
            branch("5" to orange5)
        }
        branch("Red" to red3) {
            branch("1" to red1)
            branch("2" to red2)
            branch("3" to red3)
            branch("4" to red4)
            branch("5" to red5)
        }
        branch("Purple" to purple3) {
            branch("1" to purple1)
            branch("2" to purple2)
            branch("3" to purple3)
            branch("4" to purple4)
            branch("5" to purple5)
        }
        branch("Brown" to brown3) {
            branch("1" to brown1)
            branch("2" to brown2)
            branch("3" to brown3)
            branch("4" to brown4)
            branch("5" to brown5)
        }
        branch("Light" to light1) {
            branch("1" to light1)
            branch("2" to light2)
            branch("3" to light3)
            branch("4" to light4)
            branch("5" to light5)
        }
        branch("Dark" to dark5) {
            branch("1" to dark1)
            branch("2" to dark2)
            branch("3" to dark3)
            branch("4" to dark4)
            branch("5" to dark5)
        }
    }
}
