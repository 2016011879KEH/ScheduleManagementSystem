import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import schedule.FitnessSchedule;
import schedule.PersonalSchedule;
import schedule.Schedule;
import schedule.ScheduleInput;
import schedule.ScheduleKind;
import schedule.UniversitySchedule;

public class ScheduleManager {
	ArrayList<ScheduleInput> schedules = new ArrayList<ScheduleInput>();
	Scanner input;
	ScheduleManager(Scanner input){
		this.input = input;
	}

	public void addSchedule() {
		int kind = 0;
		ScheduleInput scheduleInput;
		while (kind < 1 || kind > 3) {
			try {
				System.out.println("1 for Personal");
				System.out.println("2 for University");
				System.out.println("3 for Fitness");
				System.out.print("Select num 1,2, or 3 for Schedule Kind: ");
				kind = input.nextInt();
				if (kind == 1) {
					scheduleInput = new PersonalSchedule(ScheduleKind.Personal);
					scheduleInput.getUserInput(input);
					schedules.add(scheduleInput);
					break;
				}
				else if (kind == 2) {
					scheduleInput = new UniversitySchedule(ScheduleKind.University);
					scheduleInput.getUserInput(input);
					schedules.add(scheduleInput);
					break;
				}
				else if (kind == 3) {
					scheduleInput = new FitnessSchedule(ScheduleKind.Fitness);
					scheduleInput.getUserInput(input);
					schedules.add(scheduleInput);
					break;
				}
				else {
					System.out.print("Select num for Schedule Kind between 1 and 2:");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 3!");
				if(input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}

	public void deleteSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		int index = findIndex(scheduleName);
		removefromSchedules(index ,scheduleName);
	}
	
	public int findIndex (String scheduleName) {
		int index = -1;
		for (int i = 0; i<schedules.size(); i++) {
			if (schedules.get(i).getName().equals(scheduleName)) {
				index = i;
				break;
			}	
		}
		return index;
	}
	
	public int removefromSchedules(int index, String scheduleName) {
		if (index >= 0) {
			schedules.remove(index);
			System.out.println("the schedule" + scheduleName + " is deleted");
			return 1;
		}
		else {
			System.out.println("the schedule has not been registered");
			return -1;
		}
	}

	public void editSchedule() {
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		for (int i = 0; i<schedules.size(); i++) {
			ScheduleInput schedule = schedules.get(i);
			if (schedule.getName().equals(scheduleName)) {
				int num = -1;
				while (num != 6) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						schedule.setScheduleName(input);
						break;
					case 2:
						schedule.setScheduleDate(input);
						break;
					case 3:
						schedule.setScheduleLocation(input);
						break;
					case 4:
						schedule.setScheduleObject(input);
						break;
					case 5:
						schedule.setSchedulePriority(input);
						break;
					default:
						continue;
					}
				} //while
				break;
			} // if
		} //for
	}

	public void viewSchedules() {
		System.out.println("# of registered schedule:" + schedules.size());
		for (int i = 0; i<schedules.size(); i++) {
			schedules.get(i).printInfo();
		}
	}

	public void showEditMenu() {
		System.out.println("**Schedule Info Edit Menu**");
		System.out.println(" 1.Edit Schedule Name");
		System.out.println(" 2.Edit Schedule Date");
		System.out.println(" 3.Edit Schedule Location");
		System.out.println(" 4.Edit Schedule Object");
		System.out.println(" 5.Edit Schedule Priority");
		System.out.println(" 6.Exit");
		
	}
}
