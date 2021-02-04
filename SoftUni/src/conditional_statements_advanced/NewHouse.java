package conditional_statements_advanced;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double priceOfRoses = 5;
        double priceOfDahlias = 3.80;
        double priceOfTulips = 2.80;
        double priceOfNarcissus = 3;
        double priceOfGladiolus = 2.50;
        double finalCost = 0;
        double leftMoney = 0;
        // във входа постъпват тип цвете, брой цветя и бюджет.
        String typeOfFlowers = console.next();
        int numberOfFlowers = console.nextInt();
        int budget = console.nextInt();

        if(typeOfFlowers.equals("Roses")){
                finalCost = priceOfRoses * numberOfFlowers;
                if(numberOfFlowers > 80){
                    finalCost -= finalCost * 0.10;
                }
        }else if(typeOfFlowers.equals("Dahlias")){
            finalCost = priceOfDahlias * numberOfFlowers;
            if(numberOfFlowers > 90){
                finalCost -= finalCost * 0.15;
            }
        }else if (typeOfFlowers.equals("Tulips")){
            finalCost = priceOfTulips * numberOfFlowers;
            if (numberOfFlowers > 80){
                finalCost -= finalCost * 0.15;
            }
        }else if (typeOfFlowers.equals("Narcissus")){
                finalCost = priceOfNarcissus * numberOfFlowers;
                if (numberOfFlowers < 120){
                    finalCost += finalCost * 0.15;
                }
        }else if (typeOfFlowers.equals("Gladiolus")){
                finalCost = priceOfGladiolus * numberOfFlowers;
                if (numberOfFlowers < 80){
                    finalCost += finalCost * 0.20;
                }
        }

        if (finalCost <= budget){
            leftMoney = budget - finalCost;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numberOfFlowers,typeOfFlowers,leftMoney);
        }else{
            leftMoney = Math.abs(budget - finalCost);
            System.out.printf("Not enough money, you need %.2f leva more.",leftMoney);
        }
    }
}
