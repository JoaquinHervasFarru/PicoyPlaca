package picoyplaca;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TimeCheckTest {

	@Test
	public void shouldGetFalseInTimeCheck() {
		TimeCheck timeCheck = new TimeCheck(1500);
		Boolean timeValue = timeCheck.check();

		assertEquals(timeValue, false);
	}

	@Test
	public void shouldGetTrueInTimeCheck(){
		TimeCheck timeCheck = new TimeCheck(800);
		Boolean timeValue = timeCheck.check();

		assertEquals(timeValue, true);
	}
}