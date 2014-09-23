package com.example.QuizGame;

public class ScoreKeeper {


public void calculateScore()
{
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


//    private int quizScore = 0;
//
// public void changeScore(boolean rightAnswer)
// {
//     if(rightAnswer)
//     {
//         quizScore++;
//     }
//     if ((quizScore>0) && (!rightAnswer))
//     {
//         quizScore--;
//     }
// }

//    public int getQuizScore() {
//        return quizScore;
//    }
//
//    public void setQuizScore(int quizScore) {
//        this.quizScore = quizScore;
//    }

}
