import java.util.ArrayList;
import java.util.Scanner;

import schedule.FitnessSchedule;
import schedule.Schedule;
import schedule.ScheduleKind;
import schedule.UniversitySchedule;

public class ScheduleManager {
	ArrayList<Schedule> schedules = new ArrayList<Schedule>();
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}

	public void addSchedule() {
		int kind = 0;
		Schedule schedule;
		while (kind != 1 && kind != 2) {
			System.out.println("1 for Personal");
			System.out.println("2 for University");
			System.out.println("3 for Fitness");
			System.out.print("Select num 1,2, or 3 for Schedule Kind: ");
			kind = input.nextInt();
			if (kind == 1) {
				schedule = new Schedule(ScheduleKind.Personal);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (kind == 2) {
				schedule = new UniversitySchedule(ScheduleKind.University);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else if (kind == 3) {
				schedule = new FitnessSchedule(ScheduleKind.Fitness);
				schedule.getUserInput(input);
				schedules.add(schedule);
				break;
			}
			else {
				System.out.print("Select num for Schedule Kind between 1 and 2:");
			}
		}
	}

	public void deleteSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		int index = -1;
		for (int i = 0; i<schedules.size(); i++) {
			if (schedules.get(i).getName().equals(scheduleName)) {
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
			if (schedule.getName().equals(scheduleName)) {
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
						String name = input.next();
						schedule.setName(name);
					}
					else if (num == 2) {
						System.out.print("Schedule Date:");
						String date = input.next();
						schedule.setDate(date);
					}	
					else if (num == 3) {
						System.out.print("Schedule Location:");
						String location = input.next();
						schedule.setLocation(location);
					}		
					else if (num == 4) {
						System.out.print("Schedule Object:");
						String object = input.next();
						schedule.setObject(object);
					}
					else if (num == 5) {
						System.out.print("Schedule Priority:");
						int prior = input.nextInt();
						schedule.setPrior(prior);
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
