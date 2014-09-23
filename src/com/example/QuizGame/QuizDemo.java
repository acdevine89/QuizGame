package com.example.QuizGame;
import java.util.Scanner;

public class QuizDemo {

    public static void main(String[] args) {
        QuizQuestion newQuestion;
        Scanner user = new Scanner(System.in);
        ScoreKeeper aScoreKeeper = new ScoreKeeper();

        System.out.println("Hello, let's build a quiz!");
        System.out.print("How many questions would you like to create? Type a number: ");
        int userNumberofQuestions = user.nextInt();

        for (int i = 0; i<userNumberofQuestions; i++)
        {
            System.out.print("Give me a question: ");
            String userQuestion = ("What is my name?");

            System.out.print("Now answer that question: ");
            String userAnswer = ("Annie");

            newQuestion = new QuizQuestion(userQuestion, userAnswer);
            quizSeries.add(newQuestion);
        }

        for (Quiz currentQuestion : quizSeries)
        {
            System.out.println(newQuestion.getQuestion());
            System.out.print("Type your answer here: ");
        }


//        if (userAnswer.contains(myQuestion.getWordAnswer()))
//        {
//            System.out.println("Correct!");
//        }
//        else
//        {
//            System.out.println("Nope");
//        }


    }

}
