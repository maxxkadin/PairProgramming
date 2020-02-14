package scrabble;

public class Word {
    private String word;

    public Word( String word ) {
        this.word=word;
    }

    @Override
    public String toString() {
        return word;
    }

    public char[] ChangeWordToArray(){
        String newWord = prepareWordForProcessing();
        char[] ArrayOfLetters = newWord.toCharArray();
        return ArrayOfLetters;
    }

    public int calculateScores (){
        char[] wordArray = ChangeWordToArray();
        int scores=0;
        LetterValues letterValues = new LetterValues();
        for (char x:wordArray){
            for (char letter:letterValues.getLettersWorthOnePoint()) {
                if (x == letter){
                    scores += 1;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthTwoPoint()) {
                if (x == letter){
                    scores += 2;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthThreePoint()) {
                if (x == letter){
                    scores += 3;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthFourPoint()) {
                if (x == letter){
                    scores += 4;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthFivePoint()) {
                if (x == letter){
                    scores += 5;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthEightPoint()) {
                if (x == letter){
                    scores += 8;
                    break;
                }
            }
            for (char letter:letterValues.getLettersWorthTenPoint()) {
                if (x == letter){
                    scores += 10;
                    break;
                }
            }
        }
        return scores;
    }

    public String prepareWordForProcessing(){
        String newWord = word;
        newWord = newWord.toLowerCase();
        newWord = newWord.replaceAll("[^a-z-]", "");
        return newWord;

    }
}
