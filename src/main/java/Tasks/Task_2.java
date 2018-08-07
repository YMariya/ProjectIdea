package Tasks;

import java.util.Scanner;

public class Task_2 {
    public Task_2() {
    }

    public void mass() {
        Scanner scanner = new Scanner(System.in);
        String samoeDlinnoeSlovo = "";
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        String[] massivStr = new String[arraySize];
        System.out.println("Наполните массив произвольными словами:");

        for(int i = 0; i < massivStr.length; ++i) {
            String slovo = scanner.next();
            massivStr[i] = slovo;
            String provSlovo = massivStr[i];
            if (samoeDlinnoeSlovo.length() < provSlovo.length()) {
                samoeDlinnoeSlovo = provSlovo;
            }
        }

        System.out.println("Самое длинное слово массива: " + samoeDlinnoeSlovo);
    }
}
