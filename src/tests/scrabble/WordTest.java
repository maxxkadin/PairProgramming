package scrabble;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void calculateScoresTest() {
        Word testWord = new Word("adjust");
        assertEquals(14, testWord.calculateScores());
    }

    @Test
    void prepareWordForProcessingTest() {
        Word testWord = new Word("Ad#Ju*st%");
        assertEquals("adjust", testWord.prepareWordForProcessing());
    }
}