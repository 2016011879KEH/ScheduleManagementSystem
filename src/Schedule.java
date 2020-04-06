
public class Schedule {
	
	String name;
	String date;
	String location;
	String object;
	int prior;
	
	public Schedule() {
	}
	
	public Schedule(String name, String date) {
		this.name = name;
		this.date = date;
	}
	
    public Schedule(String name, String date, String location,String object, int prior) {
		
		this.name = name;
		this.date = date;
		this.location = location;
		this.object = object;
		this.prior = prior;
	}
    
    public void printInfo() {
    	System.out.println("Name:" + this.name + " Date:" + this.date + " Location:" + this.location + " Object:" + this.object +" Priority:" + this.prior);
    }

}
