package com.example.hostelcare

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_nav.*
import kotlinx.android.synthetic.main.app_bar_nav.*
import org.jetbrains.anko.startActivity

class NavActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    //private var SylView: WebView? = null
    //protected fun onCreate(savedInstanceState: Bundle) {
     //   super.onCreate(savedInstanceState)
     //   setContentView(R.layout.webview)
     //   SylView = findViewById(R.id.syldisponwebview) as WebView
     //   SylView.loadUrl("file:///android_asset/Syllabus/cse/abc.html")
        //   SylView.loadUrl("file:///android_asset/cs31.html");

    //}-->

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nav)

        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
            this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()

        nav_view.setNavigationItemSelectedListener(this)
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.nav, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)
        when (item.itemId) {
            R.id.home -> {
                startActivity<NavActivity>();
                // Handle the camera action
            }
            R.id.helpme-> {
                startActivity<HelpMeActivity>();
            }
            R.id.helpmf -> {
                startActivity<HelpMyFriendActivity>();
            }
            R.id.ChiefNote -> {

                val fragment = FrChiefNote()
                transaction.add(R.id.fullscreen, fragment)
                transaction.commit()

            }
            R.id.Aboutus-> {
                startActivity<About_Activity>();
            }

        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }
}
