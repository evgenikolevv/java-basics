package condition_statemets_advanced_lab;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double age = Double.parseDouble(console.nextLine());
        String sex = console.nextLine();

        if(age >= 16){
            if (sex.equals("m")){
                System.out.println("Mr.");
            }else{
                System.out.println("Ms.");
            }
        }else{
            if(sex.equals("m")){
                System.out.println("Master");
            }else{
                System.out.println("Miss");
            }

        }
    }
}
