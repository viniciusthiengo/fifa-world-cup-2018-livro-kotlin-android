package thiengo.com.br.fifaworldcup2018.data

import thiengo.com.br.fifaworldcup2018.R
import thiengo.com.br.fifaworldcup2018.domain.Country
import thiengo.com.br.fifaworldcup2018.domain.Game
import java.util.*


class Database {
    companion object {

        /*
         * Método responsável por simular uma base de dados mock.
         * */
        fun getGames() =
            arrayListOf<Game>(
                Game(
                    "A",
                    Country("Rússia", R.drawable.russia),
                    Country("Árabia Saudita", R.drawable.arabia_saudita),
                    Date( inMilliseconds(14,12,0) ),
                    "Luzhniki"
                ),
                Game(
                    "A",
                    Country("Egito", R.drawable.egito),
                    Country("Uruguai", R.drawable.uruguai),
                    Date( inMilliseconds(15,9,0) ),
                    "Central"
                ),
                Game(
                    "B",
                    Country("Marrocos", R.drawable.marrocos),
                    Country("Irã", R.drawable.ira),
                    Date( inMilliseconds(15,12,0) ),
                    "Krestovsky"
                ),
                Game(
                    "B",
                    Country("Espanha", R.drawable.espanha),
                    Country("Portugal", R.drawable.portugal),
                    Date( inMilliseconds(15,15,0) ),
                    "Olímpico de Fisht"
                ),
                Game(
                    "C",
                    Country("França", R.drawable.franca),
                    Country("Austrália", R.drawable.australia),
                    Date( inMilliseconds(16,7,0) ),
                    "Arena Kazan"
                ),
                Game(
                    "D",
                    Country("Argentina", R.drawable.argentina),
                    Country("Islândia", R.drawable.islandia),
                    Date( inMilliseconds(16,10,0) ),
                    "Arena Otkrytie"
                ),
                Game(
                    "C",
                    Country("Peru", R.drawable.peru),
                    Country("Dinamarca", R.drawable.dinamarca),
                    Date( inMilliseconds(16,13,0) ),
                    "Arena Mordovia"
                ),
                Game(
                    "D",
                    Country("Croácia", R.drawable.croacia),
                    Country("Nigéria", R.drawable.nigeria),
                    Date( inMilliseconds(16,16,0) ),
                    "Kaliningrad Stadium"
                ),
                Game(
                    "E",
                    Country("Costa Rica", R.drawable.costa_rica),
                    Country("Sérvia", R.drawable.servia),
                    Date( inMilliseconds(17,9,0) ),
                    "Estádio de Samara"
                ),
                Game(
                    "F",
                    Country("Alemanha", R.drawable.alemanha),
                    Country("México", R.drawable.mexico),
                    Date( inMilliseconds(17,12,0) ),
                    "Luzhniki"
                ),
                Game(
                    "E",
                    Country("Brasil", R.drawable.brasil),
                    Country("Suíça", R.drawable.suica),
                    Date( inMilliseconds(17,15,0) ),
                    "Arena Rostov"
                ),
                Game(
                    "F",
                    Country("Suécia", R.drawable.suecia),
                    Country("Coreia do Sul", R.drawable.coreia_do_sul),
                    Date( inMilliseconds(18,9,0) ),
                    "Níjni Novgorod"
                ),
                Game(
                    "G",
                    Country("Bélgica", R.drawable.belgica),
                    Country("Panamá", R.drawable.panama),
                    Date( inMilliseconds(18,12,0) ),
                    "Olímpico de Fisht"
                ),
                Game(
                    "G",
                    Country("Tunísia", R.drawable.tunisia),
                    Country("Inglaterra", R.drawable.inglaterra),
                    Date( inMilliseconds(18,15,0) ),
                    "Arena Volgogrado"
                ),
                Game(
                    "H",
                    Country("Colômbia", R.drawable.colombia),
                    Country("Japão", R.drawable.japao),
                    Date( inMilliseconds(19,9,0) ),
                    "Arena Mordovia"
                ),
                Game(
                    "H",
                    Country("Polônia", R.drawable.polonia),
                    Country("Senegal", R.drawable.senegal),
                    Date( inMilliseconds(19,12,0) ),
                    "Arena Otkrytie"
                )
            )

        /*
         * Método responsável por converter a data do jogo em milissegundos,
         * pois essa é a entrada aceita em Date.
         * */
        fun inMilliseconds(day: Int, hourOfDay: Int, minute: Int) : Long {
            val calendar = Calendar.getInstance()
            calendar.set(2018,6,day,hourOfDay,minute)
            return calendar.timeInMillis
        }
    }
}