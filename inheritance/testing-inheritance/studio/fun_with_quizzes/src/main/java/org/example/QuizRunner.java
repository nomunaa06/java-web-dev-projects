package org.example;


import java.util.Scanner;

public class QuizRunner {
    public static void main(String[] args) {
        int option;
        System.out.println("Welcome to quiz!");
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose quiz: 1 for Multiple choice, 2 for Checkbox, 3 for True/false: ");
        option = input.nextInt();
        if(option == 1){
            System.out.println("Welcome to Multiple choice question. There is only one correct answer. ");
            Quiz quiz1 = new Quiz();
            quiz1.setQuizNum(1);
        }
        else if(option == 2){
            System.out.println("Welcome to CheckBox question. There are few correct answers. ");
            Quiz quiz1 = new Quiz();
            quiz1.setQuizNum(2);
        }
        else if(option == 3){
            System.out.println("Welcome to True/False question.");
            Quiz quiz1 = new Quiz();
            quiz1.setQuizNum(3);
        }

    }
}