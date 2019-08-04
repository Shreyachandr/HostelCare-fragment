package com.example.hostelcare

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_admin.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class AdminActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admin)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val list: ArrayList<HelpData> = arrayListOf()
        doAsync {
            val result = URL("http://jnncealumni.org/hostel/slist.php").readText()
            uiThread {
                try {
                    //toast(result)
                    var result: List<String> = result.split("/").map { it.trim() }
                    result.forEach {
                        println(it)



                    val parts = it.split("#")

                        list.add(
                            HelpData(
                                parts[0],
                                "Student:" + parts[1],
                                "Phone-No:" + parts[2],
                                "Message:" + parts[3],
                                "Date:" + parts[4]
                            )
                        )

                        recyclerView.adapter = HelpAdapter(list)
                    }

                } catch (e: Exception) {

                    //toast(e.toString());
                }
            }

        }
    }
}
