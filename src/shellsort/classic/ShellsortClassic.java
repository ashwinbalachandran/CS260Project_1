package shellsort.classic;

import java.util.ArrayList;

public class ShellsortClassic {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
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
            shellSort(numbers);
        }
    }
    public static void shellSort(ArrayList<Integer> numbers){
    	for(int i = 0;i<numbers.size();i++) {
    		
    	}
    	
    }

}
