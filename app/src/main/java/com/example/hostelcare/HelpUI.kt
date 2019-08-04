package com.example.hostelcare

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class HelpUI : AnkoComponent<ViewGroup> {

    companion object {
        val tvTyp = 1
        val tvUSN = 2
        val tvDpno = 3
        val tvMesg = 4
        val tvDt = 5
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui) {
        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            textView {
                id = tvTyp
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "Sherlock"
                textSize = 16f // <- it is sp, no worries
                textColor = Color.BLACK
            }

            textView {
                id = tvUSN
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "2009"
                textSize = 14f
            }
            textView {
                id = tvDpno
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "2009"
                textSize = 14f
            }
            textView {
                id = tvMesg
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "2009"
                textSize = 14f
            }
            textView {
                id = tvDt
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "2009"
                textSize = 14f
            }
        }
    }

}