package testdriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import classicshellsort.ShellsortClassic;

public class Driver {
	private static final Logger LOG = LogManager.getLogger(Driver.class);

	public static void main(String[] args) throws IOException {
		int ctr=0;
		try (BufferedReader br = new BufferedReader(new FileReader("udp.txt"))) {
			for (String line; (line = br.readLine()) != null;) {
				ArrayList<Integer> num = new ArrayList<Integer>();
				ctr++;
				String[] lines = line.split(" ");
				for (String n : lines) {
					try {
						int number = Integer.parseInt(n);
						num.add(number);
					} catch (NumberFormatException nfe) {
						LOG.error("Invalid number found at line:"+ctr);
					}
				}
				ShellsortClassic ssc = new ShellsortClassic();
				num = ssc.shellSort(num);
				ssc.printSortedList(num);
			}
		}
	}

}
