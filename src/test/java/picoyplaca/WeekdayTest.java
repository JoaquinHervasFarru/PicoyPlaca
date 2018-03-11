package picoyplaca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import java.time.format.DateTimeParseException;

public class WeekdayTest {
	public class LastCharacterTest {
		@Test
		public void shouldGetWeekday() {
			Weekday weekdayGetter = new Weekday("1990-01-09");
			int weekday = weekdayGetter.get();

			assertEquals(weekday, "2");
		}

		@Test
		public void exceptionTesting() {
			Weekday weekdayGetter = new Weekday("199001-09");
			assertThrows(DateTimeParseException.class,
					()->{
						weekdayGetter.get();					
					});
		}
	}
}