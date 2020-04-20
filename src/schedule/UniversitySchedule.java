package schedule;

import java.util.Scanner;

public class UniversitySchedule extends Schedule {

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

}
