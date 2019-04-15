package test.com.testbutterknife

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import test.com.lib2.Activity2


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, Activity2::class.java))
        }
    }
}
