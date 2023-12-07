package org.example;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class BusinessDayServiceTest {
    private final BusinessDayService service = new BusinessDayService();

    @Test
    public void testIsBusinessDay() {
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 10, 20));
		assertTrue(actual);
	}

    @Test
    public void testHolidayIsNotBusinessDay() {
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 11, 3));
		assertFalse(actual);
	}
    
    @Test
    public void testSaturdayIsNotBusinessDay() {
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 17));
		assertFalse(actual);
	}
    
    @Test
    public void testSundayIsNotBusinessDay() {
    	boolean actual = service.isBusinessDay(LocalDate.of(2022, 12, 25));
		assertFalse(actual);
	}
    
    @Test
    public void testGetNextBusinessDayIsNull() {
    	assertNull(service.getNextBusinessDay(LocalDate.of(2022, 8, 11), 5));
    }
    
    @Test
    public void testGetNextBusinessDay() {
    	assertNotNull(service.getNextBusinessDay(LocalDate.of(2022, 9, 23), 5));
    	
    	LocalDate expecteDate = LocalDate.of(2022, 9, 26);
    	LocalDate actualDate = service.getNextBusinessDay(LocalDate.of(2022, 9, 23), 5);
    	assertEquals(expecteDate, actualDate);
    }
    
    @Test
    public void testGetBusinessDayArray() {
    	
    	LocalDate[] expecteDates = new LocalDate[] {
    		LocalDate.of(2022, 10, 7),
    		LocalDate.of(2022, 10, 11),
    		LocalDate.of(2022, 10, 12)
    	};
    	LocalDate[] actualDates = service.getBusinessDayArray(LocalDate.of(2022, 10, 7), 5);
    	assertArrayEquals(expecteDates, actualDates);
    }

    @Test
    public void testGetBusinessDayList() {
    	List<LocalDate> expecteDates = Arrays.asList(
    		LocalDate.of(2022, 10, 7),
    		LocalDate.of(2022, 10, 11),
    		LocalDate.of(2022, 10, 12)
    	);
    	List<LocalDate> actualDates = service.getBusinessDayList(LocalDate.of(2022, 10, 7), 5);
    	assertIterableEquals(expecteDates, actualDates);
    }
    
}
