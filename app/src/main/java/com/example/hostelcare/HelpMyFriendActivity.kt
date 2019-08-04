package com.example.hostelcare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_help_my_friend.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import java.net.URL

class HelpMyFriendActivity : AppCompatActivity() {

    lateinit var RadioGroup: RadioGroup
    lateinit var Homesick: RadioButton
    lateinit var Lonely: RadioButton
    lateinit var Depressed: RadioButton
    lateinit var Ragged: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help_my_friend)
    }
    fun hmsf(v: View)
    {
        var pno=editText4.text.toString()
        var msg=editText5.text.toString()
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
            val result = URL("http://jnncealumni.org/hostel/helpme.php?uid="+uid+"&pno="+pno+"&msg="+msg).readText()
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
