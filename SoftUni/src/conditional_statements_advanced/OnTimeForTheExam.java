package conditional_statements_advanced;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        //студентът ако пристигне в часа на изпита или 30 минути преди изпита се счита, че е навреме
        // Ако е пристигнал повече от 30 минути по-рано, той е подранил
        //Ако е дошъл след часа на изпита, той е закъснял

        Scanner console = new Scanner(System.in);
        int hourOfExam = console.nextInt();
        int minuteOfExam = console.nextInt();
        int arrivalHour = console.nextInt();
        int arrivalMinute = console.nextInt();

        hourOfExam *= 60;
        arrivalHour *= 60;

        int timeOfExam = hourOfExam + minuteOfExam;
        int timeOfArrival = arrivalHour + arrivalMinute;

        if(timeOfArrival <= timeOfExam && timeOfExam - timeOfArrival <= 30){
            //navreme
            int minutes = timeOfExam - timeOfArrival;
            minutes %= 60;
            if (timeOfArrival == timeOfExam){
                System.out.println("On time");
            }else{
                System.out.printf("On time\n%d minutes before the start",minutes);

            }

        }else if (timeOfArrival < timeOfExam){
            //podranil
            int hourEarly = timeOfExam - timeOfArrival;
            hourEarly /= 60;
            int minutesEarly = timeOfExam - timeOfArrival;
            minutesEarly %= 60;

            if (hourEarly == 0){
                System.out.printf("Early\n%d minutes before the start",minutesEarly);
            }else{
                if(minutesEarly < 10) {
                    System.out.printf("Early\n%d:0%d hours before the start", hourEarly, minutesEarly);
                }else{
                    System.out.printf("Early\n%d:%d hours before the start", hourEarly, minutesEarly);

                }
            }
        }else if (timeOfArrival > timeOfExam){
            int hourLate = timeOfArrival - timeOfExam;
            hourLate /= 60;
            int minutesLate = timeOfArrival - timeOfExam;
            minutesLate %= 60;

            if (hourLate == 0){
                System.out.printf("Late\n%d minutes after the start",minutesLate);
            }else{
                if(minutesLate < 10) {
                    System.out.printf("Late\n%d:0%d hours after the start", hourLate, minutesLate);
                }else{
                    System.out.printf("Late\n%d:%d hours after the start", hourLate, minutesLate);

                }
            }
        }

    }
}
