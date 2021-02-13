package exam_july_2020;

import java.util.Scanner;

public class Balls {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = Integer.parseInt(console.nextLine());
        String color = "";
        int red = 0;
        int yellow = 0;
        int orange = 0;
        int white = 0;
        int black = 0;
        int otherColor = 0;
        int totalPoints = 0;
        for (int i = 0; i < N; i++){
            switch (color = console.nextLine()){
                case "red":
                    red++;
                    totalPoints += 5;
                    break;
                case "orange":
                    orange ++;
                    totalPoints += 10;
                    break;
                case "yellow":
                    yellow ++;
                    totalPoints += 15;
                    break;
                case "white":
                    white ++;
                    totalPoints += 20;
                    break;
                case "black":
                    totalPoints /= 2;
                    black++;
                    break;
                default:
                    otherColor++;
                    break;
            }
        }

        System.out.printf("Total points: %d\n",totalPoints);
        System.out.printf("Points from red balls: %d\n",red);
        System.out.printf("Points from orange balls: %d\n",orange);
        System.out.printf("Points from yellow balls: %d\n",yellow);
        System.out.printf("Points from white balls: %d\n",white);
        System.out.printf("Other colors picked: %d\n",otherColor);
        System.out.printf("Divides from black balls: %d\n",black);
    }
}
