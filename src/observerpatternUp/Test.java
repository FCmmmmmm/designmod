package observerpatternUp;

public class Test {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay display=new CurrentConditionsDisplay(weatherData);
		weatherData.measurementsChanged();
		weatherData.setMeasurements(10, 11, 20);
	}
}
