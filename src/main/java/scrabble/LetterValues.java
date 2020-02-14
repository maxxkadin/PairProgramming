package scrabble;

public class LetterValues {
    private char[] lettersWorthOnePoint;
    private char[] lettersWorthTwoPoint;
    private char[] lettersWorthThreePoint;
    private char[] lettersWorthFourPoint;
    private char[] lettersWorthFivePoint;
    private char[] lettersWorthEightPoint;
    private char[] lettersWorthTenPoint;

    public LetterValues(){
         String onePointLetters = "aeioulnrst";
         String twoPointLetters = "dg";
         String threePointLetters = "bcmp";
         String fourPointLetters = "fhvwy";
         String fivePointLetters = "k";
         String eightPointLetters = "jx";
         String tenPointLetters = "qz";
        lettersWorthOnePoint=onePointLetters.toCharArray();
        lettersWorthTwoPoint=twoPointLetters.toCharArray();
        lettersWorthThreePoint=threePointLetters.toCharArray();
        lettersWorthFourPoint=fourPointLetters.toCharArray();
        lettersWorthFivePoint=fivePointLetters.toCharArray();
        lettersWorthEightPoint=eightPointLetters.toCharArray();
        lettersWorthTenPoint=tenPointLetters.toCharArray();
    }

    public char[] getLettersWorthOnePoint() {
        return lettersWorthOnePoint;
    }

    public char[] getLettersWorthTwoPoint() {
        return lettersWorthTwoPoint;
    }

    public char[] getLettersWorthThreePoint() {
        return lettersWorthThreePoint;
    }

    public char[] getLettersWorthFourPoint() {
        return lettersWorthFourPoint;
    }

    public char[] getLettersWorthFivePoint() {
        return lettersWorthFivePoint;
    }

    public char[] getLettersWorthEightPoint() {
        return lettersWorthEightPoint;
    }

    public char[] getLettersWorthTenPoint() {
        return lettersWorthTenPoint;
    }
}
