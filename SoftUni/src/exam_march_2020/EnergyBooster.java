package exam_march_2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String fruit = console.nextLine();
        String size = console.nextLine();
        int quantity = Integer.parseInt(console.nextLine());
        double price = 1;
        double sum = 0;

        if(size.equals("big")){
            price *=5;
            if(fruit.equals("Watermelon")){
                price *= 28.70;
                sum = price * quantity;
            }else if (fruit.equals("Mango")){
                price *= 19.60;
                sum = price * quantity;
            }else if (fruit.equals("Pineapple")){
                price *= 24.80;
                sum = price * quantity;
            }else if (fruit.equals("Raspberry")){
                price *= 15.20;
                sum = price * quantity;
            }

        }else if (size.equals("small")){
            price *= 2;
            if(fruit.equals("Watermelon")){
                price *= 56;
                sum = price * quantity;
            }else if (fruit.equals("Mango")){
                price *= 36.66;
                sum = price * quantity;
            }else if (fruit.equals("Pineapple")){
                    price *= 42.10;
                    sum = price * quantity;
            }else if (fruit.equals("Raspberry")){
                    price *= 20;
                    sum = price * quantity;
            }
        }

        if (sum > 1000){
            double discount = sum * 0.5;
            sum -= discount;
            System.out.printf("%.2f lv.",sum);
        }else if (sum >= 400 && sum <= 1000){
            double discount = sum * 0.15;
            sum -= discount;
            System.out.printf("%.2f lv.",sum);
        }else {
            System.out.printf("%.2f lv.",sum);
        }
    }
}
