package while_loop_exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double neededMoney = Double.parseDouble(console.nextLine());
        double ownedMoney = Double.parseDouble(console.nextLine());
        int daysCounter = 0;
        int spendingCounter = 0;

        while(ownedMoney < neededMoney && spendingCounter < 5){
            String command = console.nextLine();
            double money = Double.parseDouble(console.nextLine());
            daysCounter++;

            if(command.equals("save")){
                ownedMoney += money;
                spendingCounter = 0;
            }else if (command.equals("spend")){
                ownedMoney -= money;
                spendingCounter++;

                if(ownedMoney < 0){
                    ownedMoney = 0;
                }
            }
        }

        if (spendingCounter == 5){
            System.out.println("You can't save the money.");
            System.out.println(daysCounter);
        }

        if (ownedMoney >= neededMoney){
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}
