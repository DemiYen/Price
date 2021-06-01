package price;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceTest {
	@Test
	public void testGoSwim1() {
		Price p = new Price();
		assertEquals(2000, p.goSwim(false, 8, 9, null, 10, 0, 10));
	}
	
	@Test
	public void testGoSwim2() {
		Price p = new Price();
		assertEquals(3000, p.goSwim(true, 8, 9, null, 7, 0, 7));
	}
	
	@Test
	public void testGoSwim3() {
		Price p = new Price();
		assertEquals(6000, p.goSwim(true, 16, 18, null, 5, 0, 5));
	}
	
	@Test
	public void testGoSwim4() {
		Price p = new Price();
		assertEquals(1650, p.goSwim(true, 0, 0, "A", 20, 5, 15));
	}
	
	@Test
	public void testGoSwim5() {
		Price p = new Price();
		assertEquals(2400, p.goSwim(true, 0, 0, "AB", 15, 3, 12));
	}
	
	@Test
	public void testGoSwim6() {
		Price p = new Price();
		assertEquals(3030, p.goSwim(true, 0, 0, "ABC", 13, 2, 11));
	}
	
	@Test
	public void testGoSwim7() {
		Price p = new Price();
		assertEquals(8200, p.goSwim(true, 0, 0, "ABCD", 25, 6, 19));
	}
	
	@Test
	public void testGoSwim8() {
		Price p = new Price();
		assertEquals(3750, p.goSwim(true, 0, 0, "ABCDE", 10, 1, 9));
	}
	

}
