package scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("What word do you want to get the value for?");
            Word wordInput = new Word(br.readLine());
            System.out.println("Calculating value...");
            System.out.println("The value of *" + wordInput.toString() + "* is: " + wordInput.calculateScores());
        } catch (
                IOException e) {
            System.out.println("IO Exception");
        }
    }
}
