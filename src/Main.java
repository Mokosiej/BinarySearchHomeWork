import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }


        SortingAndSearching.bubbleSort(numbers);
        System.out.println("Отсортированный массив: " + Arrays.toString(numbers));

        System.out.println("Введите число для поиска:");
        int target = scanner.nextInt();
        scanner.close();


        int result = SortingAndSearching.binarySearch(numbers, 0, numbers.length - 1, target);
        if (result == -1) {
            System.out.println("Число не найдено.");
        } else {
            System.out.println("Число найдено на индексе: " + result);
        }
    }
}
