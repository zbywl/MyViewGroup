package com.example.myviewgroup

import android.content.Context
import android.graphics.Color
import android.util.AttributeSet
import android.view.ViewGroup

class MyViewGroup:ViewGroup {
    //
    constructor(context: Context,attributeSet: AttributeSet):super(context,attributeSet){
        setBackgroundColor(Color.BLACK)
    }

    //测量子View确定自己的最终尺寸
    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        //、先预测量自己的限制
       super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        //、测量子控件 遍历
    }


    //按照规则对自己的子控件进行布局
    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        TODO("Not yet implemented")
    }
}