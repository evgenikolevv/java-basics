package exam_march_2019;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int wantedHeight = Integer.parseInt(console.nextLine());
        int goalHeight = wantedHeight - 30;
        int countToThree = 0;
        int totalJumps = 0;

        while (true) {
            if (countToThree == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", goalHeight, totalJumps);
                break;
            }

            if (goalHeight > wantedHeight) {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", wantedHeight, totalJumps);
                break;
            }

            int height = 0;
            countToThree = 0;
            while (true) {
                height = Integer.parseInt(console.nextLine());
                totalJumps++;
                if (height > goalHeight) {
                    goalHeight += 5;
                    break;
                }
                countToThree++;
                if (countToThree == 3) {
                    break;
                }
            }
        }

    }
}
