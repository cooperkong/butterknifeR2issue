package test.com.testbutterknife

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick
import test.com.lib2.Activity2


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainactivity)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.button)
    fun donothing() {
        startActivity(Intent(this, Activity2::class.java))
    }
}
