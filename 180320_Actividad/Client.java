
public class Client {
	public static void main(String args[]) {
		//summon invoker
		Invoker button = new Invoker();
		//declare electronics 
		Lights lites = new Lights();
		GarageDoor garage = new GarageDoor();
		
		//declaring button config
		button.setCommand(new doOn(lites));
		button.buttonPress();
		
		button.setCommand(new doOpen(garage));
		button.buttonPress();
		
		button.setCommand(new doOff(lites));
		button.buttonPress();
		
		button.setCommand(new doClose(garage));
		button.buttonPress();
		
		System.out.println("//=//=//=//=//=//=//=//=//=");
		button.buttonDepress(); //buttonDepress = undo setCommand, in this case, last buttonPress
		
		
	}
}
