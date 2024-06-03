
public class SortingAndSearching {


    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }


    public static int binarySearch(int[] array, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                return binarySearch(array, left, mid - 1, target);
            } else {
                return binarySearch(array, mid + 1, right, target);
            }
        }
        return -1;
    }

}
