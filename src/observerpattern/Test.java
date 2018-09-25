package observerpattern;

public class Test {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay display=new CurrentConditionsDisplay(weatherData);
		HeatIndex dIndex=new HeatIndex(weatherData);
		
		weatherData.setMeasurements(80.0f, 82.0f, 78.0f);
		
		weatherData.removeObserver(display);//移除注册
		
		weatherData.setMeasurements(80.0f, 82.0f, 78.0f);
		
	}
}
