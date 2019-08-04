package com.example.hostelcare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hostelcare.R.layout.chiefnote
import kotlinx.android.synthetic.main.chiefnote.*


class ChiefNote : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(chiefnote)
        val wedData: String =  "<h4><strong>Dear Students,</strong></h4>\n" +
                "<p><strong>&nbsp; &nbsp; Welcome All To NITK Hostel</strong></p>\n" +
                "<p><strong>&nbsp; &nbsp; Message from Chief Warden</strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Dr. A C Hegde</strong></p>\n" +
                "<p><strong>&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;Chief Warden</strong></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong>&nbsp;</strong></p>\n" +
                "<p>&nbsp;</p>"
        val mimeType: String = "text/html"
        val utfType: String = "UTF-8"
        wardendesk.loadData(wedData,mimeType,utfType)
    }
}


