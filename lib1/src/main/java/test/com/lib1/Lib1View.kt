package test.com.lib1

import android.content.Context
import android.util.AttributeSet
import android.widget.LinearLayout
import android.widget.TextView
import butterknife.BindView
import test.com.lib1.R2

class Lib1View @JvmOverloads constructor(
        context: Context,
        attrs: AttributeSet? = null,
        defStyle: Int = 0,
        defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyle, defStyleRes) {

    @BindView(R2.id.textview)
    lateinit var textView: TextView

}