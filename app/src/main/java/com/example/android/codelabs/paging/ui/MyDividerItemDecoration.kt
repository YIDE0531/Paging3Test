package com.example.android.codelabs.paging.ui

import android.R
import android.content.Context
import androidx.recyclerview.widget.RecyclerView
import android.content.res.TypedArray
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.view.View
import androidx.recyclerview.widget.RecyclerView.ItemDecoration

class MyDividerItemDecoration(context: Context) : ItemDecoration() {
    private val mDivider: Drawable?
    private val verticalInsets: Int = 20
    private val horizontalInsets: Int = 20


    override fun onDrawOver(c: Canvas, parent: RecyclerView, state: RecyclerView.State) {
        drawVertical(c, parent)
        drawHorizontal(c, parent)
    }

    /**
     * Draw dividers at each expected grid interval
     */
    private fun drawHorizontal(c: Canvas, parent: RecyclerView) {
        if (parent.childCount == 0) return
        val childCount = parent.childCount
        for (i in 0 until childCount - 1) {
            val child: View = parent.getChildAt(i)
            val params = child.getLayoutParams() as RecyclerView.LayoutParams
            var left: Int = child.getLeft() - params.leftMargin
            var right: Int = child.getRight() + params.rightMargin
            if (i % 2 == 1) {
                right -= horizontalInsets
            } else {
                left += horizontalInsets
            }
            val top: Int = child.getBottom() + params.bottomMargin
            val bottom = top + mDivider!!.intrinsicHeight
            mDivider.setBounds(left, top, right, bottom)
            mDivider.draw(c)
        }
    }

    /**
     * Draw dividers to the right of each child view
     */
    private fun drawVertical(c: Canvas, parent: RecyclerView) {
        val childCount = parent.childCount
        for (i in 0 until childCount) {
            val child: View = parent.getChildAt(i)
            val params = child.getLayoutParams() as RecyclerView.LayoutParams
            val left: Int = child.getRight() + params.rightMargin
            val right = left + mDivider!!.intrinsicWidth
            val top: Int = child.getTop() - params.topMargin + verticalInsets
            val bottom: Int = child.getBottom() + params.bottomMargin - verticalInsets
            mDivider.setBounds(left, top, right, bottom)
            mDivider.draw(c)
        }
    }

//    override fun getItemOffsets(
//        outRect: Rect,
//        view: View,
//        parent: RecyclerView,
//        state: RecyclerView.State
//    ) {
//        outRect.set(horizontalInsets, 0, horizontalInsets, 0)
//    }

    companion object {
        private val ATTRS = intArrayOf(R.attr.listDivider)
    }

    init {
        val a: TypedArray = context.obtainStyledAttributes(ATTRS)
        mDivider = a.getDrawable(0)
        a.recycle()
    }
}