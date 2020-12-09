package xyz.ralxyz.qscmobile.concept

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import xyz.ralxyz.qscmobile.concept.databinding.CourseDetailsBinding

class CourseDetailsActivity : AppCompatActivity() {
    private var score: Double = 2.7
    private var quantity: Int = 1
    private lateinit var binding: CourseDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_details)
        binding = CourseDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.score.text = score.toString()
        binding.dontKnow.text = quantity.toString()

        binding.button.setOnClickListener {
            this.score -= 0.3
            binding.score.text = String.format("%.1f", this.score)
        }

        binding.plus.setOnClickListener {
            if (quantity < 100) {
                ++quantity
                binding.dontKnow.text = quantity.toString()
            }
        }

        binding.minus.setOnClickListener {
            if (quantity > 0) {
                --quantity
                binding.dontKnow.text = quantity.toString()
            }
        }
    }

    fun quitActivity(view: View) {
        finish()
        // overridePendingTransition(R.anim.zoom_in, R.anim.zoom_in)
    }
}