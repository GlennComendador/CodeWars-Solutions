public class HumanReadableTime {

    public static void main(String[] args) {

        String answer;

        answer = makeReadable(3600);
        System.out.println(answer);

        answer = makeReadable(90);
        System.out.println(answer);

        answer = makeReadable(60);
        System.out.println(answer);

        answer = makeReadable(0);
        System.out.println(answer);

        answer = makeReadable(59);
        System.out.println(answer);

        answer = makeReadable(5);
        System.out.println(answer);

        answer = makeReadable(86399);
        System.out.println(answer);

        answer = makeReadable(359999);
        System.out.println(answer);

    }

    public static String makeReadable(int seconds) {

        int numSeconds = 0, numMins = 0, numHours = 0;

        if ((seconds > 359999) || (seconds < 0)) {
            return "Not valid.";
        } else {

            while(seconds >= 60) {

                seconds = seconds - 60;
                numMins++;

            }

            if(seconds < 60) {
                numSeconds = seconds;
            }

            while(numMins >= 60) {

                if(numMins < 60) {
                    break;
                }

                numMins = numMins - 60;
                numHours++;

            }

        }

        String finalSeconds = Integer.toString(numSeconds);
        String finalMins = Integer.toString(numMins);
        String finalHours =Integer.toString(numHours);

        if(Integer.toString(numSeconds).length() == 1) {
            finalSeconds = "0" + finalSeconds;
        }

        if(Integer.toString(numMins).length() == 1) {
            finalMins = "0" + finalMins;
        }

        if(Integer.toString(numHours).length() == 1) {
            finalHours = "0" + finalHours;
        }

        return (finalHours + ":" + finalMins + ":" + finalSeconds);
    }
}