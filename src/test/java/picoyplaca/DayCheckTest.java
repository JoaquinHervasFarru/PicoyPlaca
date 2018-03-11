package picoyplaca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DayCheckTest {
	@Test
	public void shouldGetTrueInDayCheck() {
		DayCheck dayCheck = new DayCheck(6,"5");
		Boolean weekdayValue = dayCheck.check();

		assertEquals(weekdayValue, true);
	}

	@Test
	public void shouldGetFalseInDayCheckWith9() {
		DayCheck dayCheck = new DayCheck(5,"9");
		Boolean weekdayValue = dayCheck.check();

		assertEquals(weekdayValue, false);
	}	

	@Test
	public void shouldGetFalseInDayCheckWith0() {
		DayCheck dayCheck = new DayCheck(5,"0");
		Boolean weekdayValue = dayCheck.check();

		assertEquals(weekdayValue, false);
	}	
}