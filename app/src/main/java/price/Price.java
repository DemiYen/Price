
package price;

public class Price {

	public int goSwim(boolean coach, int timeIn, int timeOut, 
					String timeInterval, int people, int coachQ, int studentQ) {
		int PRICE = 0;
		
		if(coach == false) {
			PRICE = 200 * people;
		}else{
			return 100;
		}
		return PRICE;
	}
	
}
		
		