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
			int num = -1;
			while (num != 6) {
				System.out.println("**Schedule Info Edit Menu**");
				System.out.println(" 1.Edit Schedule Name");
				System.out.println(" 2.Edit Schedule Date");
				System.out.println(" 3.Edit Schedule Location");
				System.out.println(" 4.Edit Schedule Object");
				System.out.println(" 5.Edit Schedule Priority");
				System.out.println("Select one number between 1-5:");
				num = input.nextInt();
				if (num == 1) {
					System.out.print("Schedule Name:");
					schedule.name = input.next();
				}
				else if (num == 2) {
					System.out.print("Schedule Date:");
					schedule.date = input.next();
				}	
				else if (num == 3) {
					System.out.print("Schedule Location:");
					schedule.location = input.next();
				}		
				else if (num == 4) {
					System.out.print("Schedule Object:");
					schedule.object = input.next();
				}
				else if (num == 5) {
					System.out.print("Schedule Priority:");
					schedule.prior = input.nextInt();
				}
				else {
					continue;
				}
			}
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
