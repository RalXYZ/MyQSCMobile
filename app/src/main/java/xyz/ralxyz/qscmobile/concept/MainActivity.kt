package xyz.ralxyz.qscmobile.concept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toCourseDetails(view: View) {
        startActivity(Intent(this, CourseDetailsActivity::class.java))
    }
}