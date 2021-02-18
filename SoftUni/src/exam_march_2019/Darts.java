package exam_march_2019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String input = "";
        int points = 0;
        int totalPoints = 0;
        int countShots = 0;
        int failed = 0;
        while (true) {
            input = console.nextLine();
            if (input.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", name, failed);
                break;
            }
            points = Integer.parseInt(console.nextLine());
            if (input.equals("Single")) {
                totalPoints += points;
            } else if (input.equals("Double")) {
                totalPoints += points * 2;
            } else if (input.equals("Triple")) {
                totalPoints += points * 3;
            }
            countShots++;
            if (301 < totalPoints) {
                failed++;
                countShots--;
                if (input.equals("Single")) {
                    totalPoints -= points;
                } else if (input.equals("Double")) {
                    totalPoints -= points * 2;
                } else if (input.equals("Triple")) {
                    totalPoints -= points * 3;
                }
            }

            if (totalPoints == 301) {
                System.out.printf("%s won the leg with %d shots.", name, countShots);
                break;
            }
        }
    }
}
