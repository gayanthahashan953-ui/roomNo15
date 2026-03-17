import java.util.Scanner;

class Calculator {// Create a Class
    public static void main(String[] args) {//create a main method
        
        int i=0;
        while (i<4) {//creata a while loop
        System.out.println("enter number1 number2 and operator");


        Scanner input = new Scanner(System.in);//create a scan object

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
        i++;
    }

    }
}