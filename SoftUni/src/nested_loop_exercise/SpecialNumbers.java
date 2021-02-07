package nested_loop_exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        // ot 1111 do 9999
        for(int firstNumber = 1; firstNumber <= 9; firstNumber++){
            for(int secondNumber = 1; secondNumber <= 9; secondNumber++){
                for(int thirdNumber = 1; thirdNumber <= 9; thirdNumber++){
                    for(int fourthNumber = 1; fourthNumber <= 9; fourthNumber++){
                        if(number % firstNumber == 0 && number % secondNumber == 0
                                && number % thirdNumber == 0 && number % fourthNumber == 0)
                                    System.out.printf("%d%d%d%d ",firstNumber,secondNumber,thirdNumber,fourthNumber);
                        }
                    }
            }
        }
    }
}

