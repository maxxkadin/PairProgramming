package scrabble;

public class Word {
    private String word;

    public Word( String word ) {
        this.word=word;
    }

    public char[] ChangeWordtoArray( String word ){
        char[] ArrayOfLetter =word.toCharArray();
        return ArrayOfLetter;
    }

    public int calcaluateScores (char[] array){
        int Scores=0;
        LetterValues letterValues = new LetterValues();
        for (char x:array){
            for(int i=0; i<letterValues.getLettersWorthOnePoint().length; i++){

            }

        }

    }
}
