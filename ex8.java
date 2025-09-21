// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588
// Pedro Arão Baquini - RM559580
import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter 10 integer numbers, one at a time.");
        System.out.print("Enter the 1st number: ");
        int firstNumber = scanner.nextInt();
        double sum = firstNumber;
        int min = firstNumber;
        int max = firstNumber;
        
        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number #" + i + ": ");
            int currentNumber = scanner.nextInt();
            sum += currentNumber;
            if (currentNumber < min) {
                min = currentNumber;
            }
            if (currentNumber > max) {
                max = currentNumber;
            }
        }
        double average = sum / 10.0;
        System.out.println("\n----- Analysis Complete -----");
        System.out.println("Average of the numbers: " + average);
        System.out.println("Smallest number entered: " + min);
        System.out.println("Largest number entered: " + max);
        scanner.close();
    }
}