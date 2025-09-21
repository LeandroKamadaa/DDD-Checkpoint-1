// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588
// Pedro Arão Baquini - RM559580

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0; 
        if (num > 1) {
            for (int i = 1; i <= num; i++) {
                sum = sum + i; 
            }
            System.out.println("The sum of 1 to " + num + " is: " + sum);
        } else {
            System.out.println("Enter a number bigger then 1.");
        }
        
        scanner.close();
    }
}
