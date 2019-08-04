package com.example.hostelcare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_help_me.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection
import java.net.URLEncoder

class HelpMeActivity : AppCompatActivity() {

    lateinit var RadioGroup: RadioGroup
    lateinit var Homesick: RadioButton
    lateinit var Lonely: RadioButton
    lateinit var Depressed: RadioButton
    lateinit var Ragged: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_me)
    }
    fun hms(v: View)
    {
        //Your authentication key
        val authkey = "YourAuthKey"
        //Multiple mobiles numbers separated by comma
        val mobiles = "9999999"
        //Sender ID,While using route4 sender id should be 6 characters long.
        val senderId = "102234"
        //Your message to send, Add URL encoding here.
        val message = "Test message"
        //define route
        val route = "default"

        var myURLConnection: URLConnection? = null
        var myURL: URL? = null
        var reader: BufferedReader? = null

        //encoding message
        val encoded_message = URLEncoder.encode(message)

        //Send SMS API
        var mainUrl = "https://aikonsms.co.in/control/smsapi.php?"

        //Prepare parameter string
        val sbPostData = StringBuilder(mainUrl)
        sbPostData.append("authkey=$authkey")
        sbPostData.append("&mobiles=$mobiles")
        sbPostData.append("&message=$encoded_message")
        sbPostData.append("&route=$route")
        sbPostData.append("&sender=$senderId")

        //final string
        mainUrl = sbPostData.toString()
        try {
            //prepare connection
            myURL = URL(mainUrl)
            myURLConnection = myURL.openConnection()
            myURLConnection!!.connect()
            reader = BufferedReader(InputStreamReader(myURLConnection.getInputStream()))
            var result=""
            var line : String? = ""
            while (line != null) {
                line = reader.readLine()
                result += line
                Log.d("RESPONSE", "" + result)
            }

            //finally close connection
            reader.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        var msg=editText3.text.toString()
        var uid=MainActivity.userid

        Homesick = findViewById(R.id.radioButton10) as RadioButton;
        Lonely = findViewById(R.id.radioButton20) as RadioButton;
        Depressed = findViewById(R.id.radioButton30) as  RadioButton;
        Ragged = findViewById(R.id.radioButton40) as RadioButton;

        if (Homesick.isChecked)
            msg = "Feeling Homesick"
        else if (Lonely.isChecked)
            msg = "Feeling Lonely"
        else if (Depressed.isChecked)
            msg = "Feeling Depressed"
        else if (Ragged.isChecked)
            msg = "Being Ragged"

        doAsync {
            val result = URL("http://nitkhostels.org/hostelcare/helpme.php?uid="+uid+"&msg="+msg).readText()
            uiThread {
                try {
                    toast(result)



                } catch (e: Exception) {

                    toast(e.toString());
                }
            }
        }
    }
}
