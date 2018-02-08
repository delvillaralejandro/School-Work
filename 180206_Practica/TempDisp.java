
public class TempDisp implements Display, DisplayObs{

	private float tem;
	private float hum;
	private float press;
	
	@Override
	public void update(float tem, float hum, float press) {
		this.tem = tem;
		this.hum = hum;
		this.press = press;
	}

	@Override
	public void display() {
		System.out.println("Weather Cat");
		System.out.println("Temperature: " + tem);
		System.out.println("Humidity: " + hum);
		System.out.println("Pressure: " + press);
		
	}

}
