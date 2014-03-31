package org.upv.ufasu.weather;

import junit.framework.TestCase;

public class TemperatureConversorTest extends TestCase {

	public TemperatureConversorTest(String name) {
		super(name);
	}

	public void testConversor() throws Exception {

		TemperatureConversor tc = new TemperatureConversor();

		assertEquals("10", tc.convertir("50"));

	}

}
