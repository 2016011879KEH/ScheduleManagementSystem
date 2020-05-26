import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		ScheduleManager scheduleManager = getObject("schedulemanager.ser");
		if(scheduleManager ==null) {
		   scheduleManager = new ScheduleManager(input);
		}
		else {
			scheduleManager.setScanner(input);
		}

		selectMenu(input,scheduleManager);
		putObject(scheduleManager,"schedulemanager.ser");
	}
	
	public static void selectMenu(Scanner input, ScheduleManager scheduleManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch(num) {
				case 1:
					scheduleManager.addSchedule();
					logger.log("add schedule");
					break;
				case 2:
					scheduleManager.deleteSchedule();
					logger.log("delete schedule");
					break;
				case 3:
					scheduleManager.editSchedule();
					logger.log("edit schedule");
					break;
				case 4:
					scheduleManager.viewSchedules();
					logger.log("view schedule");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e){
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
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
	
	public static ScheduleManager getObject(String filename) {
		ScheduleManager scheduleManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			scheduleManager = (ScheduleManager) in.readObject();
			
			in.close();
			file.close();

		} catch (FileNotFoundException e) {
			return scheduleManager;

		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return scheduleManager;

	}
	
	public static void putObject(ScheduleManager scheduleManager, String filename) {
		
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(scheduleManager);
			
			out.close();
			file.close();

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}
