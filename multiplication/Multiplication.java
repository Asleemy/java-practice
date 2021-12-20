package multiplication;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int multiplication;
        System.out.println("Enter firstNumber: ");
        firstNumber = input.nextInt();
        System.out.println("Enter secondNumber: ");
        secondNumber = input.nextInt();
        multiplication = firstNumber * secondNumber;
        System.out.printf("Multiplication is %d%n", multiplication);
    }
}
