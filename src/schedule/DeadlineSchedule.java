package schedule;

import java.util.Scanner;

import exception.DateFormatException;

public abstract class DeadlineSchedule extends Schedule {

	public DeadlineSchedule (ScheduleKind kind) {
		super(kind);
	}

	public abstract void getUserInput(Scanner input);

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " Name:" + name + " Date:" + date + " Location:" + location + " Object:" + object +" Priority:" + prior);
	}

	public void setScheduleDatewithYN(Scanner input) {
		char answer = 'x';
		while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
		{
			System.out.print("Does the schedule have a deadline? (Y/N)");
			answer = input.next().charAt(0);
			try {
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
			catch(DateFormatException e){
				System.out.println("Incorrect Date Format. Put the schedule date that contains /");
			}
		}
	}
}
