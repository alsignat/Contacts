import java.util.ArrayList;
import java.util.Scanner;

enum DaysOfTheWeek { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DaysOfTheWeek day = DaysOfTheWeek.valueOf(scanner.next());
        int numLetters;

        DaysOfTheWeek numletters = switch (day) {
            case MONDAY: -> 1;
            case TUESDAY:
        }
        System.out.println(numLetters);

        int num = 2;
    }
}