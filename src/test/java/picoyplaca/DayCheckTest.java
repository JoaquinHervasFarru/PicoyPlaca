package picoyplaca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayCheckTest {
	@Test
	public void shouldGetFalse() {
		DayCheck dayCheck = new DayCheck(6);
		Boolean weekdayValue = dayCheck.check();

		assertEquals(weekdayValue, false);
	}

	@Test
	public void shouldGetTrue() {
		DayCheck dayCheck = new DayCheck(5);
		Boolean weekdayValue = dayCheck.check();

		assertEquals(weekdayValue, true);
	}	
	
}
