package accidentpack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Program 4 file where the simulation will take place
 *
 */
public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static ArrayList<Report> Scan(String loc, String state, String county) throws FileNotFoundException {
		long start = System.currentTimeMillis();
		ArrayList<Report> fin = new ArrayList<Report>();
		Scanner scnr = new Scanner(new File(loc));
		scnr.nextLine();
		while(scnr.hasNextLine()) {
			String split[] = scnr.nextLine().split(",");
			Report reported = new Report(split[0], (int) Integer.parseInt(split[1]), split[2], split[3], split[4], split[5], split[6], split[7], (int) Double.parseDouble(split[8]), (int) Double.parseDouble(split[9]), (int) Double.parseDouble(split[10]), split[11], Boolean.parseBoolean(split[12]), split[13]);
			if(reported.getState().equals(state) && reported.getCounty().equals(county)) {
				fin.add(reported);
			}
		}
		Collections.sort(fin);
		long end = System.currentTimeMillis();
		System.out.println((end-start) + " milliseconds to read the records into arraylist by state and county and sort by start time");
		return fin;
	}

}
