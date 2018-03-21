
public class Client {
	public static void main(String args[]) {
		//declare different button config
		doOn doon = new doOn();
		doOff dooff = new doOff();
		
		
		
		//delare button=invoker to be config
		Invoker button = new Invoker();
		
		button.buttonPress(doon);
		button.buttonPress(dooff);
	}
}
