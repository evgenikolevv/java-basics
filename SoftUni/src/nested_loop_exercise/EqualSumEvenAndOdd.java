package nested_loop_exercise;

import java.util.Scanner;

public class EqualSumEvenAndOdd {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = Integer.parseInt(console.nextLine());
        int secondNumber = Integer.parseInt(console.nextLine());

        for(int i = firstNumber; i <= secondNumber; i++){
            String currentNum = "" + i;
            int even = 0;
            int odd = 0;
            for (int j = 0; j < currentNum.length(); j++){
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if(j % 2 == 0){
                    even += currentDigit;
                }else{
                    odd += currentDigit;
                }
            }
            if(odd == even){
                System.out.print(i + " ");
            }
        }
    }
}
