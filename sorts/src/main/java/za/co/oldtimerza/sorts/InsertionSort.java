package za.co.oldtimerza.sorts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertionSort {
    public List<Integer> sort(List<Integer> sortableList) {
        return insertionSort(sortableList);
    }

    private int test;

    private List<Integer> insertionSort(List<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {
            int value = arr.get(i);
            int j = i;

            while (j > 0 && value < arr.get(j - 1)) {
                arr.set(j, arr.get(j - 1));
                j--;
            }

            arr.set(j, value);
        }

        return arr;
    }
}
