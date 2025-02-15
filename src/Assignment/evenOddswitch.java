package Assignment;

import java.util.Scanner;

public class evenOddswitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        switch (i%2){
            case 0:
                System.out.println("Even Number");
                break;

            default:
                System.out.println("Odd Number");

        }
    }
}
