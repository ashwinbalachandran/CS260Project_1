package insertionsort.general;

import java.util.ArrayList;

public class InsertionSort {
    public ArrayList<Integer> insertionSort(ArrayList<Integer> nums,int gap){
        int i, temp, j;
        if(nums.isEmpty()) {
        	return nums;
        }
        for(i=gap;i<nums.size();i++){
            temp = nums.get(i);
            for(j = i;j>=gap && nums.get(j-gap)>temp;j-=gap)
                nums.set(j,nums.get(j-gap));
            nums.set(j,temp);
        }
        return nums;
    }
}
