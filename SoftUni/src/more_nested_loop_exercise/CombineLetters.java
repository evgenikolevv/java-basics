package more_nested_loop_exercise;

import java.util.Scanner;

public class CombineLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char first = console.next().charAt(0);
        char second = console.next().charAt(0);
        char third = console.next().charAt(0);
        int count = 0;

        for(int i = first; i <= second; i++){
            for(int j = first; j <= second; j++){
                for(int k = first; k <= second; k++){
                    if(i != third && j != third && k != third){
                            count++;
                            System.out.printf("%c%c%c ",(char)i,(char)j,(char)k);
                    }
                }
            }
        }
        System.out.print(count);
    }
}
