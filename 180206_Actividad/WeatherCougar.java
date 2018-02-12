
public class WeatherCougar {
	
	public static void main(String args[]){
		WeatherData wd = new WeatherData(42,95,250);
		TempDisp temporal = new TempDisp(wd);
		wd.measurementchanged();
	}
}
