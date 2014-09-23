package com.example.QuizGame;
import java.util.Scanner;
import java.util.ArrayList;

public class QuizDemo {

    public static void main(String[] args) {

        ArrayList<QuizQuestion> quizSeries = new ArrayList<QuizQuestion>();
        Scanner user = new Scanner(System.in);
        ScoreKeeper theScoreKeeper = new ScoreKeeper();
        QuizQuestion newQuestion;
        int quizScore = 0;

        System.out.println("Hello, let's build a quiz!");
        System.out.print("How many questions would you like to create? Type a number: ");
        int userNumberofQuestions = user.nextInt();
        user.nextLine();

        for (int i = 0; i<userNumberofQuestions; i++)
        {
            System.out.print("Give me a question: ");
            String userQuestion = user.nextLine();

            System.out.print("Now answer that question: ");
            String userAnswer = user.nextLine();

            newQuestion = new QuizQuestion(userQuestion, userAnswer);
            quizSeries.add(newQuestion);
        }


        for (QuizQuestion currentQuestion : quizSeries)
        {
            System.out.println(newQuestion.getQuestion());
            System.out.print("Type your answer here: ");
            String userDemoAnswer = user.nextLine();

            if (userDemoAnswer.equals(newQuestion.getWordAnswer()))
            {
                System.out.println("Correct!");
                quizScore++;
            }
            else
            {
                System.out.println("Incorrect.");
                quizScore--;
            }

        }

    System.out.println("Your score is: " + quizScore);

    }



}
