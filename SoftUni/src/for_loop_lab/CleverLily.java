package for_loop_lab;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int age = Integer.parseInt(console.nextLine());
        double priceOfWasher = Double.parseDouble(console.nextLine());
        double toys = Double.parseDouble(console.nextLine());
        double money = 0;
        double toysMoney = 0;
        double magicMoney = 0;

        for (int i = 1; i <= age; i++){
            if(i % 2 == 0){
                money += 10 + magicMoney;
                money -= 1;
                magicMoney += 10;
            }else if (i % 2 != 0){
                toysMoney += toys;
            }
        }

        money += toysMoney;
        if(priceOfWasher <= money){
            double sum = money - priceOfWasher;
            System.out.printf("Yes! %.2f",sum);
        }else{
            double diff = priceOfWasher - money;
            System.out.printf("No! %.2f",diff);
        }

    }
}
