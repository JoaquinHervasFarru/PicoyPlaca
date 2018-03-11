package picoyplaca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LastCharacterTest {

	@Test
	public void shouldGetLastChar() {
		LastCharacter lastCharacterGetter = new LastCharacter("poi0987");
		String lastCharacter = lastCharacterGetter.get();

		assertEquals(lastCharacter, "7");
	}



	@Test
	public void exceptionThrownWhenParsingLicencePlate() {
		LastCharacter lastCharacterGetter = new LastCharacter("158poiu");

		assertThrows(IllegalStateException.class,
				()->{
					lastCharacterGetter.get();					
				});
	}

}
