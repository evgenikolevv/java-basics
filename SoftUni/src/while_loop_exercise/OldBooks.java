package while_loop_exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String  book = console.nextLine();
        int checked = 0;
        while(true){
            String input = console.nextLine();
            if(input.equals(book)){
                System.out.printf("You checked %d books and found it.",checked);
                break;
            }

            if(input.equals("No More Books")){
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.",checked);
                break;
            }
            checked++;
        }
    }
}
