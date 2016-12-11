import java.time.*;

/*
 * Created by: Leena Chaleunsouk
 * On: 12/03/16 @ 6:20
 */

public class Flight 
{
	String startPoint;
	String endPoint;
	Duration howLong;
	LocalDateTime startTime;
	LocalDateTime endTime;
	int numOfPassengers;
	int maxPassangers;
	String [] passengers = new String [maxPassangers];
	
	public Flight()
	{
		
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getEndPoint() {
		return endPoint;
	}

	public void setEndPoint(String endPoint) {
		this.endPoint = endPoint;
	}

	public Duration getHowLong() {
		return howLong;
	}

	public void setHowLong(Duration howLong) {
		this.howLong = howLong;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime startTime, Duration howLong) {
		this.endTime = this.startTime.plus(this.howLong);
	}

	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}

	public int getMaxPassangers() {
		return maxPassangers;
	}

	public void setMaxPassangers(int maxPassangers) {
		this.maxPassangers = maxPassangers;
	}

	public String[] getPassengers() {
		return passengers;
	}

	public void setPassengers(String[] passengers) {
		this.passengers = passengers;
	}
	

	
	
}
