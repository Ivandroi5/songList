package com.example.musictop.entities

data class Music(
    val id: String,
    val songArtist: String,
    val number: String,
    val time: Long = 0,
    val link: String
) {
    companion object {
        val dataMusics = mutableListOf<Music>(
            Music(id = "e0", songArtist = "If I Ever Feel Better- Phoenix", number = "1",
                link = "<iframe width=\"100%\" height=\"!00%\" src=\"https://www.youtube.com/embed/ub36ffWAqgQ?si=PfrTBAyFAmCKuDUU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" referrerpolicy=\"strict-origin-when-cross-origin\" allowfullscreen></iframe>"),
            Music(id = "e1", songArtist = "Cold Cold Man - Saint Motel", number = "2", link = ""),
            Music(id = "e2", songArtist = "You Know You're Right - Nirvana", number = "3", link = ""),
            Music(id = "e3", songArtist = "Paradox - S.S.T.P.", number = "4", link = ""),
            Music(id = "e4", songArtist = "Dragon Screamer - DaPump", number = "5", link = ""),
            Music(id = "e5", songArtist = "TouchOff - UVERworld", number = "6", link = ""),
            Music(id = "e6", songArtist = "Flaming Hot Cheetos - Clairo", number = "7", link = ""),
            Music(id = "e7", songArtist = "Hadaka no Yusha - Vaundy", number = "8", link = ""),
            Music(id = "e8", songArtist = "Kakatte koi yo - NakamuraEmi", number = "9", link = ""),
            Music(id = "e9", songArtist = "Smile Bomb - Hohoeminobakudan", number = "10", link = ""),
            Music(id = "e10", songArtist = "Lo malo de ser bueno - Cuarteto de Nos", number = "11", link = ""),
            Music(id = "e11", songArtist = "Navy Blue - T.S.S.F.", number = "12", link = ""),
            Music(id = "e12", songArtist = "Don´t Go Avay - Oasis", number = "13", link = ""),
            Music(id = "e13", songArtist = "Arrow of time (reprise) - C.B. ", number = "14", link = ""),
            Music(id = "e14", songArtist = "Goodbye Feat.TokoAsako - Toe", number = "15", link = ""),
            Music(id = "e15", songArtist = "Candles - Daughter", number = "16", link = ""),
            Music(id = "e16", songArtist = "Beast One feat.tooko - Muse Dash", number = "17", link = ""),
            Music(id = "e17", songArtist = "This is home - Cavetown", number = "18", link = ""),
            Music(id = "e18", songArtist = "Hysteria - Muse", number = "19", link = ""),
            Music(id = "e19", songArtist = "Devils Never Cry - DMC", number = "20", link = ""),
            Music(id = "e20", songArtist = "Wings - Eden", number = "21", link = ""),
            Music(id = "e21", songArtist = "Creep - Stone Temple Pilots", number = "22", link = ""),
            Music(id = "e22", songArtist = "Volatile Times - IAMX", number = "23", link = ""),
            Music(id = "e23", songArtist = "Kimi no uta - Haruka Nakamura", number = "24", link = ""),

        )

        val dataEmpty = mutableListOf<Music>()
    }
}