package feb_2020_exam;

import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        int totalWins = 0;
        int totalLosses = 0;
        double money = 0;
        int wins = 0;
        int losses = 0;
        double moneyForDay = 0;

        while (days > 0) {
            wins = 0;
            losses = 0;
            moneyForDay = 0;
            while (true) {
                String input = console.nextLine();
                if (input.equals("Finish")) {
                    totalLosses += losses;
                    totalWins += wins;
                    break;
                }
                if (input.equals("win")) {
                    wins++;
                    moneyForDay += 20;
                } else if (input.equals("lose")) {
                    losses++;
                }
            }
            if (wins > losses) {
                double increase = moneyForDay * 0.10;
                moneyForDay += increase;
            }
            money += moneyForDay;
            days--;
        }

        if (totalWins > totalLosses) {
            double increase = money * 0.20;
            money += increase;
            System.out.printf("You won the tournament! Total raised money: %.2f", money);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", money);
        }
    }
}
