package exam__april_2019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstPlayerEggs = Integer.parseInt(console.nextLine());
        int secondPlayerEggs = Integer.parseInt(console.nextLine());
        String input = "";
        while(true){
            input = console.nextLine();
            if (input.equals("End of battle")){
                System.out.printf("Player one has %d eggs left.\n",firstPlayerEggs);
                System.out.printf("Player two has %d eggs left.\n",secondPlayerEggs);
                break;
            }
            if (input.equals("one")){
                secondPlayerEggs--;
            }else if (input.equals("two")){
                firstPlayerEggs--;
            }

            if (firstPlayerEggs == 0){
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.",secondPlayerEggs);
                break;
            }else if (secondPlayerEggs == 0){
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.",firstPlayerEggs);
                break;
            }
        }
    }
}
