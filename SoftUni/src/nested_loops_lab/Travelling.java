package nested_loops_lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String city = "";
        double neededMoney = 0;
        double ownedMoney = 0;
        while(true) {
            city = console.nextLine();
            if (city.equals("End")) {
                break;
            }
            neededMoney = Double.parseDouble(console.nextLine());
            ownedMoney = 0;
            while (true) {
                ownedMoney += Double.parseDouble(console.nextLine());
                if(neededMoney <= ownedMoney){
                    System.out.println("Going to " + city + "!");
                    break;
                }
            }
        }
    }
}
