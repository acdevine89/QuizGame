package com.example.QuizGame;

public class QuizDemo {

    public static void main(String[] args) {
        QuizQuestion myQuestion = new QuizQuestion("What is the capitol of Michigan?", "Lansing");

        myQuestion.displayQuestion();
        myQuestion.displayWordAnswer();
    }

}
