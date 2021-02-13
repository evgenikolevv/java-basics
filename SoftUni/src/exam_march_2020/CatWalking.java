package exam_march_2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int minutes = Integer.parseInt(console.nextLine());
        int walks = Integer.parseInt(console.nextLine());
        int calories = Integer.parseInt(console.nextLine());
        int sum = (minutes * walks) * 5;

        if(sum >= calories * 0.5)
            System.out.println("Yes, the walk for your cat is enough. Burned calories per day: " + sum + ".");
        else
            System.out.println("No, the walk for your cat is not enough. Burned calories per day: " + sum + ".");
    }
}
