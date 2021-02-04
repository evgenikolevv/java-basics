package for_loop_exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 1; i <= input; i++){
            int number = Integer.parseInt(console.nextLine());
            sum += number;

            if(number > max){
                max = number;
            }
        }

        int sumWithoutMax = sum - max;

        if (max == sumWithoutMax){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            int diff = Math.abs(max - sumWithoutMax);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }

    }
}
