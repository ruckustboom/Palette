package ruckustboom.palette

// https://flatuicolors.com/palette/defo
public object FlatUI : ColorPalette {
    public val turquoise: String = "1ABC9C"
    public val greenSea: String = "16A085"
    public val emerald: String = "2ECC71"
    public val nephritis: String = "27AE60"
    public val peterRiver: String = "3498DB"
    public val belizeHole: String = "2980B9"
    public val amethyst: String = "9B59B6"
    public val wisteria: String = "8E44AD"
    public val wetAsphalt: String = "34495E"
    public val midnightBlue: String = "2C3E50"
    public val sunFlower: String = "F1C40F"
    public val orange: String = "F39C12"
    public val carrot: String = "E67E22"
    public val pumpkin: String = "D35400"
    public val alizarin: String = "E74C3C"
    public val pomegranate: String = "C0392B"
    public val clouds: String = "ECF0F1"
    public val silver: String = "BDC3C7"
    public val concrete: String = "95A5A6"
    public val asbestos: String = "7F8C8D"

    override fun toList(): List<Pair<String, String>> = listOf(
        "Turquoise" to turquoise,
        "Green Sea" to greenSea,
        "Emerald" to emerald,
        "Nephritis" to nephritis,
        "Peter River" to peterRiver,
        "Belize Hole" to belizeHole,
        "Amethyst" to amethyst,
        "Wisteria" to wisteria,
        "Wet Asphalt" to wetAsphalt,
        "Midnight Blue" to midnightBlue,
        "Sun Flower" to sunFlower,
        "Orange" to orange,
        "Carrot" to carrot,
        "Pumpkin" to pumpkin,
        "Alizarin" to alizarin,
        "Pomegranate" to pomegranate,
        "Clouds" to clouds,
        "Silver" to silver,
        "Concrete" to concrete,
        "Asbestos" to asbestos,
    )

    override fun toTree(): Tree<Pair<String, String?>> = tree("Flat UI" to null as String?) {
        branch("Turquoise" to turquoise)
        branch("Green Sea" to greenSea)
        branch("Emerald" to emerald)
        branch("Nephritis" to nephritis)
        branch("Peter River" to peterRiver)
        branch("Belize Hole" to belizeHole)
        branch("Amethyst" to amethyst)
        branch("Wisteria" to wisteria)
        branch("Wet Asphalt" to wetAsphalt)
        branch("Midnight Blue" to midnightBlue)
        branch("Sun Flower" to sunFlower)
        branch("Orange" to orange)
        branch("Carrot" to carrot)
        branch("Pumpkin" to pumpkin)
        branch("Alizarin" to alizarin)
        branch("Pomegranate" to pomegranate)
        branch("Clouds" to clouds)
        branch("Silver" to silver)
        branch("Concrete" to concrete)
        branch("Asbestos" to asbestos)
    }
}
