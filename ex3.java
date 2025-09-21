// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588
// Pedro Arão Baquini - RM559580

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();
        int max = Math.max(num1, Math.max(num2, num3));
        System.out.println("The largest number is: " + max);
        scanner.close();
    }
}
