package conditional_statements;

import java.util.Scanner;

public class Scholarship {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        double income = console.nextDouble();
        double score = console.nextDouble();
        double minimumSalary = console.nextDouble();
        double scholarship = score * 25;
        double socialScholarship = minimumSalary * 0.35;


        if(income <= minimumSalary && score >=5.5){
            if(scholarship < socialScholarship){
                System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socialScholarship));
            }else{
                System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(scholarship));
            }
        }else if(score >=5.5){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(scholarship));
        }else if (income <= minimumSalary && score > 4.5){
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socialScholarship));
        }else{
            System.out.println("You cannot get a scholarship!");
        }
        }
}
