import java.util.*;

public class WeatherData extends Observable{
	private float temp;
	private float hum;
	private float press;
	
	public WeatherData() {
		
	}
	
	public WeatherData(float temperature, float humidity, float pressure) {
		this.temp = temperature;
		this.hum = humidity;
		this.press = pressure;
		
	}

	public void measurementchanged() {
		setChanged();
		notifyObservers(new wrapperWeatherClass(temp, hum, press));
	}
	
	public void setTemp(float temperature) {
		this.temp = temperature;
	}
	
	public void setHum(float humidity) {
		this.hum = humidity;
	}
	
	public void setPress(float pressure) {
		this.press = pressure;
	}
	
	public float getTemperature(){
		return this.temp;
	}

	public float getHumidity(){
		return this.hum;
	}

	public float getPressure(){
		return this.press;
	}
}
