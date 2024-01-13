import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input angka pertama: ");
        int num1 = input.nextInt();

        System.out.print("Input angka kedua: ");
        int num2 = input.nextInt();

        System.out.print("Pilih operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print(num1 + " " + operator + " " + num2 + " = ");

        switch (operator) {
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                System.out.print(num1 / num2);
                break;
        }
    }
}
