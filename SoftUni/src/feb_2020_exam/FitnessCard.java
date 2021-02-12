package feb_2020_exam;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double money = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String sport = console.nextLine();
        double price = 0;

        if(sex.equals("m")){
            if (sport.equals("Gym")){
                price = 42;
            }else if (sport.equals("Boxing")){
                price = 41;
            }else if (sport.equals("Yoga")){
                price = 45;
            }else if (sport.equals("Zumba")){
                price = 34;
            }else if (sport.equals("Dances")){
                price = 51;
            }else if (sport.equals("Pilates")){
                price = 39;
            }
        }else if (sex.equals("f")){
            if (sport.equals("Gym")){
                price = 35;
            }else if (sport.equals("Boxing")){
                price = 37;
            }else if (sport.equals("Yoga")){
                price = 42;
            }else if (sport.equals("Zumba")){
                price = 31;
            }else if(sport.equals("Dances")){
                price = 53;
            }else if (sport.equals("Pilates")){
                price = 39;
            }
        }

        if (age <= 19){
            double discount = price * 0.20;
            price -= discount;
            if (money >= price){
                System.out.printf("You purchased a 1 month pass for %s.",sport);
            }else{
                double diff = price - money;
                System.out.printf("You don't have enough money! You need $%.2f more.",diff);
            }
        }else{
            if (money >= price){
                System.out.printf("You purchased a 1 month pass for %s.",sport);
            }else{
                double diff = price - money;
                System.out.printf("You don't have enough money! You need $%.2f more.",diff);
            }
        }
    }
}
