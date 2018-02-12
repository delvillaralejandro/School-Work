
public class wrapperWeatherClass {
	private float temp;
	private float hum;
	private float press;
	
	public wrapperWeatherClass(float temperature, float humidity, float pressure){
		this.temp = temperature;
		this.hum = humidity;
		this.press = pressure;
		
	}
	
	public float getTemp() {
		return this.temp;
	}
	public float getHum() {
		return this.hum;
	}
	public float getPress() {
		return this.press;
	}
}
