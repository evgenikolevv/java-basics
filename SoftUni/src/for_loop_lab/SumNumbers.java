package for_loop_lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        int sum = 0;


        for (int i =0; i < input; i++){
            sum += Integer.parseInt(console.nextLine());
        }

        System.out.println(sum);

    }
}
