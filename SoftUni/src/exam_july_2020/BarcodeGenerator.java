package exam_july_2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());

        int firstStart = start / 1000;
        int secondStart = (start / 100) % 10;
        int thirdStart = (start / 10 ) % 10;
        int fourthStart = start % 10;

        int firstEnd = end / 1000;
        int secondEnd = (end / 100) % 10;
        int thirdsEnd = (end / 10 ) % 10;
        int fourthEnd = end % 10;

        for (int j = firstStart; j <= firstEnd; j++) {
            for (int k = secondStart; k <= secondEnd; k++) {
                for (int l = thirdStart; l <= thirdsEnd; l++) {
                    for (int p = fourthStart; p <= fourthEnd; p++) {
                        if (j % 2 != 0 && k % 2 != 0 && l % 2 != 0 && p % 2 != 0) {

                                System.out.printf("%d%d%d%d ", j, k, l, p);
                        }
                    }
                }
            }
        }
    }
}
