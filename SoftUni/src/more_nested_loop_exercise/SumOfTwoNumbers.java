package more_nested_loop_exercise;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int lastNumber = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());
        int count = 0;
        boolean exists = true;
            for(int i = firstNumber; i <= lastNumber; i++){
                for(int j = firstNumber; j <= lastNumber; j++){
                    count++;
                    if( i + j == magicNumber){
                        System.out.printf("Combination N:%d (%d + %d = %d) ",count,i,j,magicNumber);
                        exists = true;
                        break;
                    }else{
                        exists = false;
                    }
                }
                if(exists){
                    break;
                }
            }

        if(!exists){
            System.out.printf("%d combinations - neither equals %d",count,magicNumber);
        }
    }
}
