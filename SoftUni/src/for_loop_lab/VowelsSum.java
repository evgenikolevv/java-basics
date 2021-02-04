package for_loop_lab;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            char letter = input.charAt(i);
            if(letter == input.charAt(i)){
                if(String.valueOf(letter).equals("a")){
                    sum += 1;
                }else if (String.valueOf(letter).equals("e")){
                    sum += 2;
                }else if (String.valueOf(letter).equals("i")){
                    sum += 3;
                }else if (String.valueOf(letter).equals("o")){
                    sum += 4;
                }else if (String.valueOf(letter).equals("u")){
                    sum += 5;
                }
            }
        }
        System.out.println(sum);
    }
}
