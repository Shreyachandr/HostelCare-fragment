package com.example.hostelcare

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.hostelcare.R.layout.activity_about_
import kotlinx.android.synthetic.main.activity_about_.*
import kotlinx.android.synthetic.main.chiefnote.*


class About_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_about_)
        val wedData: String =  "<h4><span style=\"color: #000000;\">Team Hostel Care</span></h4>\n" +
                "<hr />\n" +
                "<p>&nbsp;</p>\n" +
                "<p><strong><span style=\"color: #000000;\">Professor In charge:</span></strong></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Prof. A C Hegde,</span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Chief Warden, NITK</span></p>\n" +
                "<hr />\n" +
                "<p><strong><span style=\"color: #000000;\">Developed and Maintained by:</span></strong></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Dr. Ajay Kumar Yaday, </span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Mechanical Department.</span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Dr. Kiran M, </span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Information Technology Department.</span></p>\n" +
                "<hr />\n" +
                "<p><strong><span style=\"color: #000000;\">Thanks To:</span></strong></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp;Mr. Chetan K R, Shimoga</span></p>\n" +
                "<hr />\n" +
                "<p><strong><span style=\"color: #000000;\">For Queries Contact:</span></strong></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; Mobile Nos:&nbsp; 9886539400 , 7338513800</span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; Email ID: <a style=\"color: #000000;\" href=\"mailto:kiranmanjappa@nitk.edu.in\">kiranmanjappa@nitk.edu.in</a>&nbsp;</span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; <a style=\"color: #000000;\" href=\"mailto:ajaykyadav@nitk.edu.in\">ajaykyadav@nitk.edu.in</a></span></p>\n" +
                "<hr />\n" +
                "<p>&nbsp;</p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp;</span></p>\n" +
                "<p>&nbsp;</p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp; &nbsp; </span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp;</span></p>\n" +
                "<p><span style=\"color: #000000;\">&nbsp;</span></p>"
        val mimeType: String = "text/html"
        val utfType: String = "UTF-8"
        aboutus.loadData(wedData,mimeType,utfType)
    }
}


