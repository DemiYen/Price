
package price;

public class Price {

	public boolean coach;
	public int timeIn,timeOut,people,coachQ,studentQ;
	public String timeInterval;

	public Price(boolean coach, int timeIn, int timeOut, 
					String timeInterval, int people, int coachQ, int studentQ){
		this.coach = coach;
		this.timeIn = timeIn;
		this.timeOut = timeOut;
		this.timeInterval = timeInterval;
		this.people = people;
		this.coachQ = coachQ;
		this.studentQ = studentQ;
	}

	public String goSwim() {
		return "HelloWorld";
	}
	
}