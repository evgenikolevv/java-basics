package for_loop_lab;

import java.util.Scanner;

public class NumbersN3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        for(int i = 1; i <= number; i+=3){
            System.out.println(i);
        }
    }
}
