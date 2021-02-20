package exam_feb_2021;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int cats = Integer.parseInt(console.nextLine());
        double cost = 0;
        int smallCats = 0;
        int mediumCats = 0;
        int bigCats = 0;

        for (int i = 1; i <= cats; i++) {
            int grams = Integer.parseInt(console.nextLine());
            if (grams >= 100 & grams < 200) {
                smallCats++;
            } else if (grams >= 200 && grams < 300) {
                mediumCats++;
            } else if (grams >= 300 && grams < 400) {
                bigCats++;
            }
            cost += grams;
        }

        System.out.printf("Group 1: %d cats.\n", smallCats);
        System.out.printf("Group 2: %d cats.\n", mediumCats);
        System.out.printf("Group 3: %d cats.\n", bigCats);
        double kg = cost / 1000.0;
        System.out.printf("Price for food per day: %.2f lv.\n", kg * 12.45);
    }
}
