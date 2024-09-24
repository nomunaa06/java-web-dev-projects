package org.example;

public class MultipleChoice extends Question {

    private final String[] answers = new String[4];
    private final String correctAnswer;

    public MultipleChoice(String q1,String a1, String a2, String a3, String a4, String coA){
        this.question = q1;
        answers[0] = a1;
        answers[1] = a2;
        answers[2] = a3;
        answers[3] = a4;
        this.correctAnswer = coA;
    }

    @Override
    public void displayQuestions() {

        System.out.println(question + "\n");
        for(String i : answers) {
            System.out.println(i);
        }
    }
}
