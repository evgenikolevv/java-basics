package for_loop_lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        for (int i = 0; i <input.length(); i++){
            char letter = input.charAt(i);
            System.out.println(letter);
        }
    }
}
