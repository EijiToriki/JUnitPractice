package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PaydayTest {
	@ParameterizedTest
	@CsvSource({
		"2020, 6, 25, 0",
		"2020, 6, 1, 24",
		"2020, 6, 26, 29",
	})
	public void testGetNextPayday(int year, int month, int dayOfMonth, int expected) {
		Payday payday = new Payday(LocalDate.of(year, month, dayOfMonth)); 
		int actual = payday.getNextPayday();
		assertEquals(expected, actual);
	}
}
