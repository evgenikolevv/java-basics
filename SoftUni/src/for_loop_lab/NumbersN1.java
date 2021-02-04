package for_loop_lab;

import java.util.Scanner;

public class NumbersN1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        for(int i = number; i >= 1; i--){
            System.out.println(i);
        }
    }
}
