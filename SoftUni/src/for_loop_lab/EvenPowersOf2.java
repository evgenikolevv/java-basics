package for_loop_lab;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int result = 1;
        for (int i =0; i <= number; i+=2){
                System.out.println(result);
                result = result * 2 * 2;
        }
    }
}
