package thiengo.com.br.fifaworldcup2018.domain

import android.os.Bundle
import com.evernote.android.state.Bundler
import java.util.*

class GameBundler: Bundler<Game> {

    override fun put(key: String, value: Game, bundle: Bundle) {
        bundle.putString("$key-01", value.group)
        bundle.putParcelable("$key-02", value.countryA)
        bundle.putParcelable("$key-03", value.countryB)
        bundle.putSerializable("$key-04", value.dateTime)
        bundle.putString("$key-05", value.stadium)
    }

    override fun get(key: String, bundle: Bundle): Game? =
        Game(
            bundle.getString("$key-01"),
            bundle.getParcelable("$key-02") as Country,
            bundle.getParcelable("$key-03") as Country,
            bundle.getSerializable("$key-04") as Date,
            bundle.getString("$key-05")
        )
}