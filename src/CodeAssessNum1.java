import java.util.Scanner;

public class CodeAssessNum1 {

    public static void main (String[] args) {

        Scanner user_input = new Scanner(System.in);

        int[] numArray = new int[10];
        int oddNum = 0, evenNum = 0,answer;

        for(int i = 0; i < numArray.length; i++){
            numArray[i] = user_input.nextInt();

            if (numArray[i] % 2 == 0) {
                evenNum++;
            } else {
                oddNum++;
            }

        }

            answer = evenNum - oddNum;

            if (answer < 0) {
                answer = answer*-1;
            }

            System.out.println(answer);
    }
}
