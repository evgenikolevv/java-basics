package exam_march_2019;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int tournaments = Integer.parseInt(console.nextLine());
        int startPoints = Integer.parseInt(console.nextLine());
        int addedPoints = 0;
        int averagePoints = 0;
        double percent = 100.0 / tournaments;
        String input = "";
        int countAdded = 0;
        int countWins = 0;
        for (int i = 1; i <= tournaments; i++) {

            input = console.nextLine();
            if (input.equals("W")) {
                addedPoints = 2000;
                startPoints = startPoints + addedPoints;
                countWins++;
            } else if (input.equals("F")) {
                addedPoints = 1200;
                startPoints = startPoints + addedPoints;
            } else if (input.equals("SF")) {
                addedPoints = 720;
                startPoints = startPoints + addedPoints;
            }
            countAdded += addedPoints;
        }
        averagePoints = countAdded / tournaments;
        System.out.printf("Final points: %d\n",startPoints);
        System.out.printf("Average points: %d\n",averagePoints);
        System.out.printf("%.2f%%",(double)countWins * percent);
    }
}
