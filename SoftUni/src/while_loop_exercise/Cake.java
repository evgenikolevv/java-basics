package while_loop_exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int length = Integer.parseInt(console.nextLine());
        int width = Integer.parseInt(console.nextLine());
        int piecesOfCake = width * length;

        while(piecesOfCake > 0){
            String input = console.nextLine();
            int taken = 0;
            if(input.equals("STOP")){
                int diff = piecesOfCake;
                System.out.printf("%d pieces are left.",piecesOfCake);
                break;
            }

            taken = Integer.parseInt(input);
            if(taken > piecesOfCake){
                int diff = taken - piecesOfCake;
                System.out.printf("No more cake left! You need %d pieces more.",diff);
                break;
            }
            piecesOfCake -= taken;
        }
    }
}
