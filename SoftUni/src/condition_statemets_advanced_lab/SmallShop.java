package condition_statemets_advanced_lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String city = console.nextLine();
        float quantity = Float.parseFloat(console.nextLine());
        double priceOfCoffee = 0;
        double priceOfWater = 0;
        double priceOfBeer = 0;
        double priceOfSweets = 0;
        double priceOfPeanuts = 0;
        double result = 0;

        if(city.equals("Sofia")){
            priceOfCoffee = 0.50;
            priceOfWater = 0.80;
            priceOfBeer = 1.20;
            priceOfSweets = 1.45;
            priceOfPeanuts = 1.60;
            if(product.equals("coffee")){
                result = priceOfCoffee * quantity;
            }else if (product.equals("water")){
                result = priceOfWater * quantity;
            }else if (product.equals("beer")){
                result = priceOfBeer *quantity;
            }else if (product.equals("sweets")){
                result = priceOfSweets * quantity;
            }else if (product.equals("peanuts")){
                result = priceOfPeanuts * quantity;
            }
        }else if(city.equals("Plovdiv")){
            priceOfCoffee = 0.40;
            priceOfWater = 0.70;
            priceOfBeer = 1.15;
            priceOfSweets = 1.30;
            priceOfPeanuts = 1.50;
            if(product.equals("coffee")){
                result = priceOfCoffee * quantity;
            }else if (product.equals("water")){
                result = priceOfWater * quantity;
            }else if (product.equals("beer")){
                result = priceOfBeer *quantity;
            }else if (product.equals("sweets")){
                result = priceOfSweets * quantity;
            }else if (product.equals("peanuts")){
                result = priceOfPeanuts * quantity;
            }
        }else if(city.equals("Varna")){
            priceOfCoffee = 0.45;
            priceOfWater = 0.70;
            priceOfBeer = 1.10;
            priceOfSweets = 1.35;
            priceOfPeanuts = 1.55;
            if(product.equals("coffee")){
                result = priceOfCoffee * quantity;
            }else if (product.equals("water")){
                result = priceOfWater * quantity;
            }else if (product.equals("beer")){
                result = priceOfBeer *quantity;
            }else if (product.equals("sweets")){
                result = priceOfSweets * quantity;
            }else if (product.equals("peanuts")){
                result = priceOfPeanuts * quantity;
            }
        }

        System.out.println(result);
    }
}
