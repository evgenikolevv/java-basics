package while_loop_exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int stepsGoal = 10000;
        int stepCount = 0;
        int finalSteps = 0;
        int neededSteps = 0;
        while(stepCount < stepsGoal){
            int steps = 0;
            String command = console.nextLine();
            if(command.equals("Going home")){
                command = console.nextLine();
                steps = Integer.parseInt(command);
                stepCount += steps;
                break;
            }
            steps = Integer.parseInt(command);
            stepCount += steps;
        }

        if(stepCount > stepsGoal){
            finalSteps = stepCount - stepsGoal;
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!",finalSteps);
        }else{
            neededSteps = stepsGoal - stepCount;
            System.out.printf("%d more steps to reach goal.",neededSteps);
        }
    }
}
