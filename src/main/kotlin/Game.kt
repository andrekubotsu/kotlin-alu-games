package org.example

class Game(val title: String, val cover: String) {
    private val description = ""

    override fun toString(): String {
        return "Game: \n Title $title \n Cover $cover \n Description $description"
    }
}