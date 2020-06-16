package schedule;

import java.util.Scanner;

import exception.DateFormatException;

public interface ScheduleInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setDate(String date) throws DateFormatException;
	
	public String getDate();
	
	public void setLocation(String location);
	
	public String getLocation();
	
	public void setObject(String object);
	
	public String getObject();
	
	public void setPrior(int prior);
	
	public int getPrior();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setScheduleName(Scanner input);
	
	public void setScheduleDate(Scanner input);
	
	public void setScheduleLocation(Scanner input);
	
	public void setScheduleObject(Scanner input);
	
	public void setSchedulePriority(Scanner input);
	
}
