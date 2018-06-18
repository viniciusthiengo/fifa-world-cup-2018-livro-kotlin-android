package thiengo.com.br.fifaworldcup2018.domain

import java.util.*

class Game(
        val group: String,
        val countryA: Country,
        val countryB: Country,
        val dateTime: Date,
        val stadium: String) {

    fun generateGroupLabel() = "Grupo $group"

    fun generateDateTimeLabel(): String {
        var gameTime = "${dateTime.getDayOfMonthLabel()}/"
        gameTime += dateTime.getMonthLabel()
        gameTime += " às ${dateTime.getHourOfDayLabel()}:"
        gameTime += dateTime.getMinuteLabel()

        return gameTime
    }
}