package Assignment;

import java.util.Scanner;

public class arithematicSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the first number: ");
        int i = scanner.nextInt();
        System.out.println("enter the Second number: ");
        int j = scanner.nextInt();
        scanner.nextLine();
        System.out.println("enter the target operation: ");
        String c = scanner.nextLine();

        switch (c){

            case "+":
                int a = i+j;
                System.out.println("Result: "+a);
                break;

            case "-":
                int b = i-j;
                System.out.println("Result: "+b);
                break;

            case "*":
                int e = i*j;
                System.out.println("Result: "+e);
                break;

            case "/":
                int d = i/j;
                System.out.println("Result: "+d);
                break;
        }
    }
}
