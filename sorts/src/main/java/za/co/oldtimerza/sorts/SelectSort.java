package za.co.oldtimerza.sorts;

import java.util.ArrayList;
import java.util.List;


public class SelectSort {

    public static List<Integer> sort(List<Integer> sortableList){
        return selectSort(sortableList);
    };

    private static List<Integer> selectSort(List<Integer> arr){

        int i;
        int j;

        for(i=0; i < arr.size();i++){
            int min = i;
            int curr_value = arr.get(i);

            for(j=i; j<arr.size();j++){
                if (arr.get(j) < arr.get(min)) {
                    min = j;
                }
            }
            arr.set(i,arr.get(min));
            arr.set(min, curr_value);
        }
        return arr;
    }

}
