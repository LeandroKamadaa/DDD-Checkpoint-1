// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588

import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: "); 
        int num2 = scanner.nextInt();
        int sum = num1 + num2;  
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}    