// Leandro Kamada Pesce Dimov - RM560381
// Ian Junji Maluvayshi Matsushita - RM560588
// Pedro Arão Baquini - RM559580

// Entrada: 4
// Saída: IV 

// Entrada: 9
// Saída: IX 

// Entrada: 58
// Saída: LVIII 

// Entrada: 1994
// Saída: MCMXCIV 

// Entrada: 4000
// Saída: Invalid 

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        System.out.print("Enter a number (1-3999) or a Roman numeral: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        boolean isNumber = true;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c < '0' || c > '9') {
                isNumber = false;
                break;
            }
        }
        if (isNumber) {
            int num = Integer.parseInt(input);
            if (num < 1 || num > 3999) {
                System.out.println("Invalid");
                return;
            }
            String roman = "";
            while (num >= 1000) { roman += "M"; num -= 1000; }
            if (num >= 900) { roman += "CM"; num -= 900; }
            if (num >= 500) { roman += "D"; num -= 500; }
            if (num >= 400) { roman += "CD"; num -= 400; }
            while (num >= 100) { roman += "C"; num -= 100; }
            if (num >= 90) { roman += "XC"; num -= 90; }
            if (num >= 50) { roman += "L"; num -= 50; }
            if (num >= 40) { roman += "XL"; num -= 40; }
            while (num >= 10) { roman += "X"; num -= 10; }
            if (num == 9) { roman += "IX"; num -= 9; }
            if (num >= 5) { roman += "V"; num -= 5; }
            if (num == 4) { roman += "IV"; num -= 4; }
            while (num >= 1) { roman += "I"; num -= 1; }
            System.out.println(roman);
        } else {
            String s = input;
            int total = 0;
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                int val = 0;
                if (c == 'M') val = 1000;
                else if (c == 'D') val = 500;
                else if (c == 'C') val = 100;
                else if (c == 'L') val = 50;
                else if (c == 'X') val = 10;
                else if (c == 'V') val = 5;
                else if (c == 'I') val = 1;

                int nextVal = 0;
                if (i + 1 < s.length()) {
                    char n = s.charAt(i + 1);
                    if (n == 'M') nextVal = 1000;
                    else if (n == 'D') nextVal = 500;
                    else if (n == 'C') nextVal = 100;
                    else if (n == 'L') nextVal = 50;
                    else if (n == 'X') nextVal = 10;
                    else if (n == 'V') nextVal = 5;
                    else if (n == 'I') nextVal = 1;
                }

                if (nextVal > val) {
                    total += nextVal - val;
                    i += 2;
                } else {
                    total += val;
                    i++;
                }
            }
            System.out.println(total);
        }
    }
}
