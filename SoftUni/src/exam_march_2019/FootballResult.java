package exam_march_2019;

import java.util.Scanner;

public class FootballResult {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstMatch = console.nextLine();
        String secondMatch = console.nextLine();
        String thirdMatch = console.nextLine();

        int wins = 0;
        int losses = 0;
        int draw = 0;
        if (firstMatch.charAt(0) > firstMatch.charAt(2)) {
            wins++;
        } else if (firstMatch.charAt(0) < firstMatch.charAt(2)) {
            losses++;
        } else if (firstMatch.charAt(0) == firstMatch.charAt(2)) {
            draw++;
        }

        if (secondMatch.charAt(0) > secondMatch.charAt(2)) {
            wins++;
        } else if (secondMatch.charAt(0) < secondMatch.charAt(2)) {
            losses++;
        } else if (secondMatch.charAt(0) == secondMatch.charAt(2)) {
            draw++;
        }

        if (thirdMatch.charAt(0) > thirdMatch.charAt(2)) {
            wins++;
        } else if (thirdMatch.charAt(0) < thirdMatch.charAt(2)) {
            losses++;
        } else if (thirdMatch.charAt(0) == thirdMatch.charAt(2)) {
            draw++;
        }

        System.out.printf("Team won %d games.\n", wins);
        System.out.printf("Team lost %d games.\n", losses);
        System.out.printf("Drawn games: %d\n",draw);

    }
}
