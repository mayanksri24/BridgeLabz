import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();

        System.out.print("Enter denominator: ");
        int num2 = sc.nextInt();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = num1 / num2;
            System.out.println("The result of division is: " + result);
        }

        sc.close();
    }
}