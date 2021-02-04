package while_loop_lab;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minNumber = Integer.MAX_VALUE;
        String input = console.nextLine();

        while(!input.equals("Stop")){
            int number = Integer.parseInt(input);

            if(number < minNumber){
                minNumber = number;
            }
            input = console.nextLine();
        }

        if(input.equals("Stop")){
            System.out.println(minNumber);
        }
    }
}
