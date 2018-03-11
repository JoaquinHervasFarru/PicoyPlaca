package picoyplaca;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LastCharacter {
	private String licencePlate;

	public LastCharacter(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public String get() {
		Pattern pattern = Pattern.compile("[a-zA-Z]{3}\\-*\\d{2,3}(\\d{1})");
		Matcher matcher = pattern.matcher(licencePlate);
		matcher.find();

		return matcher.group(1);
	}
}