package nested_loop_exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double averageGrade = 0;
        double finalGrade = 0;
        int count = 0;


        int numberOfJudges = Integer.parseInt(console.nextLine());

        while(true){
            String input = console.nextLine();
            if(input.equals("Finish")){
                break;
            }
            averageGrade = 0;
            for(int j = 0; j < numberOfJudges; j++){
                double grade = Double.parseDouble(console.nextLine());
                averageGrade += grade;
            }
            averageGrade /= numberOfJudges;
            finalGrade += averageGrade;
            System.out.printf("%s - %.2f.\n",input,averageGrade);
            count++;
        }

        finalGrade /= count;
        System.out.printf("Student's final assessment is %.2f.",finalGrade);
    }
}

