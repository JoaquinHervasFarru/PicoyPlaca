package picoyplaca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import picoyplaca.LastCharacter;

public class LastCharacterTest {

	@Test
	public void shouldGetLastChar() {
		LastCharacter lastCharacterGetter = new LastCharacter("poi0987");
		String lastCharacter = lastCharacterGetter.get();

		assertEquals(lastCharacter, "7");
/*				//given
					String plate = "poi0987";

				//when


				//then

*/
	}
}
