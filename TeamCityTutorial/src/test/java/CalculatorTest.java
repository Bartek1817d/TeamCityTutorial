import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++)
			for (int j = Integer.MIN_VALUE; j < Integer.MAX_VALUE; j++)
				assertEquals(i + j, Calculator.add(i, j));
	}

	@Test
	public void testSubstract() {
		for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++)
			for (int j = Integer.MIN_VALUE; j < Integer.MAX_VALUE; j++)
				assertEquals(i - j, Calculator.substract(i, j));
	}

	@Test
	public void testMultiply() {
		for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++)
			for (int j = Integer.MIN_VALUE; j < Integer.MAX_VALUE; j++)
				assertEquals(i * j, Calculator.multiply(i, j));
	}

}