package exam_july_2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = "";
        String name = "";
        int maxGoals = 0;
        while (true) {
            if (maxGoals >= 10) {
                break;
            }

            input = console.nextLine();
            if (input.equals("END")) {
                break;
            }
            int goals = Integer.parseInt(console.nextLine());
            if (goals > maxGoals) {
                maxGoals = goals;
                name = input;
            }
        }

        if (maxGoals >= 3) {
            System.out.printf("%s is the best player!\nHe has scored %d goals and made a hat-trick !!!", name, maxGoals);
        } else {
            System.out.printf("%s is the best player!\nHe has scored %d goals.", name, maxGoals);
        }
    }
}
