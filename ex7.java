// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a phrase:");
        String line = scanner.nextLine();
        int spaceCount = 0;
        for (int i = 0; i < line.length(); i++) {
            char currentChar = line.charAt(i);
            
            if (currentChar == ' ') {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);
        scanner.close();
    }
}