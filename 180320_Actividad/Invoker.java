
public class Invoker {
	public Command command;
	
	public void setCommand(Command cmd) {
		this.command = cmd;
	}
	
	public void buttonPress(){
		command.execute();
	}
	
	public void buttonDepress() {
		command.undo();
	}
}
