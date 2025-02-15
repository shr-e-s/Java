package conditionalStatements;

import java.util.Scanner;

public class conditions {

//    if(condition){
//        BOC
//    }

//-------------------------

//    if(condition){
//        BOC
//    }
//      else{
          //BOC
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num>0) {
            System.out.println("Its a positive number");
        }
        else {
            System.out.println("Its a negative number");
        }



        //Nested-If

        System.out.println("Welcome enter the Round1 Status");
        String exam1Status = scanner.nextLine();

        if (exam1Status.equals("pass")){
            System.out.println("Congo!!, Round 1 passed moving to second round");
            System.out.println("Enter the Round2 Status");
            String exam2Status = scanner.nextLine();
            if (exam2Status.equals("pass")){
                System.out.println("Congo!!, Round 2 passed moving to third round");
            }
            else {
                System.out.println("Round 2 failed");
            }
        }
        else {
            System.out.println("Round 1 failed");
        }
    }



}
