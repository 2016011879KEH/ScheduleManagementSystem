import java.util.ArrayList;
import java.util.Scanner;

public class ScheduleManager {
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}

	public void addSchedule() {
		Schedule schedule = new Schedule();
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
		schedules.add(schedule);
	}

	public void deleteSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		int index = -1;
		for (int i = 0; i<schedules.size(); i++) {
			if (schedules.get(i).name.equals(scheduleName)) {
				index = i;
				break;
			}	
		}

		if (index >= 0) {
			schedules.remove(index);
			System.out.println("the schedule" + scheduleName + " is deleted");			
		}
		else {
			System.out.println("the schedule has not been registered");
			return;
		}

	}

	public void editSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		for (int i = 0; i<schedules.size(); i++) {
			Schedule schedule = schedules.get(i);
			if (schedule.name .equals(scheduleName)) {
				int num = -1;
				while (num != 6) {
					System.out.println("**Schedule Info Edit Menu**");
					System.out.println(" 1.Edit Schedule Name");
					System.out.println(" 2.Edit Schedule Date");
					System.out.println(" 3.Edit Schedule Location");
					System.out.println(" 4.Edit Schedule Object");
					System.out.println(" 5.Edit Schedule Priority");
					System.out.println(" 6.Exit");
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
					} // if
				} //while
				break;
			} // if

		} //for
	}

	public void viewSchedules() {
		//		System.out.print("Schedule Name:");
		//		String scheduleName = input.next();
		for (int i = 0; i<schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}
}
