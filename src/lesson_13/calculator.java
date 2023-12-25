package lesson_13;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double res;
        System.out.print("Enter the initial value: ");
        res = scanner.nextDouble();

        boolean cont = true;
        scanner.nextLine();

        while (cont) {
            String op;
            double vari;
            System.out.println("Result is: " + res);
            System.out.print("Input an operator: ");
            op = scanner.nextLine();
            System.out.print("Input an operand: ");
            vari = scanner.nextDouble();

            switch (op) {
                case "+":
                    res += vari;
                    break;
                case "-":
                    res -= vari;
                    break;
                case "*":
                    res *= vari;
                    break;
                case "/":
                    if (vari != 0) {
                        res /= vari;
                    } else {
                        System.out.println("Error: Division by zero.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Use +, -, *, /");
                    break;
            }

            scanner.nextLine();

            System.out.print("Would you like to continue? (yes/no) ");
            String stat = scanner.nextLine();
            cont = stat.equals("yes");
        }
    }
}