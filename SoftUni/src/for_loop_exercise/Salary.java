package for_loop_exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int openTabs = Integer.parseInt(console.nextLine());
        int salary = Integer.parseInt(console.nextLine());

        for(int i = 0; i < openTabs; i++){
            if(salary == 0){
                break;
            }

            String website = console.nextLine();
            if(website.equals("Facebook")){
                salary -= 150;
            }else if (website.equals("Instagram")){
                salary -= 100;
            }else if (website.equals("Reddit")){
                salary -= 50;
            }
        }

        if (salary == 0){
            System.out.println("You have lost your salary.");
        }else{
            System.out.println(salary);
        }
    }
}
