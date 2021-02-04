package while_loop_lab;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int maxNumber = Integer.MIN_VALUE;
        String input = console.nextLine();

        while(!input.equals("Stop")){
            int number = Integer.parseInt(input);

            if(number > maxNumber){
                maxNumber = number;
            }
            input = console.nextLine();
        }

        if(input.equals("Stop")){
            System.out.println(maxNumber);
        }
    }
}
