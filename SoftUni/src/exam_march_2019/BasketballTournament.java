package exam_march_2019;

import java.util.Scanner;

public class BasketballTournament {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = "";
        int countWins = 0;
        int countLosses = 0;
        int totalgames = 0;


        while (true) {
            input = console.nextLine();
            if (input.equals("End of tournaments")) {
                double percent = 100.0 / totalgames;
                System.out.printf("%.2f%% matches win\n", countWins * percent);
                System.out.printf("%.2f%% matches lost\n", countLosses * percent);
                break;
            }
            int games = Integer.parseInt(console.nextLine());
            for (int i = 1; i <= games; i++) {
                int pointsOfDesiTeam = Integer.parseInt(console.nextLine());
                int pointsOfOpponent = Integer.parseInt(console.nextLine());
                if (pointsOfDesiTeam > pointsOfOpponent) {
                    int diff = Math.abs(pointsOfDesiTeam - pointsOfOpponent);
                    System.out.printf("Game %d of tournament %s: win with %d points.\n", i, input, diff);
                    countWins++;
                } else if (pointsOfDesiTeam < pointsOfOpponent) {
                    int diff = Math.abs(pointsOfDesiTeam - pointsOfOpponent);
                    System.out.printf("Game %d of tournament %s: lost with %d points.\n", i, input, diff);
                    countLosses++;
                }
                totalgames++;
            }
        }
    }
}
