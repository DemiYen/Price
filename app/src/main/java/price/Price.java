
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

	public int goSwim() {
		int PRICE = 0;
		
		if(coach == false) {
			PRICE = 200 * people;
		}else{
			if(people < 10) {
				PRICE = (timeOut - timeIn) * 3000;
			}else{
				if(timeInterval.equals("A")) {
					PRICE = (120 * coachQ) + (70 * studentQ);
				}else if(timeInterval.equals("AB")) {
					PRICE = ((120 * coachQ) + (70 * studentQ)) * 2;
				}else if(timeInterval.equals("ABC")) {
					PRICE = ((120 * coachQ) + (70 * studentQ)) * 3;
				}else if(timeInterval.equals("ABCD")) {
					PRICE = ((120 * coachQ) + (70 * studentQ)) * 4;
				}else {
					PRICE = 0;
				}
			}
		}	
		return PRICE;
	}
	
}