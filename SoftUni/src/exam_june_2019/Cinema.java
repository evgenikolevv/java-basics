package exam_june_2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int capacity = Integer.parseInt(console.nextLine());
        int people = 0;
        double cost = 0;
        int countPeople = 0;
        String input = "";
        for (int i = 1; i <= capacity; i++) {
            input = console.nextLine();
            if (input.equals("Movie time!")){
                int seats = Math.abs(countPeople - capacity);
                System.out.printf("There are %d seats left in the cinema.\nCinema income - %.0f lv.",seats,cost);
                break;
            }
            people = Integer.parseInt(input);
            countPeople += people;
            if (countPeople > capacity){
                System.out.printf("The cinema is full.\nCinema income - %.0f lv.",cost);
                break;
            }

            if (people % 3 == 0) {
                double discount = (people * 5) - 5;
                cost += discount;
            }else{
                cost += people * 5;
            }
        }
    }
}
