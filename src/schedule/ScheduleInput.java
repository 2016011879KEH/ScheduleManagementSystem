package schedule;

import java.util.Scanner;

public interface ScheduleInput {
	
	public String getName();
	
	public void setName(String name);
	
	public void setDate(String date);
	
	public void setLocation(String location);
	
	public void setObject(String object);
	
	public void setPrior(int prior);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setScheduleName(Scanner input);
	
	public void setScheduleDate(Scanner input);
	
	public void setScheduleLocation(Scanner input);
	
	public void setScheduleObject(Scanner input);
	
	public void setSchedulePriority(Scanner input);
	
}
