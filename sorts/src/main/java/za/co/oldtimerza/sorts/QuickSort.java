package za.co.oldtimerza.sorts;

import java.util.List;

public class QuickSort {
    public List<Integer> sort(List<Integer> sortableList) {
        return sortSubList(sortableList, 0, sortableList.size() - 1);
    }

    /*
     * Recursion using Hoare partition scheme
     */
    public List<Integer> sortSubList(List<Integer> sortableList, int low, int high) {
        if (low < high) {
            int pivot = partition(sortableList, low, high);
            sortSubList(sortableList, low, pivot);
            sortSubList(sortableList, pivot + 1, high);
        }
        return sortableList;
    }

    private int partition(List<Integer> sortableList, int low, int high) {
        Integer pivot = sortableList.get((low + high)/ 2);
        int leftScanIndex = low - 1;
        int rightScanIndex = high + 1;
        while (true) {
            do {
                leftScanIndex = leftScanIndex + 1;
            } while (sortableList.get(leftScanIndex) < pivot);

            do {
                rightScanIndex = rightScanIndex - 1;
            } while (sortableList.get(rightScanIndex) > pivot);

            if (leftScanIndex >= rightScanIndex) {
                return rightScanIndex;
            }

            Integer temp = sortableList.get(leftScanIndex);
            sortableList.set(leftScanIndex, sortableList.get(rightScanIndex));
            sortableList.set(rightScanIndex, temp);
        }
    }
}
