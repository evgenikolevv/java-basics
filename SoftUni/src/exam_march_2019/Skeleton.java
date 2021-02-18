package exam_march_2019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minutes = Integer.parseInt(console.nextLine());
        int seconds = Integer.parseInt(console.nextLine());
        double lengthMeters = Double.parseDouble(console.nextLine());
        int secondsPassed = Integer.parseInt(console.nextLine());

        double controla = minutes * 60 + seconds;
        double slowed = lengthMeters / 120;
        double slowedTime = slowed * 2.5;
        double time = ((lengthMeters / 100) * secondsPassed) - slowedTime;

        if (controla < time) {
            double diff = Math.abs(controla - time);
            System.out.printf("No, Marin failed! He was %.3f second slower.", diff);
        }else {
            System.out.printf("Marin Bangiev won an Olympic quota!\nHis time is %.3f.",time);
        }
    }
}
