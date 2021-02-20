package exam_feb_2021;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int food = Integer.parseInt(console.nextLine())* 1000;
        int foodCount = 0;
        String input = "";
        while(true){
            input = console.nextLine();
            if(input.equals("Adopted")){
                break;
            }
            int eatenFood = Integer.parseInt(input);
            foodCount += eatenFood;
            food -= eatenFood;
        }

        if (food >= 0){
            System.out.printf("Food is enough! Leftovers: %d grams.",food);
        } else if(foodCount > food){
            System.out.printf("Food is not enough. You need %d grams more.",Math.abs(food));
        }
    }
}
