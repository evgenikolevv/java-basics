package exam_march_2019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String country = console.nextLine();
        String equipment = console.nextLine();
        double dificulty = 0;
        double performance = 0;
        double sum = 0;
        if (country.equals("Bulgaria")){
            switch (equipment){
                case "ribbon":
                    dificulty = 9.600;
                    performance = 9.400;
                    break;
                case "hoop":
                    dificulty = 9.550;
                    performance = 9.750;
                    break;
                case "rope":
                    dificulty = 9.500;
                    performance = 9.400;
                    break;
            }

        }else if (country.equals("Russia")){
            switch (equipment){
                case "ribbon":
                    dificulty = 9.100;
                    performance = 9.400;
                    break;
                case "hoop":
                    dificulty = 9.300;
                    performance = 9.800;
                    break;
                case "rope":
                    dificulty = 9.600;
                    performance = 9.000;
                    break;
            }

        }else if (country.equals("Italy")){
            switch (equipment){
                case "ribbon":
                    dificulty = 9.200;
                    performance = 9.500;
                    break;
                case "hoop":
                    dificulty = 9.450;
                    performance = 9.350;
                    break;
                case "rope":
                    dificulty = 9.700;
                    performance = 9.150;
                    break;
            }
        }

        sum = dificulty + performance;
        double diff = Math.abs(((sum - 20) /20 ) * 100);
        System.out.printf("The team of %s get %.3f on %s.\n%.2f%%",country,sum,equipment,diff);
    }
}
