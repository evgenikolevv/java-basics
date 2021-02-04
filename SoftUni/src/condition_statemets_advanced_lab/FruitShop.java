package condition_statemets_advanced_lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String product = console.nextLine();
        String day = console.nextLine();
        float quantity = Float.parseFloat(console.nextLine());
        double priceOfBanana = 0;
        double priceOfApple = 0;
        double priceOfOrange = 0;
        double priceOfGrapefruit = 0;
        double priceOfKiwi = 0;
        double priceOfPineapple = 0;
        double priceOfGrapes = 0;
        double result = 0;

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                priceOfBanana = 2.50;
                priceOfApple = 1.20;
                priceOfOrange = 0.85;
                priceOfGrapefruit = 1.45;
                priceOfKiwi = 2.70;
                priceOfPineapple = 5.50;
                priceOfGrapes = 3.85;
                if (product.equals("banana")){
                    result = priceOfBanana * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("apple")){
                    result = priceOfApple * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("orange")){
                    result = priceOfOrange * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("grapefruit")){
                    result = priceOfGrapefruit * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("kiwi")){
                    result = priceOfKiwi * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("pineapple")){
                    result = priceOfPineapple * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("grapes")){
                    result = priceOfGrapes * quantity;
                    System.out.printf("%.2f",result);
                }else{
                    System.out.println("error");
                }


                break;
            case "Saturday":
            case "Sunday":
                priceOfBanana = 2.70;
                priceOfApple = 1.25;
                priceOfOrange = 0.90;
                priceOfGrapefruit = 1.60;
                priceOfKiwi = 3.00;
                priceOfPineapple = 5.60;
                priceOfGrapes = 4.20;
                if (product.equals("banana")){
                    result = priceOfBanana * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("apple")){
                    result = priceOfApple * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("orange")){
                    result = priceOfOrange * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("grapefruit")){
                    result = priceOfGrapefruit * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("kiwi")){
                    result = priceOfKiwi * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("pineapple")){
                    result = priceOfPineapple * quantity;
                    System.out.printf("%.2f",result);
                }else if (product.equals("grapes")){
                    result = priceOfGrapes * quantity;
                    System.out.printf("%.2f",result);
                }else{
                    System.out.println("error");
                }

                break;
            default:
                System.out.println("error");

        }
    }
}
