package Tasks;

import Calculator.Base;
import Calculator.myExeption;
import SweetGift.Box;

import java.util.Scanner;

public class MainClass {
    public MainClass() {
    }

    public static void main(String[] args) throws myExeption {
        Scanner scanner = new Scanner(System.in);
        Task_1 calculator = new Task_1();
        Task_2 argsmass = new Task_2();
        Tmass massiv = new Tmass();
        Box sweetstuff = new Box();
        Base oop = new Base();
        System.out.println("Какую программу Вы собираетесь выбрать? ");
        System.out.println("Введите 1 - для выбора калькулятора, 2 - поиск наибольшего слова в массиве: ");
        System.out.println("Введите 3 - для выбора мах и мin числа массива, 4 - состав подарка: ");
        System.out.println("Введите 5 - для выбора калькулятора ООП: ");
        int vibor = scanner.nextInt();
        switch(vibor) {
            case 1:
                calculator.calc();
                break;
            case 2:
                argsmass.mass();
                break;
            case 3:
                massiv.tass();
                break;
            case 4:
                sweetstuff.all();
                break;
            case 5:
                Base.base();
                break;
            default:
                System.err.println("Выход из операции.");
        }

    }
}
