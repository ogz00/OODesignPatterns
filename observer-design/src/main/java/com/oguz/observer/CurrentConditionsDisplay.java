package com.oguz.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentConditionsDisplay(WeatherData weatherData) {

		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidty");

	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temp;
		display();

	}

}
