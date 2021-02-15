package exam__april_2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int numberOfEggs = Integer.parseInt(console.nextLine());
        int countRed = 0;
        int countOrange = 0;
        int countBlue = 0;
        int countGreen = 0;
        String input = "";
        for (int i = 0; i < numberOfEggs; i++) {
            input = console.nextLine();
            switch (input) {
                case "red":
                    countRed++;
                    break;
                case "orange":
                    countOrange++;
                    break;
                case "blue":
                    countBlue++;
                    break;
                case "green":
                    countGreen++;
                    break;
            }
        }

        System.out.printf("Red eggs: %d\n",countRed);
        System.out.printf("Orange eggs: %d\n",countOrange);
        System.out.printf("Blue eggs: %d\n",countBlue);
        System.out.printf("Green eggs: %d\n",countGreen);
       if (countRed > countOrange && countRed > countBlue && countRed > countGreen){
           System.out.printf("Max eggs: %d -> red",countRed);
       }else if (countOrange > countRed && countOrange > countBlue && countOrange > countGreen){
           System.out.printf("Max eggs: %d -> orange",countOrange);
       }else if (countBlue > countRed && countBlue > countOrange && countBlue > countGreen){
           System.out.printf("Max eggs: %d -> blue",countBlue);
       }else if (countGreen > countRed && countGreen > countOrange && countGreen > countBlue){
           System.out.printf("Max eggs: %d -> green",countGreen);
       }
    }
}
