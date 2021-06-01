package price;
import org.junit.Test;
import static org.junit.Assert.*;

public class PriceTest {
	@Test
	public void testGoSwim1() {
		assertEquals(1, new Price().goSwim(true));
	}
	
	@Test
	public void testGoSwim2() {
		assertEquals(0, new Price().goSwim(false));
	}

}
