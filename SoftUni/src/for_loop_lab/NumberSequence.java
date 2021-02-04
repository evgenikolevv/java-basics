package for_loop_lab;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int input = Integer.parseInt(console.nextLine());
        int current = 0;
        int  min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input; i++) {
            current = Integer.parseInt(console.nextLine());

            if(current >= max){
                max = current;
            }

            if(current <= min){
                min = current;
            }

        }

        System.out.printf("Max number: %d\nMin number: %d",max,min);
    }
}
