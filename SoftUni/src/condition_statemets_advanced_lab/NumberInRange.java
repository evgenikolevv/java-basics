package condition_statemets_advanced_lab;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if(number >= -100 && number <=100 && number != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
