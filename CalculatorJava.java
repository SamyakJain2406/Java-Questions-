import java.util.Scanner;

public class CalculatorJava {
    public static void main(String args[]) {

        float a, b, calcu;
        char choice, ch;
        Scanner cal = new Scanner(System.in);

        do {

            System.out.println("\n\nAvailable Operations : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");

            // Enter the choice
            System.out.print("Enter your operation : ");

            choice = cal.next().charAt(0);

            // This loop will calculate different operations' values.
            switch (choice) {
                case '1':
                    System.out.print("Enter two numbers : ");
                    try {
                        a = cal.nextFloat();
                        b = cal.nextFloat();
                        calcu = a + b;
                        System.out.print("Result : " + calcu);
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. Please enter valid numbers.");
                    }
                    break;

                case '2':
                    System.out.print("Enter two numbers : ");
                    try {
                        a = cal.nextFloat();
                        b = cal.nextFloat();
                        calcu = a - b;
                        System.out.print("Result : " + calcu);
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. Please enter valid numbers.");
                    }
                    break;

                case '3':
                    System.out.print("Enter two numbers : ");
                    try {
                        a = cal.nextFloat();
                        b = cal.nextFloat();
                        try {
                            calcu = a / b;
                            System.out.print("Result : " + calcu);
                        } catch (ArithmeticException e) {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. Please enter valid numbers.");
                    }
                    break;

                case '4':
                    System.out.print("Enter two numbers : ");
                    try {
                        a = cal.nextFloat();
                        b = cal.nextFloat();
                        calcu = a * b;
                        System.out.print("Result : " + calcu);
                    } catch (Exception e) {
                        System.out.println("Error: Invalid input. Please enter valid numbers.");
                    }
                    break;

                case '5':
                    System.exit(0);
                    break;
                default:
                    System.out.print("Wrong Choice.....\n");
                    break;
            }
        }
        // Loop works until the number 5 is not selected.
        while (choice != '5');
    }
}