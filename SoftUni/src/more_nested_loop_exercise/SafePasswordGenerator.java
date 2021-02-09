package more_nested_loop_exercise;

import java.util.Scanner;

public class SafePasswordGenerator {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());
        int max = Integer.parseInt(console.nextLine());
        int countPasswords = 0;
        int A = 35;
        int B = 64;

        for(int i = 1; i <= a; i++){
            for (int j = 1; j <= b; j++){

                if(countPasswords == max){
                    break;
                }
                if (A > 55){
                    A = 35;
                }

                if (B > 96){
                    B = 64;
                }
                System.out.print((char)A + "" + (char)B + "" + i + "" + j + "" +
                        (char)B + "" + (char)A + "|");
                A++;
                B++;
                countPasswords++;
            }
        }

    }
}
