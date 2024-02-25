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
	
	/**
	 * Scan method to scan the CSV file and create an ArrayList of accident reports that
	 * are from the given state and county and is sorted by start time in ascending order
	 * @param loc Location of accidents CSV file
	 * @param state State of the county to sort the ArrayList by
	 * @param county County to sort the ArrayList by
	 * @return ArrayList of report objects sorted by state+county and start time in ascending order
	 * @throws FileNotFoundException
	 */
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
	
	/**
	 * Method to read the CSV directly into a queue
	 * sorted by start time in ascending order
	 * @param loc Location of the CSV file
	 * @param state State to search for in CSV
	 * @param county County to search for in CSV
	 * @return Sorted Queue of accident reports from the given state+county
	 * @throws FileNotFoundException
	 */
	public static Queue<Report> readToQueue(String loc, String state, String county) throws FileNotFoundException{
		Queue<Report> end = new LinkedList<Report>();
		ArrayList<Report> a = Scan(loc, state, county);
		for(int i = 0; i < a.size(); i++) {
			end.add(a.get(i));
		}
		return end;
		
	}
	
	/**
	 * Method to process queues to determine number of needed counters
	 * @param a Queue of reports to process
	 * 
	 */
	public static void processQueue(Queue<Report> a) {
		int counters = 1;
		int time = (counters*24)*60;
		int totalTime = 0;
		String currentDate = "";
		for(Report report : a) {
		
			}
		System.out.println("needs " + counters + " counters.");
	}

}
