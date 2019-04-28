package shellsort.classic;

import java.util.ArrayList;

import insertionsort.general.InsertionSort;

public class ShellsortClassic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        ShellsortClassic ssc = new ShellsortClassic();
        if (args.length > 0) {
            try {
                for (String n : args) {
                    int num = Integer.parseInt(n);
                    numbers.add(num);
                }
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid input in arguments :)");
                System.err.println(nfe.toString());
            }
        } else {
            numbers.add(11);
            numbers.add(21);
            numbers.add(13);
            numbers.add(41);
            numbers.add(15);
            numbers.add(61);
            numbers.add(17);
            numbers.add(81);
            numbers.add(19);
            numbers = ssc.shellSort(numbers);
            ssc.printSortedList(numbers);
        }
    }
    private void printSortedList(ArrayList<Integer> numbers) {
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
