package xyz.ralxyz.qscmobile.concept

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CourseDetailsActivity : AppCompatActivity() {
    private var score: Double = 2.7

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_details)
        findViewById<TextView>(R.id.score).apply {
            text = score.toString()
        }
    }

    fun subtract(view: View) {
        score -= 0.3
        findViewById<TextView>(R.id.score).apply {
            text = String.format("%.1f", score)
        }
    }

    fun quitActivity(view: View) {
        finish()
        // overridePendingTransition(R.anim.zoom_in, R.anim.zoom_in)
    }
}