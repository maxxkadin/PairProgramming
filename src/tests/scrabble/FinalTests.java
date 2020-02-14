package scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FinalTests {

    @Test
    void sixLetterWordTest() {
        Word testWord = new Word("change");
        assertEquals(12, testWord.calculateScores());
    }

    @Test
    void longWordTest() {
        Word testWord = new Word("Impedimenta");
        assertEquals(18, testWord.calculateScores());
    }

    @Test
    void shortWordTest() {
        Word testWord = new Word("The");
        assertEquals(6, testWord.calculateScores());
    }

    @Test
    void oneLetterTest() {
        Word testWord = new Word("A");
        assertEquals(1, testWord.calculateScores());
    }

    @Test
    void symbolTest() {
        Word testWord = new Word("!Similar #!");
        assertEquals(9, testWord.calculateScores());
    }

    @Test
    void lowerCaseTest() {
        Word testWord = new Word("walking");
        assertEquals(15, testWord.calculateScores());
    }

    @Test
    void upperCaseTest() {
        Word testWord = new Word("RUNNING");
        assertEquals(8, testWord.calculateScores());
    }
}
