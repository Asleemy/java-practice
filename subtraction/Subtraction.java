package subtraction;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int difference;
        System.out.println("Enter First Number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();
        difference = firstNumber - secondNumber;
        System.out.printf("Difference is: %d%n", difference);
    }
}
