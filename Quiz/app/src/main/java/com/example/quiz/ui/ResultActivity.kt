package com.example.quiz.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.quiz.MainActivity
import com.example.quiz.R
import com.example.quiz.utlis.Constants
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    private lateinit var textViewScore : TextView
    private lateinit var textViewName : TextView

    private lateinit var finishButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        textViewScore=findViewById(R.id.tv_score)
        textViewName=findViewById(R.id.tv_username)
        finishButton=findViewById(R.id.btn_finish)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTION,0)
        val score = intent.getStringExtra(Constants.SCORE)
        val name = intent.getStringExtra(Constants.USER_NAME)

        textViewScore.text = "Your Score is $score out of $totalQuestions"
        textViewName.text = name

        finishButton.setOnClickListener{
            Intent(this, MainActivity::class.java).also{
            startActivity (it)}
        }
    }
}