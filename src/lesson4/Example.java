package lesson4;

public class Example {

    public static void switchArray(int[] numbers) {
        for (int i = 0; i < numbers.length/2; i++) {
            int a = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = a;
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }

    }
}
