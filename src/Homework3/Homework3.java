package Homework3;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Homework3 {


    // Задача 1: Массивы (Arrays)
    // Написать метод, который принимает массив целых чисел и возвращает сумму всех элементов массива.
    public static int arraysSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Задача 2: Строки (Strings)
    // Создать функцию, которая принимает строку и возвращает её в обратном порядке.
    public static String revertString(String originalString) {
        if (originalString == null || originalString.isEmpty()){
            return originalString;
        }
        StringBuilder reversedString = new StringBuilder(originalString);
       return reversedString.reverse().toString();
    }

    // Задача 3: Списки (Lists)
    // Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
    public static List<Integer> removeEvenNumbersFromList(List<Integer> list) {
        list.removeIf(i -> i % 2 == 0);
        return list;
    }

    // Задача 4: Стеки (Stacks)
    // Написать функцию, использующую стек для проверки правильности последовательности скобок в строке (например, "([]{})" является правильной, а "([)]" — нет).
    public static boolean checkIfBracketsAreCorrect(String text) {
        System.out.println("// [Logs] Current text: " + text);
        Stack<Character> stack = new Stack<>();
        for (char ch : text.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);  // pushing opening bracket to stack
                //System.out.println("// [Logs] Pushed to stack: " + ch + ". Current stack: " + stack);
            } else if (ch == ')' || ch == '}' || ch == ']')  {
                if (stack.isEmpty()) {
                    return false;  // if there is no opening bracket for this closing one => brackets are wrong
                }
                char lastBracketFromStack = stack.pop(); // popping last opening bracket from the stack
                //System.out.println("// [Logs] Current ch: " + ch + ", and lastBracketFromStack is: " + lastBracketFromStack + ". Comparing ...");
                if ((ch == ')' && lastBracketFromStack != '(') || (ch == '}' && lastBracketFromStack != '{') || (ch == ']' && lastBracketFromStack != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // if stack is not empty => some brackets are not closed
    }

    // Задача 6: Множества (Sets)
    //Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
    public static int countUniqueElementsInArray(int[] numbers)  {
        int uniqueCounter = 0;
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : numbers) {
            if (!uniqueSet.contains(num)) {
                uniqueSet.add(num);
                uniqueCounter +=1;
            }
        }
        return uniqueCounter;
    }

}
