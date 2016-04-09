package br.unicap.cardgame.model;

public class Subject {

    private int ID;
    private String name;
    private Question question;

    public Subject(int ID, String name, Question question) {
        this.ID = ID;
        this.name = name;
        this.question = question;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "{" 
                    + "ID:" + ID + ","
                    + "name:" + name + ","
                    + "question:" + question 
                + "}";
    }
    
    
}
