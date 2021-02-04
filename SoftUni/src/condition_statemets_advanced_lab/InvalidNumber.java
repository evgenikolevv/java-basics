package condition_statemets_advanced_lab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if(number >= 100 && number <= 200 || number == 0){

        }else{
            System.out.println("invalid");
        }
    }
}
