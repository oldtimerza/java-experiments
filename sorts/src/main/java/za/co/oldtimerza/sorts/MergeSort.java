package za.co.oldtimerza.sorts;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public List<Integer> sort(List<Integer> sortableList) {
        return sortSublist(sortableList);
    }

    private List<Integer> sortSublist(List<Integer> sublist) {
        if (sublist.size() <= 1) {
            return sublist;
        }

        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();

        for(int i = 0; i < sublist.size(); i++){
            if(i < sublist.size()/2){
                left.add(sublist.get(i));
            }else{
                right.add(sublist.get(i));
            }
        }

        left = sortSublist(left);
        right = sortSublist(right);

        return merge(left,right);
    }

    private List<Integer> merge(List<Integer> left, List<Integer> right) {
        List<Integer> result = new ArrayList<Integer>();

        while(!left.isEmpty() && !right.isEmpty()){
            Integer firstLeft = left.get(0);
            Integer firstRight = right.get(0);

            if(left.get(0) < right.get(0)){
                result.add(firstLeft);
                left.remove(0);
            }else{
                result.add(firstRight);
                right.remove(0);
            }
        }
        while(!left.isEmpty()){
            Integer firstLeft = left.get(0);
            result.add(firstLeft);
            left.remove(0);
        }

        while(!right.isEmpty()){
            Integer firstRight = right.get(0);
            result.add(firstRight);
            right.remove(0);
        }

        return  result;
    }
}
