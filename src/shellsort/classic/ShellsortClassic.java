package shellsort.classic;

import java.util.ArrayList;

import insertionsort.general.InsertionSort;

public class ShellsortClassic {
    public void printSortedList(ArrayList<Integer> numbers) {
    	for(int n:numbers) {
    		System.out.print(n+" ");
    	}
    	System.out.println("");
	}
	public ArrayList<Integer> shellSort(ArrayList<Integer> numbers){
    	ArrayList<Integer> gaps = new ArrayList<>();
    	InsertionSort is = new InsertionSort();
    	int n = numbers.size();
    	for(int i = 1;i<=(Math.log(n)/Math.log(2));i++)
    		gaps.add((n/(int)Math.pow(2, i)));
    	for(int g:gaps) {
    		numbers = is.insertionSort(numbers, g);
    	}
    	return numbers;
    }

}
