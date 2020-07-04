package dk.codebase.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dk.codebase.androidutils.MyUtilClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyUtilClass.MyTest()
    }
}