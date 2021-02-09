package more_nested_loop_exercise;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        char lastSector = console.nextLine().charAt(0);
        int firstSector = Integer.parseInt(console.nextLine());
        int oddSeats = Integer.parseInt(console.nextLine());

        int increase = 0;
        int countSeats = 0;
        for(int i = 'A'; i <= lastSector; i++){
            for(int j = 1; j <= firstSector + increase; j++){

                if(j % 2 == 0){
                    for(int k = 'a'; k < 'a' + oddSeats + 2; k++){
                        System.out.printf("%c%d%c\n",(char)i,j,(char)k);
                        countSeats++;
                    }
                }else{
                    for(int k = 'a'; k < 'a' + oddSeats; k++){
                        System.out.printf("%c%d%c\n",(char)i,j,(char)k);
                        countSeats++;
                    }
                }
            }
            increase++;
        }
        System.out.println(countSeats);
    }
}
