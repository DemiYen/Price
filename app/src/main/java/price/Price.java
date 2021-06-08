

package price;

public class Price {

	public int goSwim(boolean coach, int timeIn, int timeOut, 
					String timeInterval, int people, int coachQ, int studentQ) {
		int price = 0;
		
		if(coach == false) {
			price = 200 * people;
		}else if(coach == true) {
			if(people < 10) {
				price = (timeOut - timeIn) * 3000;
			}else if(people >= 10) {
				if(timeInterval.equals("A") || timeInterval.equals("B") || timeInterval.equals("C")
						|| timeInterval.equals("D") || timeInterval.equals("E")) {
					price = (120 * coachQ) + (70 * studentQ);
				}else if(timeInterval.equals("AB") || timeInterval.equals("AC") || timeInterval.equals("AD") 
						|| timeInterval.equals("AE") || timeInterval.equals("BC") || timeInterval.equals("BD")
						|| timeInterval.equals("BE") || timeInterval.equals("CD") || timeInterval.equals("CE")
						|| timeInterval.equals("DE")) {
					price = ((120 * coachQ) + (70 * studentQ)) * 2;
				}else if(timeInterval.equals("ABC") || timeInterval.equals("ABD") || timeInterval.equals("ABE")
						|| timeInterval.equals("ACD") || timeInterval.equals("ACE") || timeInterval.equals("ADE")
						|| timeInterval.equals("BCD") || timeInterval.equals("BCE") || timeInterval.equals("BDE")
						|| timeInterval.equals("CDE")) {
					price = ((120 * coachQ) + (70 * studentQ)) * 3;
				}else if(timeInterval.equals("ABCD") || timeInterval.equals("ABCE") || timeInterval.equals("ABDE")
						|| timeInterval.equals("ACDE") || timeInterval.equals("BCDE")) {
					price = ((120 * coachQ) + (70 * studentQ)) * 4;
				}else if(timeInterval.equals("ABCDE")) {
					price = ((120 * coachQ) + (70 * studentQ)) * 5;
				}
			}
		}	
		return price;
	}
	
}
		
		