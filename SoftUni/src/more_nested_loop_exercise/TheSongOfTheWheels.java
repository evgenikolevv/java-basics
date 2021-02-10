package more_nested_loop_exercise;

import java.util.Scanner;

public class TheSongOfTheWheels {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int M = Integer.parseInt(console.nextLine());
        int count = 0;
        boolean isThereFourthPassword = false;
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth =0;

            for (int a = 1; a <= 9; a++){
                for (int b = 1; b <= 9; b++){
                    for (int c = 1; c <= 9; c++){
                        for(int d = 1; d <= 9; d++){
                            if(a < b && c > d){
                                if ((a * b) + (c * d) == M){
                                    count++;
                                    if(count == 4){
                                        isThereFourthPassword = true;
                                        first = a;
                                        second = b;
                                        third = c;
                                        fourth = d;
                                    }
                                    System.out.printf("%d%d%d%d ",a,b,c,d);
                                }
                            }
                        }
                    }
                }
            }

        if(count > 0){
            System.out.println();
            if(isThereFourthPassword){
                System.out.println("Password: " + first + "" + second + "" + third + "" +fourth);
            }else{
                System.out.println("No!");
            }
        }else{
            System.out.println("No!");
        }
    }
}
