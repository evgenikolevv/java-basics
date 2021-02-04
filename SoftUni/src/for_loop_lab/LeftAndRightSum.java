package for_loop_lab;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        int inputNumber = 0;
        int sumRight = 0;
        int sumLeft = 0;

        for (int i = 0; i < input * 2; i++){
            inputNumber = Integer.parseInt(console.nextLine());
            if(i < input){
                sumLeft += inputNumber;
            }else{
                sumRight += inputNumber;
            }
        }

        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d",sumLeft);
        }else{
            System.out.printf("No, diff = %d",Math.abs(sumLeft - sumRight));
        }
    }
}
