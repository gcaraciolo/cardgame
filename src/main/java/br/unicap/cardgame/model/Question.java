package br.unicap.cardgame.model;

import java.util.List;

public class Question {
 
    private int ID;
    private String text;
    private List<Answer> possibleAnswers;
    private Answer correctAnswer;

    public Question(int ID, String text, List<Answer> possibleAnswers, Answer correctAnswer) {
        this.ID = ID;
        this.text = text;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<Answer> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(List<Answer> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String toString() {
        return "{" 
                    + "ID:" + ID + ","
                    + "text:" + text + ","
                    + "possibleAnswers:" + possibleAnswers + ","
                    + "correctAnswer:" + correctAnswer 
                + "}";
    }
    
    
}
