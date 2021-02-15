package exam__april_2019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int quantity = Integer.parseInt(console.nextLine());
        int soldEggs = 0;

        String input = "";
        int numbers = 0;
        while (true) {
            input = console.nextLine();
            if (input.equals("Close")) {
                System.out.printf("Store is closed!\n%d eggs sold.", soldEggs);
                break;
            }
            numbers = Integer.parseInt(console.nextLine());

            if (input.equals("Buy")) {
                if (numbers > quantity) {
                    System.out.printf("Not enough eggs in store!\nYou can buy only %d.", quantity);
                    break;
                }
                quantity -= numbers;
                soldEggs += numbers;
            } else if (input.equals("Fill")) {
                quantity += numbers;
            }

        }
    }
}
