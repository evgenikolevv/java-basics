package while_loop_lab;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int widhtOfFreeSpace = Integer.parseInt(console.nextLine());
        int lengthOfFreeSpace = Integer.parseInt(console.nextLine());
        int heightOfFreeSpace = Integer.parseInt(console.nextLine());
        int  cubicMeters = widhtOfFreeSpace * lengthOfFreeSpace * heightOfFreeSpace;

        while(true){
            String input = console.nextLine();
            if(input.equals("Done")){
                System.out.printf("%d Cubic meters left.",cubicMeters);
                break;
            }

            int numberOfBoxes = Integer.parseInt(input);
            cubicMeters -= numberOfBoxes;
            if(cubicMeters < 0){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(cubicMeters));
                break;
            }
        }
    }
}
