package for_loop_exercise;

import java.util.Scanner;

public class DivideWithoutRemainder {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int size = Integer.parseInt(console.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 0; i < size; i++){
            double number = Double.parseDouble(console.nextLine());
            if(number % 2 == 0){
                p1++;
            }

            if(number % 3 == 0){
                p2++;
            }

            if (number % 4 == 0){
                p3++;
            }
        }

        String percent = "%";
        System.out.printf("%.2f%s\n", 100 * p1 / size,percent);
        System.out.printf("%.2f%s\n", 100 * p2 / size,percent);
        System.out.printf("%.2f%s\n", 100 * p3 / size,percent);
    }
}
