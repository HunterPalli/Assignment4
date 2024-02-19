package accidentpack;

public class Report implements Comparable<Report>{
	private String ID;
	private int Severity; 
	private String Start_Time; 
	private String End_Time; 
	private String Street; 
	private String City; 
	private String County; 
	private String State; 
	private Integer Temp;
	private Integer Humidity;
	private Integer Visibility; 
	private String Weather;
	private boolean Crossing;
	private String Sun;
	

	public static void main(String[] args) {
		

	}
	
	public Report(String ID, int Severity, String Start_Time, String End_Time, String Street, String City, String County, String State, int Temp, int Humidity, int Visibility, String Weather, boolean Crossing, String Sun) {
		this.ID = ID;
		this.Severity = Severity;
		this.Start_Time = Start_Time;
		this.End_Time = End_Time;
		this.Street = Street;
		this.City = City;
		this.County = County;
		this.State = State;
		this.Temp = Temp;
		this.Humidity = Humidity;
		this.Visibility = Visibility;
		this.Weather = Weather;
		this.Crossing = Crossing;
		this.Sun = Sun;
	}

	/**
	 * @return value of ID
	 */
	public String getID() {
		return ID;
	}

	/**
	 * @param iD
	 */
	public void setID(String iD) {
		this.ID = iD;
	}

	/**
	 * @return value of Severity
	 */
	public int getSeverity() {
		return Severity;
	}

	/**
	 * @param severity
	 */
	public void setSeverity(int severity) {
		Severity = severity;
	}

	/**
	 * @return the start_Time
	 */
	public String getStart_Time() {
		return Start_Time;
	}

	/**
	 * @param start_Time the start_Time to set
	 */
	public void setStart_Time(String start_Time) {
		Start_Time = start_Time;
	}

	/**
	 * @return the end_Time
	 */
	public String getEnd_Time() {
		return End_Time;
	}

	/**
	 * @param end_Time the end_Time to set
	 */
	public void setEnd_Time(String end_Time) {
		End_Time = end_Time;
	}

	/**
	 * @return String the street that the accident took place on
	 */
	public String getStreet() {
		return Street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		Street = street;
	}

	/**
	 * @return the city that the accident took place in
	 */
	public String getCity() {
		return City;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		City = city;
	}

	/**
	 * @return the county that the accident took place in
	 */
	public String getCounty() {
		return County;
	}

	/**
	 * @param county the county to set
	 */
	public void setCounty(String county) {
		County = county;
	}

	/**
	 * @return the state that the accident took place in
	 */
	public String getState() {
		return State;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		State = state;
	}

	/**
	 * @return the temperature from when the accident took place
	 */
	public Integer getTemp() {
		return Temp;
	}

	/**
	 * @param temp the temp to set
	 */
	public void setTemp(Integer temp) {
		Temp = temp;
	}

	/**
	 * @return the humidity from when the accident took place
	 */
	public Integer getHumidity() {
		return Humidity;
	}

	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(Integer humidity) {
		Humidity = humidity;
	}

	/**
	 * @return the visibility from when the accident took place
	 */
	public Integer getVisibility() {
		return Visibility;
	}

	/**
	 * @param visibility the visibility to set
	 */
	public void setVisibility(Integer visibility) {
		Visibility = visibility;
	}

	/**
	 * @return the weather condition from the accident
	 */
	public String getWeather() {
		return Weather;
	}

	/**
	 * @param weather the weather to set
	 */
	public void setWeather(String weather) {
		Weather = weather;
	}

	/**
	 * @return the crossing
	 */
	public boolean isCrossing() {
		return Crossing;
	}

	/**
	 * @param crossing the crossing to set
	 */
	public void setCrossing(boolean crossing) {
		Crossing = crossing;
	}

	/**
	 * @return the sun
	 */
	public String getSun() {
		return Sun;
	}

	/**
	 * @param sun the sun to set
	 */
	public void setSun(String sun) {
		Sun = sun;
	}
	
	/**
	 * method to convert report object to a string for easy printing
	 */
	@Override
	public String toString() {
		return "ID: " + this.ID + " Severity: " + this.Severity + " Start Time: " + this.Start_Time + " End Time: " + this.End_Time + " Street: " + this.Street + " City: " + this.City + " County: " + this.County + " State: " + this.State + " Temp: " + this.Temp + " Humidity: " + this.Humidity + " Visibility: " + this.Visibility + " Weather: " + this.Weather + " Crossing: " + this.Crossing + " Sunrise/Sunset: " + this.Sun;  
	}
	
	/**
	 * compareTo method for comparing two reports based on their visibilities
	 */
	@Override
	public int compareTo(Report a) {
		return this.Visibility - a.Visibility;
	}

}
