package org.launchcode;

import java.util.Scanner;

public class SearchAlice {
    public static void main(String[] args) {
        String str = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter search word: ");
        String searchTerm = input.nextLine();
        input.close();

        Boolean b = str.toLowerCase().contains(searchTerm.toLowerCase());
        System.out.println(b+ " It's length is " + searchTerm.length() + " it is located at index of "+ str.indexOf(searchTerm));
        String newStr = str.toLowerCase().replace(searchTerm.toLowerCase(), "");
        System.out.println(newStr);

    }
}
