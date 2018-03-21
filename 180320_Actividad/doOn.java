
public class doOn implements Command{
	Lights leds = new Lights();
	
	@Override
	public void execute() {
		leds.On();
		
	}

	@Override
	public void undo() {
		leds.Off();
		
	}

}
