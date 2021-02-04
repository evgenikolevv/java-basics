package while_loop_lab;

import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int grade = 0;
        double averageSum = 0;
        String name = console.nextLine();
        double score = Double.parseDouble(console.nextLine());

        int dropout = 0;
        int dropoutGrade = 0;
        while(grade < 12){

            if(score >= 4){
                averageSum += score;
                grade++;

            }else{
                dropout++;
                if (dropout == 2){
                    grade++;
                    dropoutGrade = grade;
                    break;
                }
            }

            if (grade == 12){
                break;
            }
            score = Double.parseDouble(console.nextLine());
        }

        if (grade == 12){
            System.out.printf("%s graduated. Average grade: %.2f",name,averageSum/grade);
        }else{
            System.out.printf("%s has been excluded at %d grade",name,dropoutGrade);
        }
    }
}
