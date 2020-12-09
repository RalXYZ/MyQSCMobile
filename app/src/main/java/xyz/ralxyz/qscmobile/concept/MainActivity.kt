package xyz.ralxyz.qscmobile.concept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import xyz.ralxyz.qscmobile.concept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toScore.setOnClickListener {
            startActivity(Intent(this, ScoreActivity::class.java))
        }
    }

    fun toCourseDetails(view: View) {
        startActivity(Intent(this, CourseDetailsActivity::class.java))
    }
}