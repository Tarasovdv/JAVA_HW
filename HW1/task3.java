//Простой калькулятор
package HW1;

import java.util.Scanner;

public class task3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operand = getOperand();
        int result = calc(num1, num2, operand);
        System.out.println(result);

    }

    public static int getInt() {
        System.out.println("Input number: ");
        int num;
        if (scan.hasNextInt()) {
            num = scan.nextInt();
        } else {
            System.out.println("Your wrong. Repeat please.");
            scan.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperand() {
        System.out.println("Input operand: ");
        char operand;
        if (scan.hasNext()) {
            operand = scan.next().charAt(0);
        } else {
            System.out.println("Your wrong. Repeat please.");
            scan.next();
            operand = getOperand();
        }
        return operand;
    }

    public static int calc(int num1, int num2, char operand) {
        int res;
        switch (operand) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num1 - num2;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num1 / num2;
                break;
            default:
                System.out.println("Your wrong. Repeat please.");
                res = calc(num1, num2, getOperand());
        }
        return res;

    }

}
