package Assignment;

import java.util.Scanner;

public class evenOrOdd { //Even or Odd

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        if (num % 2 == 0){
            System.out.println("Its a even number");
        }
        else{
            System.out.println("Its a odd number");
        }
    }
}
