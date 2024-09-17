package org.example

import com.google.gson.annotations.SerializedName

class Game(@SerializedName("title") val title: String, @SerializedName("thumb") val cover: String) {
    private val description = ""

    override fun toString(): String {
        return "Game: \n Title $title \n Cover $cover \n Description $description"
    }
}