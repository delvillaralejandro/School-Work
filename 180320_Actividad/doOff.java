
public class doOff implements Command{
	Lights leds = new Lights();
	@Override
	public void execute() {
		leds.Off();
		
	}

	@Override
	public void undo() {
		leds.On();
		
	}
}
