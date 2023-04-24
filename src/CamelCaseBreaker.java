public class CamelCaseBreaker {

    public static void main(String[] args) {

        String answer;

        answer = camelCase("camelCasing");
        System.out.println(answer);

        answer = camelCase("camelCasingTest");
        System.out.println(answer);

        answer = camelCase("camelcasingtest");
        System.out.println(answer);
    }

    public static String camelCase(String input) {

        char[] charArray = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for(int i = 0; i < charArray.length; i++) {

            if (Character.isUpperCase(charArray[i])) {
                output.append(" ");
            }

            output.append(charArray[i]);

        }
        return output.toString();
    }

}
