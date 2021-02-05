package nested_loops_lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());
        int countCombinations = 0;
        int first = 0;
        int second = 0;
        boolean exists = false;

        for(int i = firstNumber; i <= secondNumber; i++){
            for(int j = firstNumber; j <= secondNumber; j++){
                countCombinations++;
                if(i + j == magicNumber){
                    first = i;
                    second = j;
                    exists = true;
                    break;
                }
            }
            if(exists == true){
                System.out.printf("Combination N:%d ",countCombinations);
                System.out.printf("(%d + %d = %d)",first,second,magicNumber);
                break;
            }
        }

        if(exists == false){
            System.out.printf("%d combinations - neither equals %d",countCombinations,magicNumber);
        }
    }
}
