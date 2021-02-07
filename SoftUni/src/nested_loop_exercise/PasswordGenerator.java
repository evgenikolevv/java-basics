package nested_loop_exercise;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int L = Integer.parseInt(console.nextLine());

        for(int firstNumber = 1; firstNumber < n; firstNumber++){
            for(int secondNumber = 1; secondNumber < n; secondNumber++){
                for(int firstLetter = 'a'; firstLetter <'a'+ L; firstLetter++){
                    for(int secondLetter = 'a'; secondLetter < 'a' + L; secondLetter++){
                        for(int thirdNumber = 2; thirdNumber <= n; thirdNumber++){
                            if(thirdNumber > firstNumber && thirdNumber > secondNumber){
                                System.out.printf("%d%d%c%c%d ",firstNumber,secondNumber,(char)firstLetter,(char)secondLetter,thirdNumber);
                            }
                        }
                    }
                }
            }
        }
    }
}
