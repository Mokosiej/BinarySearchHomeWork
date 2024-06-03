import java.util.Scanner;

public class RecursiveBinarySearch {


    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }


    public static int recursiveBinarySearch(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] > target) {
            return recursiveBinarySearch(arr, left, mid - 1, target);
        }
        return recursiveBinarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите 10 чисел, разделенных пробелами:");
        String input = scanner.nextLine();


        String[] inputNumbers = input.split(" ");
        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }


        bubbleSort(numbers);


        System.out.println("Введите число для поиска:");
        int target = scanner.nextInt();
        scanner.close();


        int index = recursiveBinarySearch(numbers, 0, numbers.length - 1, target);


        if (index == -1) {
            System.out.println("Число не найдено в массиве.");
        } else {
            System.out.println("Число найдено на индексе: " + index);
        }
    }
}
