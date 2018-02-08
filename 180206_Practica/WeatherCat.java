
public class WeatherCat {
	public static void main(String args[]) {
		WeatherData weather = new WeatherData();
		
		weather.setTemperature(563);
		weather.setHumidity(5);
		weather.setPressure(65);
		
		TempDisp temp = new TempDisp();
		
		weather.addDisplay(temp);
		weather.measurementChanged();
		
		temp.display();		
	}
}
