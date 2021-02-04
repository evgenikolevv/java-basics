package while_loop_lab;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        String password = console.nextLine();
        String input = console.nextLine();

        while(!input.equals(password)){
            input = console.nextLine();
        }

        System.out.printf("Welcome %s!",name);
    }
}
