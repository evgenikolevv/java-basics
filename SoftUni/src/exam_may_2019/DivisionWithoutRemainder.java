package exam_may_2019;

import java.util.Scanner;

public class DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        double currentNumber = 0;
        double percentage = 100.0 / number;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        for (int i = 1; i <= number ; i++) {
            currentNumber = Double.parseDouble(console.nextLine());
            if (currentNumber % 4 == 0){
                p3 += percentage;
            }
            if (currentNumber % 3 == 0){
                p2 += percentage;
            }
            if (currentNumber % 2 == 0){
                p1 += percentage;
            }
        }


        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
    }
}
