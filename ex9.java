// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588

//Entrada: 529.982.247-25
//Saída: Valid

//Entrada: 168.995.350-09
//Saída: Valid

import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        System.out.println("Enter a CPF number:");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String cpf = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                cpf = cpf + c;
            }
        }

        if (cpf.length() != 11) {
            System.out.println("Invalid");
            return;
        }

        char first = cpf.charAt(0);
        boolean allEqual = true;
        for (int i = 1; i < 11; i++) {
            if (cpf.charAt(i) != first) {
                allEqual = false;
                break;
            }
        }
        if (allEqual) {
            System.out.println("Invalid");
            return;
        }

        int sum1 = 0;
        int weight1 = 10;
        for (int i = 0; i < 9; i++) {
            int num = cpf.charAt(i) - '0';
            sum1 += num * weight1;
            weight1--;
        }
        int rest1 = sum1 % 11;
        int d1 = (rest1 < 2) ? 0 : 11 - rest1;

        int sum2 = 0;
        int weight2 = 11;
        for (int i = 0; i < 10; i++) {
            int num = cpf.charAt(i) - '0';
            sum2 += num * weight2;
            weight2--;
        }
        int rest2 = sum2 % 11;
        int d2 = (rest2 < 2) ? 0 : 11 - rest2;

        if (cpf.charAt(9) - '0' == d1 && cpf.charAt(10) - '0' == d2) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
