package for_loop_lab;

import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        int even = 0;
        int odd = 0;
        int inputNumber = 0;
        for (int i = 0; i < input;i++){
            inputNumber = Integer.parseInt(console.nextLine());
            if (i % 2 == 0){
                even += inputNumber;
            }else{
                odd += inputNumber;
            }
        }

        if (even == odd){
            System.out.printf("Yes\nSum = %d",even);
        }else{
            System.out.printf("No\nDiff = %d",Math.abs(even - odd));
        }
    }
}
