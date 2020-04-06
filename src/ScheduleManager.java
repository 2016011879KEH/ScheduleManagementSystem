import java.util.Scanner;

public class ScheduleManager {
	Schedule schedule;
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}
	
	public void addSchedule() {
		schedule = new Schedule();
	    System.out.print("Schedule Name:");
		schedule.name = input.next();
		System.out.print("Schedule Date:");
		schedule.date = input.next();
		System.out.print("Schedule Location:");
		schedule.location = input.next();
		System.out.print("Schedule Object:");
		schedule.object = input.next();
		System.out.print("Schedule Priority:");
		schedule.prior = input.nextInt();
	}
	
	public void deleteSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		if (schedule == null) {
			System.out.println("the schedule has not been registered");
			return;
		}
		if (schedule.name == scheduleName) {
			schedule = null;
			System.out.println("the schedule is deleted");
		}	
	}
	
	public void editSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		if (schedule.name == scheduleName) {
			System.out.println("the schedule to be edited is " + scheduleName);
		}	
	}
	
    public void viewSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		if (schedule.name == scheduleName) {
			schedule.printInfo();
		}
	}

}
