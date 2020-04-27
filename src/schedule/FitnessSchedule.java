package schedule;

import java.util.Scanner;

public class FitnessSchedule extends Schedule {

	public FitnessSchedule(ScheduleKind kind) {
		super(kind);
	}

	protected String gymName;
	protected String gymDate;

	public void getUserInput(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);

		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does the schedule have a deadline? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Schedule Date:");
				String date = input.next();
				this.setDate(date);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDate("");
				break;
			}
			else {

			}
		}

		answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does the Gym Membership have a deadline? (Y/N)");
			answer = input.next().charAt(0);
			if(answer == 'y' || answer == 'Y') {
				System.out.print("Gym Membership final Date:");
				String date = input.next();
				this.setDate(date);
				break;
			}
			else if(answer == 'n' || answer == 'N') {
				this.setDate("");
				break;
			}
			else {

			}
		}

		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);

		System.out.print("Schedule Object:");
		String object = input.next();
		this.setObject(object);
		
		System.out.print("Schedule Priority:");
		int prior = input.nextInt();
		this.setPrior(prior);

	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Personal:
			skind = "My's";
			break;
		case University:
			skind = "Univ.";
			break;
		case Family:
			skind = "Fam";
			break;
		case Fitness:
			skind = "Fit";
			break;
		default:

		}
		System.out.println("kind:" + skind + " Name:" + name + " Date:" + date 
				+ " Location:" + location + " Object:" + object 
				+" Priority:" + prior + " GymName:" + location 
				+ " GymFinalDate:" + date);
	}
}
