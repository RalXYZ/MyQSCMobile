package xyz.ralxyz.qscmobile.concept

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import xyz.ralxyz.qscmobile.concept.databinding.ActivityScoreBinding

class ScoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    private var scoreA = 0
    private var scoreB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.teamAScore.text = scoreA.toString()
        binding.teamBScore.text = scoreB.toString()

        binding.teamAAdd3.setOnClickListener {
            scoreA += 3
            binding.teamAScore.text = scoreA.toString()
        }
        binding.teamAAdd2.setOnClickListener{
            scoreA += 2
            binding.teamAScore.text = scoreA.toString()
        }
        binding.teamAAdd1.setOnClickListener {
            scoreA += 1
            binding.teamAScore.text = scoreA.toString()
        }

        binding.teamBAdd3.setOnClickListener {
            scoreB += 3
            binding.teamBScore.text = scoreB.toString()
        }
        binding.teamBAdd2.setOnClickListener{
            scoreB += 2
            binding.teamBScore.text = scoreB.toString()
        }
        binding.teamBAdd1.setOnClickListener {
            scoreB += 1
            binding.teamBScore.text = scoreB.toString()
        }

        binding.reset.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.teamAScore.text = scoreA.toString()
            binding.teamBScore.text = scoreB.toString()
        }
    }
}