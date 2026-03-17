import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        
        System.out.println("enter number1 number2 and operator");

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        char operator = input.next().charAt(0);
        int num2 = input.nextInt();

        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("invalid operator");
        }

    }
}