package org.upv.ufasu.weather;

public class TemperatureConversor {

	public String convertir(String temp) {

		String tempFinal;

		int tempF = Integer.parseInt(temp);
		int tempC = (int) ((tempF - 32) / 1.8);

		tempFinal = Integer.toString(tempC);

		return tempFinal;
	}

}
