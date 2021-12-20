package modulusArithmetics;

import java.util.Scanner;

public class ModularArithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int modular;
        System.out.println("Enter First Number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter Second Number: ");
        secondNumber = input.nextInt();
        modular = (firstNumber % secondNumber);
        System.out.printf("modular is %d%n", modular);

    }
}