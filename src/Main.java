
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух целых чисел
        System.out.print("Введите первое целое число (a): ");
        int a = scanner.nextInt();

        System.out.print("Введите второе целое число (b): ");
        int b = scanner.nextInt();

        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Операции с числами
        int sum = a + b;
        int difference = a - b;
        int product = a * b;

        // Проверка деления на ноль
        double quotient = (b != 0) ? (double) a / b : 0;

        // Вывод результатов
        System.out.println("Сумма (a + b): " + sum);
        System.out.println("Разность (a - b): " + difference);
        System.out.println("Произведение (a * b): " + product);
        if (b != 0) {
            System.out.println("Частное (a / b): " + quotient);
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        // Закрытие сканера
        scanner.close();
    }
}
