package xyz.ralxyz.qscmobile.concept

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class CourseDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_details)
    }

    fun quitActivity(view: View) {
        finish()
        // overridePendingTransition(R.anim.zoom_in, R.anim.zoom_in)
    }
}