package cl.malditosnakamas.persistenciadedatos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import cl.malditosnakamas.persistenciadedatos.main.MainNavigator
import cl.malditosnakamas.persistenciadedatos.main.MainPreferences

class MainActivity : AppCompatActivity() {

    private val mainNavigator = MainNavigator()
    private val mainPreferences = MainPreferences()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (mainPreferences.isFirstOpenApp(this)) {
            mainPreferences.isFirstOpenApp(this)
            mainNavigator.goToBienvenida(supportFragmentManager)
        } else {
            mainNavigator.goToHome(supportFragmentManager)
        }
    }
}