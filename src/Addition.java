import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber;
        int secondNumber;
        int sum = 0;
        System.out.println("Enter first number: ");
        firstNumber = input.nextInt();
        System.out.println("Enter second Number: ");
        secondNumber = input.nextInt();
        sum = firstNumber + secondNumber;
        System.out.printf("sum is %d%n", sum);

    }
}
