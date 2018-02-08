import java.util.*;
public class WeatherData implements Subject{
	private List<DisplayObs> obs = new ArrayList<DisplayObs>();
	private float temp;
	private float hum;
	private float press;

	@Override
	public void addDisplay(DisplayObs disp) {
		obs.add(disp);
		
	}//end addDisplay

	@Override
	public void rmDisplay(DisplayObs disp) {
		obs.remove(disp);
		
	}//end rmDisplay

	@Override
	public void notDisplay() {
		for(DisplayObs d : obs){
			d.update(temp, hum, press);
		}
	}//notDispplay

	@Override
	public void measurementChanged() {
		notDisplay();		
	}//end measurementChanged
	
	public void setTemperature(float t){
		this.temp = t;
	}//end setTemperature

	public void setHumidity(float h){
		this.hum = h;
	}//setHumidity

	public void setPressure(float p){
		this.press = p;
	}// end setPressure	
}//end Weather Data
