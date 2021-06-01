package price;

import static org.junit.Assert.*;

import org.junit.Test;

public class PriceTest {
	@Test
	public void testGoSwim1() {
		Price p = new Price(false, 8, 9, null, 10, 0, 10);
		assertEquals("HelloWorld", p.goSwim());
	}
	
	

}
