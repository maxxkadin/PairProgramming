package scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("What word do you want to get the value for?");  //Ask the user the size
            String wordInput = br.readLine();
            System.out.println("Calculating value...");
        } catch (
                IOException e) {
            System.out.println("IO Exception");
        }

    }

}
