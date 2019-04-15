package test.com.lib2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class Activity2: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lib2_layout)
        ButterKnife.bind(this)
    }
//    @BindView(R2.id.textview2)
//    lateinit var textView: TextView

    @OnClick(R2.id.textview2)
    fun donothing() {

    }
}