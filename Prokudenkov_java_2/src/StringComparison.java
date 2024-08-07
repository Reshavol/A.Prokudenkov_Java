//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.print("Введите первую строку: ");
        String a = scanner.nextLine();

        // Ввод второй строки
        System.out.print("Введите вторую строку: ");
        String b = scanner.nextLine();

        // Сравнение строк
        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }

        scanner.close();
    }
}
