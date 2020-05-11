package schedule;

import java.util.Scanner;

public class FitnessSchedule extends DeadlineSchedule {

	protected String gymName;
	protected String gymDate;

	public FitnessSchedule(ScheduleKind kind) {
		super(kind);
	}
	

	public void getUserInput(Scanner input) {
		setScheduleName(input);
		setScheduleDatewithYN(input);
		setSGYMMembershipwithYN(input);
		setScheduleLocation(input);
		setScheduleObject(input);
		setSchedulePriority(input);
	}
	public void setSGYMMembershipwithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does the Gym Membership have a deadline? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				setScheduleDate(input);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDate("");
				break;
			}
			else {

			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Name:" + name + " Date:" + date 
				+ " Location:" + location + " Object:" + object 
				+" Priority:" + prior + " GymName:" + location 
				+ " GymFinalDate:" + date);
	}
	
}
