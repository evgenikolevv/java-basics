package exam_feb_2021;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int locations = Integer.parseInt(console.nextLine());

        for (int i = 0; i < locations; i++) {
            double extraction = 0;
            double averageGold = Double.parseDouble(console.nextLine());
            int days = Integer.parseInt(console.nextLine());
            for (int j = 1; j <= days; j++) {
                double yield = Double.parseDouble(console.nextLine());
                extraction += yield;
            }
            extraction /= days;
            if (extraction >= averageGold){
                System.out.printf("Good job! Average gold per day: %.2f.\n",extraction);
            }else if (extraction < averageGold){
                double difference = Math.abs(extraction - averageGold);
                System.out.printf("You need %.2f gold.\n",difference);
            }
        }
    }
}
