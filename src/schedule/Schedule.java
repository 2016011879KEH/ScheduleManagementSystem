package schedule;

import java.io.Serializable;
import java.util.Scanner;

import exception.DateFormatException;

public abstract class Schedule implements ScheduleInput,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4838304340775189541L;
	protected ScheduleKind kind = ScheduleKind.Personal;
	protected String name;
	protected String date;
	protected String location;
	protected String object;
	protected int prior;


	public Schedule() {
	}

	public Schedule(ScheduleKind kind) {
		this.kind = kind;
	}

	public Schedule(String name, String date) {
		this.name = name;
		this.date = date;
	}

	public Schedule(ScheduleKind schedule, String name, String date, String location, String object, int prior) {
		this.name = name;
		this.date = date;
		this.location = location;
		this.object = object;
		this.prior = prior;
	}

	public Schedule(String name, String date, String location, String object, int prior) {
		this.kind = kind;
		this.name = name;
		this.date = date;
		this.location = location;
		this.object = object;
		this.prior = prior;
	}

	public ScheduleKind getKind() {
		return kind;
	}

	public void setKind(ScheduleKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) throws DateFormatException {
		if (!date.contains("/") && !date.equals("")) {
			throw new DateFormatException();
		}
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getObject() {
		return object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public int getPrior() {
		return prior;
	}

	public void setPrior(int prior) {
		this.prior = prior;
	}

	public abstract void printInfo();

	public void setScheduleName(Scanner input) {
		System.out.print("Schedule Name:");
		String name = input.next();
		this.setName(name);
	}

	public void setScheduleDate(Scanner input) {
		String date = "";
		while(!date.contains("/")) {
			System.out.print("Schedule Date:");
			date = input.next();
			try {
				this.setDate(date);
			} catch (DateFormatException e) {
				System.out.println("Incorrect Date Format. Put the schedule date that contains /");
			}
		}
	}

	public void setScheduleLocation(Scanner input) {
		System.out.print("Schedule Location:");
		String location = input.next();
		this.setLocation(location);
	}

	public void setScheduleObject(Scanner input) {
		System.out.print("Schedule Object:");
		String object = input.next();
		this.setObject(object);
	}

	public void setSchedulePriority(Scanner input) {
		System.out.print("Schedule Priority:");
		int prior = input.nextInt();
		this.setPrior(prior);
	}

	public String getKindString() {
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
		return skind;
	}
}

