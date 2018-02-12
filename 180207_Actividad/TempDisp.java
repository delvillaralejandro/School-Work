import java.util.*;
public class TempDisp implements Display, Observer{
	private float temp;
	private float hum;
	private float press;
	
	public TempDisp(Observable weatherdata){
		weatherdata.addObserver(this);
	}

	@Override
	public void update(Observable o, Object arg){
		if(o instanceof WeatherData){
			WeatherData wd = (WeatherData)o;
			wrapperWeatherClass wrap = (wrapperWeatherClass) arg;
			this.temp = wrap.getTemp();
			this.hum = wrap.getHum();
			this.press = wrap.getPress();
		}
		this.display();
	}

	public void display(){
		System.out.println("Weather Cougar");
		System.out.println("Temperature: "+ temp);
		System.out.println("Humidity: "+ hum);
		System.out.println("Pressure: "+ press);
	} 

}
