import java.awt.*;
import java.util.*;

public class CountingDuplicates {

    /*
    DUPLICATE CHECKER
    This program checks the number of letters that has a duplicate.
     */
    public static void main(String[] args) {

        int answer;

        //Test Inputs
        answer = duplicateCount("abcde");
        System.out.println(answer);

        answer = duplicateCount("abcdea");
        System.out.println(answer);

        answer = duplicateCount("indivisibility");
        System.out.println(answer);

        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;

        answer = duplicateCount(test);
        System.out.println(answer);

    }

    public static int duplicateCount(String text) {

        //INITIALIZATION
        String newText = text.toLowerCase();
        int count = 0;

        /*
        Hash Map is used so that can be assigned as the KEY. The Number of times a letter repeated
        is then assigned as the VALUE, which will be used to check the number of letter that
        has a duplicate.
         */
        Map<Character,Integer> duplicateChecker = new HashMap<>();

        for (int i = 0; i < newText.length(); i++) {

            char character = newText.charAt(i);

            if (duplicateChecker.containsKey(character)) {
                //Counter for Duplicates
                duplicateChecker.put(character, duplicateChecker.get(character) + 1);
            } else {
                //If No Duplicates, Value is ONLY 1
                duplicateChecker.put(character, 1);
            }

        }

        for(int value: duplicateChecker.values()) {

            //Counts the Characters with Duplicates
            if(value > 1) {
                count++;
            }
        }

        //Returns the Number of Duplicates
        return count;
    }
}