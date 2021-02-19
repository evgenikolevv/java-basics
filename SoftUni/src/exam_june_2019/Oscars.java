package exam_june_2019;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String name = console.nextLine();
        double academyPoints = Double.parseDouble(console.nextLine());
        int graders = Integer.parseInt(console.nextLine());

        double result = academyPoints;
        for (int i = 0; i < graders ; i++) {
            if(result> 1250.5){
                break;
            }
            String graderName = console.nextLine();
            double points = Double.parseDouble(console.nextLine());
            double grade = (graderName.length() * points) / 2.0;
            result += grade;
        }

        if(result >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!",name,result);
        }else{
            System.out.printf("Sorry, %s you need %.1f more!",name,Math.abs(result - 1250.5));
        }
    }
}
