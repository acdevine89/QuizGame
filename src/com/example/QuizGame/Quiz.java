package com.example.QuizGame;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    ArrayList<QuizQuestion> quizSeries = new ArrayList<QuizQuestion>();
    Scanner user = new Scanner(System.in);
    ScoreKeeper theScoreKeeper = new ScoreKeeper();
    QuizQuestion newQuestion;

public void greetings()
 {
     System.out.println("Hello, let's build a quiz!");
 }

public void setUpQuiz()
{
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

    //Alternate strategy for setUpQuiz method with hard-coded QuizQuestion objects:
    //QuizQuestion question1 = new QuizQuestion("What is your name?", "Annie");
    //quizSeries.add(question1);
    //QuizQuestion question2 = new QuizQuestion("How many times did you see Lord of the Rings in theaters?", 60);
    //quizSeries.add(question2);

}

public void takeTheQuiz()
{
    System.out.println();
    System.out.println("Now let's test your knowledge! Take the quiz:");

    for (QuizQuestion currentQuestion : quizSeries)
    {
        System.out.println();
        System.out.println(currentQuestion.getQuestion());
        System.out.print("Type your answer here: ");
        String userDemoAnswer = user.nextLine();

        if ((userDemoAnswer.equals(currentQuestion.getWordAnswer())) || (userDemoAnswer.equals(currentQuestion.getNumericAnswer())))
        {
            System.out.println("Correct!");
            theScoreKeeper.increaseScore();
        }
        else
        {
            System.out.println("Incorrect.");
            theScoreKeeper.decreaseScore();
        }
    }

}

public void scoreTheQuiz()
{
    theScoreKeeper.finalScore();
}

}