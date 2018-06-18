package thiengo.com.br.fifaworldcup2018

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.util.Log
import com.evernote.android.state.State
import com.evernote.android.state.StateSaver
import com.evernote.android.state.bundlers.BundlerListParcelable
import kotlinx.android.synthetic.main.activity_main.*
import thiengo.com.br.fifaworldcup2018.data.Database
import thiengo.com.br.fifaworldcup2018.domain.Country
import thiengo.com.br.fifaworldcup2018.domain.Game
import thiengo.com.br.fifaworldcup2018.domain.GameBundler
import java.util.*


class MainActivity : AppCompatActivity() {

    @State(BundlerListParcelable::class)
    var games: List<Game>? = null

    /*@State(GameBundler::class)
    var game = Game(
            "A",
            Country("Rússia", R.drawable.russia),
            Country("Árabia Saudita", R.drawable.arabia_saudita),
            Date(Database.inMilliseconds(14, 12, 0)),
            "Luzhniki"
    )*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StateSaver.restoreInstanceState(this, savedInstanceState)
        setContentView(R.layout.activity_main)

        //Log.i("LOG", "${game.countryA.name}")

        //game.countryA.name = "Canadá"

        if( games == null ){
            Log.i("LOG", "Lista games ainda vazia.")
            games = Database.getGames()
        }

        rv_games.setHasFixedSize(true)
        val layoutManager = LinearLayoutManager(this)
        rv_games.layoutManager = layoutManager
        rv_games.adapter = GamesAdapter(this, games!!)
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        StateSaver.saveInstanceState(this, outState)
    }
}