import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = new ScheduleManager(input);
		int num = -1;
		while (num != 5) {
			showMenu();
			num = input.nextInt();
			switch(num) {
			case 1:
				scheduleManager.addSchedule();
				break;
			case 2:
				scheduleManager.deleteSchedule();
				break;
			case 3:
				scheduleManager.editSchedule();
				break;
			case 4:
				scheduleManager.viewSchedules();
				break;
			default:
				continue;
			}
		}
	}

	public static void showMenu() {
		System.out.println("***Schedule Management System Menu***");
		System.out.println(" 1.Add Schedule");
		System.out.println(" 2.Delete Schedule");
		System.out.println(" 3.Edit Schedule");
		System.out.println(" 4.View Schedules");
		System.out.println(" 5.Exit");
		System.out.println("Select one number between 1-5:");
	}
}
