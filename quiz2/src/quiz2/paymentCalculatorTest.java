package quiz2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class paymentCalculatorTest {

	@Test
	public void test() {
		paymentCalculator test = new paymentCalculator();
		assertEquals(743.65, paymentCalculator(0.1,60,35000));
		

	}

}
