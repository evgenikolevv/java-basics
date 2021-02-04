package while_loop_lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double sum = 0;
        String input = console.nextLine();

        while(!input.equals("NoMoreMoney")){
            double number = Double.parseDouble(input);
            if(number > 0){
                sum += number;
               // if(number % 1 == 0){
                 //   System.out.printf("Increase: %d\n",(int)number);
                //}else{
                    System.out.printf("Increase: %.2f\n",number);
                //}
            }else{
                System.out.println("Invalid operation!");
                break;
            }
            input = console.nextLine();
        }

        System.out.printf("Total: %.2f",sum);
    }
}
