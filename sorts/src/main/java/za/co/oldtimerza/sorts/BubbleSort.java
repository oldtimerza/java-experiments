package za.co.oldtimerza.sorts;

import java.util.List;

public class BubbleSort {

    public List<Integer> sort(List<Integer> sortableList){
        return bubbleSort(sortableList);
    }

    private List<Integer> bubbleSort(List<Integer> arr){

        int i;
        int j;

        for (i=0; i<arr.size();i++){
            for (j=1;j<arr.size()-i;j++){
                int value = arr.get(j-1);
                if (value>arr.get(j)){
                    arr.set(j-1,arr.get(j));
                    arr.set(j,value);
                }
            }
        }
        return arr;
    }
}
