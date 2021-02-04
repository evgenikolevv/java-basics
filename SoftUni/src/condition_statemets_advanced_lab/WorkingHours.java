package condition_statemets_advanced_lab;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int hour = Integer.parseInt(console.nextLine());
        String dayOfTheWeek = console.nextLine();

        if(dayOfTheWeek.equals("Sunday")){
            System.out.println("closed");
        }else{
            if (hour >= 10 && hour <= 18){
                System.out.println("open");
            }else{
                System.out.println("closed");
            }
        }
    }
}
