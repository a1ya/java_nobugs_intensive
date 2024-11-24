import java.util.Scanner;

public class Homework1 {

    //    Базовые операции в Java
    //    Задача 4: Перевод градусов Цельсия в Фаренгейты
    public void convertCelsiusToFahrenheit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в Цельсиях: ");
        double degreesInCelsius = scanner.nextDouble();
        double degreesInFahrenheit = degreesInCelsius * 9 / 5 + 32;
        System.out.println("Температура в Фаренгейтах: " + degreesInFahrenheit);
    }

    //    Задачи на if и switch
    //    Задача 2: Калькулятор с использованием switch
    public void calculator () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operation = scanner.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        double result;

        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Ошибка! Деление на 0 недопустимо.");
                }
                break;
            default:
                System.out.println("Неправильный тип операции. Допустимые операции: +, -, *, или /.");
        }
        scanner.close();
        }

    //    Задачи на if и switch
    //    Задача 4: Проверка возраста (if-else)
    public void checkAge () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("Возраст должен быть > 0.");
        } else if (age < 13) {
            System.out.println("Ребёнок");
        } else if (age < 18) {
            System.out.println("Подросток");
        } else if (age < 65) {
            System.out.println("Взрослый");
        } else {
            System.out.println("Пенсионер");
        }
        scanner.close();
    }

    //    Задачи на for
    //    Задача 5: Чётные числа до N
    public void printAllEvenNumbersBeforeN () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();
    }

    //    Задачи на вложенные циклы
    //    Задача 2: Прямоугольник из звёздочек
    public void rectangleWithAsterisksMbyN() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите M: ");
        int m = scanner.nextInt();
        System.out.println("Введите N: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
