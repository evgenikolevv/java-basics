package while_loop_lab;

import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String input = console.nextLine();
        while (!input.equals("Stop")){
            System.out.println(input);
            input = console.nextLine();
        }
    }
}
