import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = 5;

		while(num != 6) {
			System.out.println("***Schedule Management System Menu***");
			System.out.println(" 1.Add Schedule");
			System.out.println(" 2.Delete Schedule");
			System.out.println(" 3.Edit Schedule");
			System.out.println(" 4.View Schedule");
			System.out.println(" 5.Show a menu");
			System.out.println(" 6.Exit");
			System.out.println("Select one number between 1-6:");
			num = input.nextInt();
			if (num == 1) {
				addSchedule();
			}
			
			else if (num == 2) {
				deleteSchedule();
			}
			
			else if (num == 3) {
				editSchedule();
			}
			
			else if (num == 4) {
				viewSchedule();
			}
			else {
				continue;
			}
		}
	}
	
	public static void addSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		System.out.print("Schedule Date:");
		String scheduleDate = input.next();
		System.out.print("Schedule Location:");
		String scheduleLocation = input.next();
		System.out.print("Schedule Object:");
		String scheduleObject = input.next();
		System.out.print("Schedule Priority:");
		int schedulePriority = input.nextInt();
	}
	
	public static void deleteSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		
	}
	
	public static void editSchedule() {
		Scanner input = new Scanner(System.in);
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		
	}
	
    public static void viewSchedule() {
    	Scanner input = new Scanner(System.in);
		System.out.print("Schedule Name:");
		String scheduleName = input.next();
		
	}

}
