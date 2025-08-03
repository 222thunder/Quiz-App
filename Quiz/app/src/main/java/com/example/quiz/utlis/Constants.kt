package com.example.quiz.utlis

import com.example.quiz.R
import com.example.quiz.model.Question

object Constants{

    const val USER_NAME = "user_name"
    const val TOTAL_QUESTION = "total_question"
    const val SCORE = "correct_answer"
    fun getQuestions():MutableList<Question>{
        val questions = mutableListOf<Question>()
        val ques1 = Question(
            1,"Guess the logo?",
            R.drawable.apple,"Google","Microsoft",
            "Apple","Samsung",3)

        questions.add(ques1)

        val ques2 = Question(
            2,"Guess the logo?",
            R.drawable.beats,"beats","sony",
            "Apple","anker",1)

        questions.add(ques2)

        val ques3 = Question(
            3,"Guess the logo?",
            R.drawable.chanel,"Zara","Levis",
            "chanel","H&M",3)

        questions.add(ques3)

        val ques4 = Question(
            4 ,"Guess the logo?",
            R.drawable.facebook,"whatsapp","Facebook",
            "meta","instagram",2)

        questions.add(ques4)

        val ques5 = Question(
            5,"Guess the logo?",
            R.drawable.lg,"LG","Microsoft",
            "Apple","Github",1)

        questions.add(ques5)

        val quest6 = Question(
            6,"Guess the logo?",
            R.drawable.nike,"Adidas","Puma",
            "Nike","Zara",3)

        questions.add(quest6)

        val quest7 = Question(
            7,"Guess the logo?",
            R.drawable.spotify,"Apple Music","Tidal",
            "Youtube","Spotify",4)

        questions.add(quest7)

        return questions
    }
}