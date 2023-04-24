import java.util.Arrays;

public class PigLatin {

    /*
    PIG LATIN

    This Program allows user to enter a phrase and converts it into Pig Latin.
    The Structure of the word is the First Character of a Word, will be moved to the
    Last Part of the Word. The letters "AY" will be added at the end, next to the First
    Character. Non Letters and Numbers will retain their spot.

    EX: HELLO WORLD !
    PL: ELLOHAY ORLDWAY !
     */

    public static void main(String[] args) {

        String answer;

        //Test Inputs
        answer = PigLatin.pigIt("Pig latin is cool");
        System.out.println(answer);

        answer = PigLatin.pigIt("This is my string");
        System.out.println(answer);
    }

    public static String pigIt(String str) {

        //INITIALIZATION
        String[] stringArray = str.split(" "), formattedWords = new String[stringArray.length];
        char firstLetter;
        String otherWords, finalWord = "";

        for(int i = 0; i < stringArray.length; i++) {

            if((!Character.isLetterOrDigit(stringArray[i].charAt(0)))) {
                //Check if Input is NOT a letter or number
                //If NOT, character will be assigned to the array
                formattedWords[i] = stringArray[i];

            } else {

                //If letter or Number, First Character will be Isolated
                firstLetter = stringArray[i].charAt(0);

                //Succeeding Characters will be isolated as well
                otherWords = stringArray[i].substring(1);

                //Succeeding Characters will be in Front, followed by First Character, Plus "AY"
                formattedWords[i] = otherWords + firstLetter + "ay";

            }

            finalWord = Arrays.toString(formattedWords).replace("[","").replace("]","").replace(" ","").replace(","," ");

        }

        //Returns Pig Latin Word
        return finalWord;
    }
}
