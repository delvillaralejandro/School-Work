
public class Invoker {
	public Command command;
	Lights lites = new Lights();
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPress(Command command){
		lites.On();
	}
	
	public void buttonDepress(Command command) {
		lites.Off();
	}
}
