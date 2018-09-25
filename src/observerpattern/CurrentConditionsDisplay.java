package observerpattern;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;
	private float humidity;
	private float pressure;
	@SuppressWarnings("unused")
	private Subject weatherData;

	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	// 我负责统计他们的和
	@Override
	public void display() {
		show(temperature, humidity, pressure);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.pressure=pressure;
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}

	public void show(float temp, float humidity, float pressure) {
		System.out.println("统计版统计结果：- - - |" + (float) (temp + humidity + pressure));
	}

}
