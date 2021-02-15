package exam__april_2019;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        // четен брой продукти 20 % отстъпка от крайната цена

        int clients = Integer.parseInt(console.nextLine());
        String input = "";
        int countItems = 0;
        double cost = 0;
        double averageBill = 0;
        for (int i = 0; i < clients ; i++) {

            countItems = 0;
            cost = 0;
            while (true){
                input = console.nextLine();
                if (input.equals("Finish")){
                    if (countItems % 2 == 0){
                        double discount = cost * 0.20;
                        cost -= discount;

                    }
                    averageBill += cost;
                    System.out.printf("You purchased %d items for %.2f leva.\n",countItems,cost);
                    break;
                }
                if (input.equals("basket")){
                    cost += 1.50;
                }else if (input.equals("wreath")){
                    cost += 3.80;
                }else if (input.equals("chocolate bunny")){
                    cost += 7;
                }
                countItems++;
            }
        }

        averageBill = averageBill / clients;
        System.out.printf("Average bill per client is: %.2f leva.",averageBill);
    }
}
