package test.com.lib2

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import butterknife.BindView
import butterknife.OnClick

class Lib2View @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {


//    @BindView(R2.id.textview)
//    lateinit var textView: TextView
//
//
//    @OnClick(R2.id.textview)
//    fun a() {
//
//    }
//
//    @OnClick(R2.id.textview2)
//    fun b() {
//
//    }
}