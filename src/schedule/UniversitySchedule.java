package schedule;

import java.util.Scanner;

public class UniversitySchedule extends DeadlineSchedule {

	public UniversitySchedule (ScheduleKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setScheduleName(input);
		setScheduleDatewithYN(input);
		setScheduleLocation(input);
		setScheduleObject(input);
		setSchedulePriority(input);
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Name:" + name + " Date:" + date + " Location:" + location + " Object:" + object +" Priority:" + prior);
	}


}
