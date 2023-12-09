package junit.sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CustomerTest {

	@ParameterizedTest
	@CsvSource({
		"20, '東京都', 1, true",
		"20, '東京都', 0, false",
		"20, '千葉県', 1, false",
		"19, '東京都', 1, false",
	})
	public void testCheckBonus(int age, String address, int count, boolean expected) {
		Customer customer = new Customer();
		boolean actual = customer.checkBonus(age, address, count);
		assertEquals(expected, actual);
	}

}
