package Assignment;

import java.util.Scanner;

public class dayName {

    public void weekDay(String day){
        if (day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") ||day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") || day.equalsIgnoreCase("friday")){
            System.out.println("Ufff!, Its a weekday");
        } else if (day.equalsIgnoreCase("saturday") || day.equalsIgnoreCase("Sunday")) {
            System.out.println("Yaaay!!, Its a weekend");
        }else {
            System.out.println("Correct the valid day");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day:");
        dayName name = new dayName();
        name.weekDay(scanner.nextLine());
    }
}
