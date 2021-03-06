package com.example.QuizGame;

public class QuizQuestion {

    private String question;
    private String wordAnswer;
    private int numericAnswer;
    // Alternate for hard-coded QuizQuestion objects: private String evaluateNumAnswer;
//    private boolean trueOrFalseAnswer;
//    private char multipleChoiceAnswer;

//QuizQuestion Overloaded Constructors
    public QuizQuestion(String question, String wordAnswer) {
        this.question = question;
        this.wordAnswer = wordAnswer;
    }

    public QuizQuestion(String question, int numericAnswer) {
        this.question = question;
        this.numericAnswer = numericAnswer;
    }

//    public QuizQuestion(String question, boolean trueOrFalseAnswer) {
//        this.question = question;
//        this.trueOrFalseAnswer = trueOrFalseAnswer;
//    }
//
//    public QuizQuestion(String question, char multipleChoiceAnswer) {
//        this.question = question;
//        this.multipleChoiceAnswer = multipleChoiceAnswer;
    //}

//Set&Get Question
    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

//Set&Get String Answer
    public void setWordAnswer(String wordAnswer) {
        this.wordAnswer = wordAnswer;
    }

    public String getWordAnswer() {
        return wordAnswer;
    }

//Set&Get Int Answer
    public void setNumericAnswer(int numericAnswer) {
        this.numericAnswer = numericAnswer;
        //Alternate for hard-coded QuizQuestion objects: this.evaluateNumAnswer = String.valueOf(numericAnswer);
    }

    public double getNumericAnswer() {
        return numericAnswer;
    }

//Alternate for hard-coded QuizQuestion objects:
//    public String getAnswertoEvaluate()
//    {
//        return evaluateNumAnswer;
//    }

//Extra QuizQuestion types that I did not use:

////Set&Get Boolean Answer
//    public void setTrueOrFalseAnswer(boolean trueOrFalseAnswer) {
//        this.trueOrFalseAnswer = trueOrFalseAnswer;
//    }
//
//    public boolean getTrueOrFalseAnswer() {
//        return trueOrFalseAnswer;
//    }
//
////Set&Get Char Answer
//    public void setMultipleChoiceAnswer(char multipleChoiceAnswer) {
//        this.multipleChoiceAnswer = multipleChoiceAnswer;
//    }
//
//    public char getMultipleChoiceAnswer() {
//        return multipleChoiceAnswer;
//    }

}
