package price;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceTest {
	@Test
	public void testGoSwim1() {
		Price p = new Price();
		assertEquals(1, p.goSwim(true));
	}
	
	

}
