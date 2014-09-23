package com.example.QuizGame;

public class ScoreKeeper {

private int quizScore = 0;

public void increaseScore()
    {
        quizScore++;
    }

public void decreaseScore()
    {
        if (quizScore>0)
        {
            quizScore--;
        }

        if (quizScore==0)
        {
            System.out.println();
        }

    }

public void finalScore()
    {
        System.out.println();
        System.out.println("Your final score is: " + quizScore);
    }

}
