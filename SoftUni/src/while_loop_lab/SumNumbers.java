package while_loop_lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = Integer.parseInt(console.nextLine());

        while(sum < number){
            sum += Integer.parseInt(console.nextLine());
        }

        System.out.println(sum);
    }
}
