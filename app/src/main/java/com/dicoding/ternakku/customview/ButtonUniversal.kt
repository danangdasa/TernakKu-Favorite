package com.dicoding.ternakku.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.Gravity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContextCompat
import com.dicoding.ternakku.R

class ButtonUniversal: AppCompatButton {

    private lateinit var enableBg: Drawable
    private var textColor: Int = 0

    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)

        setTextColor(textColor)
        textSize = 16f
        gravity = Gravity.CENTER
    }

    private fun init(){
        textColor = ContextCompat.getColor(context, R.color.brown2)
        enableBg = ContextCompat.getDrawable(context, R.drawable.bg_button) as Drawable
    }
}