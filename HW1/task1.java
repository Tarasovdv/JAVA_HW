
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package HW1;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {



        triangularSolver(inputNum());

    }

    public static int inputNum() {
        System.out.println("Input number for triangular solver: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.printf("Number: %d\n", num);
        return num;
    }

    public static void triangularSolver(int num) {
        System.out.printf("Sum triangular for number %d = %d\n", num, sumTriangle(num));
        System.out.printf("Multiply triangular for number %d = %d", num, multTriangle(num));
    }

    public static int sumTriangle(int num) {
        if (num == 1) {
            return 1;
        } else
            return (num + sumTriangle(num - 1));
    }

    public static int multTriangle(int num) {
        if (num == 1) {
            return 1;
        } else
            return (num * multTriangle(num - 1));
    }

}
