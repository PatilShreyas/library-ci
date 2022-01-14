package dev.shreyaspatil.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.shreyaspatil.autodemolib.Greeter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Greeter.greet("John Doe")
    }
}