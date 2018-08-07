package Tasks;

import java.util.Scanner;

public class Task_1 {
    public Task_1() {
    }

    public void calc() {
        System.out.println("Калькулятор");
        Scanner scanner = new Scanner(System.in);

        for(char exit = 'y'; exit == 'y'; exit = scanner.next().charAt(0)) {
            System.out.println("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.println("Введите операцию: ");
            char oper = scanner.next().charAt(0);
            System.out.println("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double answer;
            switch(oper) {
                case '*':
                    answer = num1 * num2;
                    System.out.format("Ответ: %.4f%n", answer);
                    break;
                case '+':
                    answer = num1 + num2;
                    System.out.format("Ответ: %.4f%n", answer);
                    break;
                case ',':
                case '.':
                default:
                    System.out.println("Не верно! Поробуй еще!");
                    break;
                case '-':
                    answer = num1 - num2;
                    System.out.format("Ответ: %.4f%n", answer);
                    break;
                case '/':
                    answer = num1 / num2;
                    System.out.format("Ответ: %.4f%n", answer);
            }

            System.out.println("Продолжить операцию? (y/n)");
        }

    }
}
