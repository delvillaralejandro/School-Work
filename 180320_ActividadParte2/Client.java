
public class Client {
	public static void main(String args[]) {
		//summon invoker
		Invoker button = new Invoker();
		//declare electronics 
		Lights lites = new Lights();
		GarageDoor garage = new GarageDoor();
		/*
		//declaring button config
		button.setCommand(new doOn(lites));
		button.buttonPress();
		
		button.setCommand(new doOpen(garage));
		button.buttonPress();
		
		button.setCommand(new doOff(lites));
		button.buttonPress();
		
		button.setCommand(new doClose(garage));
		button.buttonPress();
		*/ 
		//Button programmed
		button.setCommand(new doOn(lites), 1);
		button.setCommand(new doOpen(garage), 2);
		button.setCommand(new doOff(lites), 3);
		button.setCommand(new doClose(garage), 4);
		button.setCommand(new doWhiteL(lites), 5);//do white light on
		button.setCommand(new dowWhiteOn(lites), 6);
		button.setCommand(new doOpenGD(garage), 7);
		button.setCommand(new doGarageLights(garage), 8);
		//Button pressing
		button.buttonPress1();
		button.buttonPress2();
		button.buttonPress3();
		button.buttonPress4();
		button.buttonPress5();
		button.buttonPress6();
		button.buttonPress7();
		button.buttonPress8();
		
		
		System.out.println("//=//=//=//=//=//=//=//=//=");
		button.buttonDepress(); //buttonDepress = undo setCommand, in this case, last buttonPress
		
		
	}
}
