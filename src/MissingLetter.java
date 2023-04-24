public class MissingLetter {

    /*
    MISSING LETTER FINDER

    This program finds the missing letter in a given section of the alphabet
    inputted to the function. Program distinguishes UPPERCASE from lowercase.
     */

    public static void main(String[] args) {

        char answer;

        //Test Inputs
        answer = findMissingLetter(new char[] { 'a','b','c','d','f' });
        System.out.println(answer);

        answer = findMissingLetter(new char[] { 'O','Q','R','S' });
        System.out.println(answer);

    }
    public static char findMissingLetter(char[] array) {

        //INITIALIZATION
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String arrayFromChar = String.copyValueOf(array);
        String temp = "";
        char letter = ' ';

        for(int i = 0; i < arrayFromChar.length(); i++) {

            //FINDS THE POSITION OF INPUTTED GROUP OF LETTERS IN THE ALPHABET THEN ASSIGNS
            //IT TO VARIABLE TEMP FOR USE IN SEARCHING IN NEXT BLOCK OF CODE IF MATCHED

            if ((arrayFromChar.charAt(i) == alphabet.charAt(i)) || (arrayFromChar.charAt(i) != upperAlphabet.charAt(i))) {
                temp = arrayFromChar.substring(i);
                break;
            }

        }

        if(Character.isUpperCase(temp.charAt(0))) {

            //If UPPERCASE letters, program will use UPPERCASE Alphabet Reference
            for(int i = 0; i < temp.length(); i++) {

                char x = upperAlphabet.charAt(i + upperAlphabet.indexOf(temp.charAt(0)));

                //If a character doesn't match the Alphabet Reference, it will stop the loop and
                //assign it to the variable
                if(x != temp.charAt(i)) {
                    letter = x;
                    break;
                }

            }

        } else {

            //If lowercase letters, program will use lowercase Alphabet Reference
            for(int j = 0; j < temp.length(); j++) {

                char y = alphabet.charAt(j + alphabet.indexOf(temp.charAt(0)));

                //If a character doesn't match the Alphabet Reference, it will stop the loop and
                //assign it to the variable
                if(y != temp.charAt(j)) {
                    letter = y;
                    break;
                }

            }

        }

        //Returns the Answer
        return letter;
    }
}