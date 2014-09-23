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
            System.out.println();
            System.out.print("Give me a question: ");
            String userQuestion = user.nextLine();

            System.out.print("Now answer that question: ");
            String userAnswer = user.nextLine();

            newQuestion = new QuizQuestion(userQuestion, userAnswer);
            quizSeries.add(newQuestion);
        }

        System.out.println();
        System.out.println("Now let's test your knowledge! Take the quiz:");

        for (QuizQuestion currentQuestion : quizSeries)
        {
            System.out.println();
            System.out.println(currentQuestion.getQuestion());
            System.out.print("Type your answer here: ");
            String userDemoAnswer = user.nextLine();

            if (userDemoAnswer.equals(currentQuestion.getWordAnswer()))
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

    System.out.println();
    System.out.println("Your final score is: " + quizScore);

    }



}
