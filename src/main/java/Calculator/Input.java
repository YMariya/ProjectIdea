package Calculator;

import java.util.Scanner;

public class Input {
    static Scanner str;

    public Input() {
    }

    public static double doubleNum() {
        double num = 0.0D;
        if (str.hasNextDouble()) {
            num = str.nextDouble();
        } else {
            System.out.print("Ошибка! Введите число! ");
            str.next();
            num = doubleNum();
        }

        return num;
    }

    public static char operation() {
        char ch = str.next().charAt(0);
        if (ch != '+' && ch != '-' && ch != '*' && ch != '/') {
            System.out.print("Можно только: +,-,*,/  ");
            ch = operation();
        }

        return ch;
    }

    static {
        str = new Scanner(System.in);
    }
}
