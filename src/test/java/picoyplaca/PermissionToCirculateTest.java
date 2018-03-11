package picoyplaca;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PermissionToCirculateTest {
	@Test
	public void doubleTrueCheck() {
		PermissionToCirculate permissionToCirculate = new PermissionToCirculate(true,true);
		int permissionValue = permissionToCirculate.get();

		assertEquals(permissionValue, 1);
	}

	@Test
	public void falseTrueCheck() {
		PermissionToCirculate permissionToCirculate = new PermissionToCirculate(false,true);
		int permissionValue = permissionToCirculate.get();

		assertEquals(permissionValue, 0);
	}
	@Test
	public void trueFalseCheck() {
		PermissionToCirculate permissionToCirculate = new PermissionToCirculate(true,false);
		int permissionValue = permissionToCirculate.get();

		assertEquals(permissionValue, 0);
	}
	@Test
	public void doubleFalseCheck() {
		PermissionToCirculate permissionToCirculate = new PermissionToCirculate(false,false);
		int permissionValue = permissionToCirculate.get();

		assertEquals(permissionValue, 0);
	}
}
