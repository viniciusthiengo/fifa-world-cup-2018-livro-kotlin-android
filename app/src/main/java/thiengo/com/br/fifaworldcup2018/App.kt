package thiengo.com.br.fifaworldcup2018

import android.app.Application
import com.evernote.android.state.StateSaver

class App: Application() {

    override fun onCreate() {
        super.onCreate()
        StateSaver.setEnabledForAllActivitiesAndSupportFragments(this, true)
    }
}