import java.util.ArrayList;

public class TaskSolver {

    public int sum(ArrayList<Integer> numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public boolean checkIfPalindrome(String text) {
        String cleanString = text.toLowerCase().replaceAll(" ", "");
        String reversedCleanString = "";
        for (int i = 0; i < cleanString.length(); i++) {
            reversedCleanString = cleanString.charAt(i) + reversedCleanString;
        }
        return cleanString.equals(reversedCleanString);
    }

    public  void findAllNumbersDividableByThreeOrFive() {
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public void checkIfEven(int number) {
        if (number % 2 == 0) {
            System.out.println("Четное");
        }
        else {
            System.out.println("Нечетное");
        }
    }

    public int factorial(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            System.out.println("Number can't be negative");
            return 0; //todo change to exception
        } else {
            int result = number;
            for (int i = number - 1; i > 1; i--) {
                result *= i;
            }
            return result;
        }
    }

    public void findAllNumbersDividableByThreeOrFiveSeparate(){
        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0 ||  i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int[] bubbleSorting(int[] array) {
        int n = array.length;
        //boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                    swapped = true;
                }
                if (!swapped) break;
            }
        }
        return array;
    }


}
