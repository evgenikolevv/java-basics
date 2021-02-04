package conditional_statements_advanced;

import java.util.Scanner;

public class SummerOutfit {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int degree = console.nextInt();
        String dayTime = console.next();
        String shoes = "";
        String outfit = "";

        if(dayTime.equals("Morning")){
            if (10 <= degree && degree <= 18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }else if(18 < degree && degree <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degree >= 25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }else if (dayTime.equals("Afternoon")){
            if (10 <= degree && degree <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(18 < degree && degree <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }else if (degree >= 25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }else if (dayTime.equals("Evening")){
            if (10 <= degree && degree <= 18){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if(18 < degree && degree <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            }else if (degree >= 25){
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.",degree,outfit,shoes);

    }
}
