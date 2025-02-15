package userInput;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, Please enter your name");
        String name = scanner.nextLine(); //nextInt(), nextFloat(), nextDouble();
        System.out.printf("Hello %s",name+" Welcome to the bank");
        scanner.close();
    }


}
