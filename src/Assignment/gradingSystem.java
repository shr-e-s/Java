package Assignment;

import java.util.Scanner;

public class gradingSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello!! Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println();
        System.out.printf("Hello %s",name+" Please enter your marks: ");
        int marks = scanner.nextInt();
        System.out.println();
        
        if (marks < 35){
            System.out.println("You are failed, study hard");
        } else if (marks ==35) {
            System.out.println("You are passed");
        } else if (marks <= 70) {
            System.out.println("You have secured third class");
        } else if (marks <= 85) {
            System.out.println("You have secured second class");
        } else if (marks <=100) {
            System.out.println("You have secured Distinction");
        }
    }
}
