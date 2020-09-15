package com.example.viewpager2focus

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import com.google.android.material.textfield.TextInputLayout
import com.google.android.material.theme.overlay.MaterialThemeOverlay

/**
 * A subclass so we can overwrite onAttachedToWindow / onDetachedFromWindow
 */
class MyTextInputLayout : TextInputLayout {

    private val TAG = "MyTextInputLayout"
    private val viewName : String = resources.getResourceName((id))

    constructor(context: Context): this(context, null)

    constructor(context: Context, attrs: AttributeSet?): this(context, attrs, R.attr.textInputStyle)

    constructor(context: Context, attrs: AttributeSet?, defStyleAttribute: Int): super(
            MaterialThemeOverlay.wrap(context, attrs, defStyleAttribute, com.google.android.material.R.style.Widget_Design_TextInputLayout),
            attrs,
            defStyleAttribute)

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        Log.d(TAG, "onAttachedToWindow (View $viewName)")
    }

    override fun onDetachedFromWindow() {
        super.onDetachedFromWindow()
        Log.d(TAG, "onDetachedFromWindow (View $viewName)")
    }


}