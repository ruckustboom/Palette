package ruckustboom.palette

// https://elementary.io/docs/human-interface-guidelines#color
public object ElementaryOS : ColorPalette {
    // Strawberry
    public val strawberry100: String = "FF8C82"
    public val strawberry300: String = "ED5353"
    public val strawberry500: String = "C6262E"
    public val strawberry700: String = "A10705"
    public val strawberry900: String = "7A0000"
    public val strawberry: String get() = strawberry500

    // Orange
    public val orange100: String = "FFC27D"
    public val orange300: String = "FFA154"
    public val orange500: String = "F37329"
    public val orange700: String = "CC3B02"
    public val orange900: String = "A62100"
    public val orange: String get() = orange500

    // Banana
    public val banana100: String = "FFF394"
    public val banana300: String = "FFE16B"
    public val banana500: String = "F9C440"
    public val banana700: String = "D48E15"
    public val banana900: String = "AD5F00"
    public val banana: String get() = banana500

    // Lime
    public val lime100: String = "D1FF82"
    public val lime300: String = "9BDB4D"
    public val lime500: String = "68B723"
    public val lime700: String = "3A9104"
    public val lime900: String = "206B00"
    public val lime: String get() = lime500

    // Mint
    public val mint100: String = "89FFDD"
    public val mint300: String = "43D6B5"
    public val mint500: String = "28BCA3"
    public val mint700: String = "0E9A83"
    public val mint900: String = "007367"
    public val mint: String get() = mint500

    // Blueberry
    public val blueberry100: String = "8CD5FF"
    public val blueberry300: String = "64BAFF"
    public val blueberry500: String = "3689E6"
    public val blueberry700: String = "0D52BF"
    public val blueberry900: String = "002E99"
    public val blueberry: String get() = blueberry500

    // Grape
    public val grape100: String = "E4C6FA"
    public val grape300: String = "CD9EF7"
    public val grape500: String = "A56DE2"
    public val grape700: String = "7239B3"
    public val grape900: String = "452981"
    public val grape: String get() = grape500

    // Bubblegum
    public val bubblegum100: String = "FE9AB8"
    public val bubblegum300: String = "F4679D"
    public val bubblegum500: String = "DE3E80"
    public val bubblegum700: String = "BC245D"
    public val bubblegum900: String = "910E38"
    public val bubblegum: String get() = bubblegum500

    // Cocoa
    public val cocoa100: String = "A3907C"
    public val cocoa300: String = "8A715E"
    public val cocoa500: String = "715344"
    public val cocoa700: String = "57392D"
    public val cocoa900: String = "3D211B"
    public val cocoa: String get() = cocoa500

    // Silver
    public val silver100: String = "FAFAFA"
    public val silver300: String = "D4D4D4"
    public val silver500: String = "ABACAE"
    public val silver700: String = "7E8087"
    public val silver900: String = "555761"
    public val silver: String get() = silver500

    // Slate
    public val slate100: String = "95A3AB"
    public val slate300: String = "667885"
    public val slate500: String = "485A6C"
    public val slate700: String = "273445"
    public val slate900: String = "0E141F"
    public val slate: String get() = slate500

    // Black
    public val black100: String = "666666"
    public val black300: String = "4D4D4D"
    public val black500: String = "333333"
    public val black700: String = "1A1A1A"
    public val black900: String = "000000"
    public val black: String get() = black500

    // TODO: Fix names
    override fun toList(): List<Pair<String, String>> = listOf(
        "Strawberry" to strawberry,
        "Strawberry 100" to strawberry100,
        "Strawberry 300" to strawberry300,
        "Strawberry 500" to strawberry500,
        "Strawberry 700" to strawberry700,
        "Strawberry 900" to strawberry900,
        "Orange" to orange,
        "Orange 100" to orange100,
        "Orange 300" to orange300,
        "Orange 500" to orange500,
        "Orange 700" to orange700,
        "Orange 900" to orange900,
        "Banana" to banana,
        "Banana 100" to banana100,
        "Banana 300" to banana300,
        "Banana 500" to banana500,
        "Banana 700" to banana700,
        "Banana 900" to banana900,
        "Lime" to lime,
        "Lime 100" to lime100,
        "Lime 300" to lime300,
        "Lime 500" to lime500,
        "Lime 700" to lime700,
        "Lime 900" to lime900,
        "Mint" to mint,
        "Mint 100" to mint100,
        "Mint 300" to mint300,
        "Mint 500" to mint500,
        "Mint 700" to mint700,
        "Mint 900" to mint900,
        "Blueberry" to blueberry,
        "Blueberry 100" to blueberry100,
        "Blueberry 300" to blueberry300,
        "Blueberry 500" to blueberry500,
        "Blueberry 700" to blueberry700,
        "Blueberry 900" to blueberry900,
        "Grape" to grape,
        "Grape 100" to grape100,
        "Grape 300" to grape300,
        "Grape 500" to grape500,
        "Grape 700" to grape700,
        "Grape 900" to grape900,
        "Bubblegum" to bubblegum,
        "Bubblegum 100" to bubblegum100,
        "Bubblegum 300" to bubblegum300,
        "Bubblegum 500" to bubblegum500,
        "Bubblegum 700" to bubblegum700,
        "Bubblegum 900" to bubblegum900,
        "Cocoa" to cocoa,
        "Cocoa 100" to cocoa100,
        "Cocoa 300" to cocoa300,
        "Cocoa 500" to cocoa500,
        "Cocoa 700" to cocoa700,
        "Cocoa 900" to cocoa900,
        "Silver" to silver,
        "Silver 100" to silver100,
        "Silver 300" to silver300,
        "Silver 500" to silver500,
        "Silver 700" to silver700,
        "Silver 900" to silver900,
        "Slate" to slate,
        "Slate 100" to slate100,
        "Slate 300" to slate300,
        "Slate 500" to slate500,
        "Slate 700" to slate700,
        "Slate 900" to slate900,
        "Black" to black,
        "Black 100" to black100,
        "Black 300" to black300,
        "Black 500" to black500,
        "Black 700" to black700,
        "Black 900" to black900
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Elementary OS" to null as String?) {
        branch("Strawberry" to strawberry) {
            branch("100" to strawberry100)
            branch("300" to strawberry300)
            branch("500" to strawberry500)
            branch("700" to strawberry700)
            branch("900" to strawberry900)
        }
        branch("Orange" to orange) {
            branch("100" to orange100)
            branch("300" to orange300)
            branch("500" to orange500)
            branch("700" to orange700)
            branch("900" to orange900)
        }
        branch("Banana" to banana) {
            branch("100" to banana100)
            branch("300" to banana300)
            branch("500" to banana500)
            branch("700" to banana700)
            branch("900" to banana900)
        }
        branch("Lime" to lime) {
            branch("100" to lime100)
            branch("300" to lime300)
            branch("500" to lime500)
            branch("700" to lime700)
            branch("900" to lime900)
        }
        branch("Mint" to mint) {
            branch("100" to mint100)
            branch("300" to mint300)
            branch("500" to mint500)
            branch("700" to mint700)
            branch("900" to mint900)
        }
        branch("Blueberry" to blueberry) {
            branch("100" to blueberry100)
            branch("300" to blueberry300)
            branch("500" to blueberry500)
            branch("700" to blueberry700)
            branch("900" to blueberry900)
        }
        branch("Grape" to grape) {
            branch("100" to grape100)
            branch("300" to grape300)
            branch("500" to grape500)
            branch("700" to grape700)
            branch("900" to grape900)
        }
        branch("Bubblegum" to bubblegum) {
            branch("100" to bubblegum100)
            branch("300" to bubblegum300)
            branch("500" to bubblegum500)
            branch("700" to bubblegum700)
            branch("900" to bubblegum900)
        }
        branch("Cocoa" to cocoa) {
            branch("100" to cocoa100)
            branch("300" to cocoa300)
            branch("500" to cocoa500)
            branch("700" to cocoa700)
            branch("900" to cocoa900)
        }
        branch("Silver" to silver) {
            branch("100" to silver100)
            branch("300" to silver300)
            branch("500" to silver500)
            branch("700" to silver700)
            branch("900" to silver900)
        }
        branch("Slate" to slate) {
            branch("100" to slate100)
            branch("300" to slate300)
            branch("500" to slate500)
            branch("700" to slate700)
            branch("900" to slate900)
        }
        branch("Black" to black) {
            branch("100" to black100)
            branch("300" to black300)
            branch("500" to black500)
            branch("700" to black700)
            branch("900" to black900)
        }
    }
}
