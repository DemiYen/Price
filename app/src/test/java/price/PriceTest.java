package price;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceTest {
	@Test
	public void testGoSwim1() {
		Price p = new Price(false, 8, 9, null, 10, 0, 10);
		assertEquals("HelloWorld", p.goSwim());
	}
