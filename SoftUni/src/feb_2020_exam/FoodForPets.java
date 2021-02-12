package feb_2020_exam;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int days = Integer.parseInt(console.nextLine());
        double quantity = Double.parseDouble(console.nextLine());
        double eatenFood = 0;
        double dogFood = 0;
        double catFood = 0;
        double biscuits = 0;
        for(int i = 1; i <= days; i++){
            int dog = Integer.parseInt(console.nextLine());
            int cat = Integer.parseInt(console.nextLine());
            dogFood += dog;
            catFood +=cat;
            if(i % 3 == 0){
                 double currentBiscuits = (dog + cat) * 0.1;
                 biscuits += currentBiscuits;
            }
            eatenFood += dog + cat;
        }

        System.out.printf("Total eaten biscuits: %.0fgr.\n",biscuits);
        System.out.printf("%.2f%% of the food has been eaten.\n",(eatenFood * 100) / quantity);
        System.out.printf("%.2f%% eaten from the dog.\n",(dogFood * 100) / eatenFood);
        System.out.printf("%.2f%% eaten from the cat.",(catFood * 100) / eatenFood);
    }
}
