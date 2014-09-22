package com.example.QuizGame;

public class QuizQuestion {

    private String question;
    private String wordAnswer;
    private double numericAnswer;
    private boolean trueOrFalseAnswer;
    private char multipleChoiceAnswer;

    public QuizQuestion(String question, String wordAnswer)
    {
        this.question = question;
        this.wordAnswer = wordAnswer;
    }

    public QuizQuestion(String question, double numericAnswer)
    {
        this.question = question;
        this.numericAnswer = numericAnswer;
    }

    public QuizQuestion(String question, boolean trueOrFalseAnswer)
    {
        this.question = question;
        this.trueOrFalseAnswer = trueOrFalseAnswer;
    }

    public QuizQuestion(String question, char multipleChoiceAnswer)
    {
        this.question = question;
        this.multipleChoiceAnswer = multipleChoiceAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void displayQuestion()
    {
        System.out.println("The question is " + question);
    }

    public String getWordAnswer() {
        return wordAnswer;
    }

    public void setWordAnswer(String wordAnswer) {
        this.wordAnswer = wordAnswer;
    }

    public void displayWordAnswer()
    {
        System.out.println("The answer is " + wordAnswer);
    }

    public double getNumericAnswer() {
        return numericAnswer;
    }

    public void setNumericAnswer(double numericAnswer) {
        this.numericAnswer = numericAnswer;
    }

    public boolean isTrueOrFalseAnswer() {
        return trueOrFalseAnswer;
    }

    public void setTrueOrFalseAnswer(boolean trueOrFalseAnswer) {
        this.trueOrFalseAnswer = trueOrFalseAnswer;
    }

    public char getMultipleChoiceAnswer() {
        return multipleChoiceAnswer;
    }

    public void setMultipleChoiceAnswer(char multipleChoiceAnswer) {
        this.multipleChoiceAnswer = multipleChoiceAnswer;
    }
}
