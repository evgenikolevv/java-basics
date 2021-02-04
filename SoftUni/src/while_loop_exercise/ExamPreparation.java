package while_loop_exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int badGrades = Integer.parseInt(console.nextLine());
        int failedTimes = 0;
        int solvedProblems = 0;
        double averageSum = 0;
        boolean isFailed = true;
        String lastProblem = "";
        while(badGrades > failedTimes){
            String name = console.nextLine();
            if(name.equals("Enough")){
                isFailed = false;
                break;
            }

            int grade = Integer.parseInt(console.nextLine());
            if (grade <= 4){
                failedTimes++;
            }

            averageSum += grade;
            solvedProblems++;
            lastProblem = name;
        }

        if(isFailed){
            System.out.printf("You need a break, %d poor grades.",badGrades);
        }else{
            System.out.printf("Average score: %.2f%n",averageSum/solvedProblems);
            System.out.printf("Number of problems: %d%n",solvedProblems);
            System.out.printf("Last problem: %s",lastProblem);
        }
    }
}
