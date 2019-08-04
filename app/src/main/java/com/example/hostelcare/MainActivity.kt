package com.example.hostelcare

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.chiefnote.*
import kotlinx.android.synthetic.main.content_nav.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread
import java.net.URL

class MainActivity : AppCompatActivity() {


    companion object
    {
        var userid="";
        var username="";
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
       // val log=sharedPreference.getString("uid","")
       // if(log!="")
       // {

        //    MainActivity.userid = log;

       // }

        startActivity<NavActivity>();

        val wedData: String =  "<body><font size = +1> <span style = \"color:blue\" p{text-align: center;}> <br> Be the change you want to see in the world </span> </font></body>"
        val mimeType: String = "text/html"
        val utfType: String = "UTF-8"
        //editText4.autofillHints="Kiran";
        quote.loadData(wedData,mimeType,utfType)

        val wedData1: String =  "<body><font size = +1> <span style = \"color:blue\" p{text-align: center;}> <br> Wardens and Hostel Information </span> </font></body>"
        val mimeType1: String = "text/html"
        val utfType1: String = "UTF-8"
        wardens.loadData(wedData1,mimeType1,utfType1)



    }
   // fun auth(v: View)
   // {
      // var uid=editText.text.toString()
      // var pwd=editText2.text.toString()
     //   doAsync {
         //   val result = URL("http://jnncealumni.org/hostel/student_auth.php?uid="+uid+"&pwd="+pwd).readText()
       //     uiThread {
         //       try {
                    //toast(result)

           //         if (result=="Not Authenticated")
             //       {
               //         toast("Wrong credentials")

                //    }
                  //  else {
                    //    if (result == "Admin") {
           //                 startActivity<AdminActivity>();
                      //  } else {
                        //    val sharedPreference =  getSharedPreferences("PREFERENCE_NAME", Context.MODE_PRIVATE)
                         //   var editor = sharedPreference.edit()
                          //  editor.putString("uid",uid)
                           // editor.commit()
                            //MainActivity.username = result
                            //MainActivity.userid = uid;
             //               startActivity<NavActivity>();
                        //}
                    //}

               // } catch (e: Exception) {

                 //   toast(e.toString());
                //}
            //}
        //}
    //}



}
