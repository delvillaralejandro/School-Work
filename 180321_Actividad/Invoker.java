
public class Invoker {
	public Command command;
	Command recentcommand;
	Command Lcommands[] = new Command[8];
	
	public void setCommand(Command cmd, int i) {
		//this.command = cmd;
		if(i <= 8 && i >= 1) {
			Lcommands[i - 1] = cmd;
		}
	}
	public void buttonPress1() {
		if(Lcommands[0] != null) {
			Lcommands[0].execute();
			recentcommand = Lcommands[0];
		}
	}
	
	public void buttonPress2() {
		if(Lcommands[1] != null) {
			Lcommands[1].execute();
			recentcommand = Lcommands[1];
		}
	}
	
	public void buttonPress3() {
		if(Lcommands[2] != null) {
			Lcommands[2].execute();
			recentcommand = Lcommands[2];
		}
	}

	public void buttonPress4() {
		if(Lcommands[3] != null) {
			Lcommands[3].execute();
			recentcommand = Lcommands[3];
		}
	}
	
	public void buttonPress5() {
		if(Lcommands[4] != null) {
			Lcommands[4].execute();
			recentcommand = Lcommands[4];
		}
	}
	
	public void buttonPress6() {
		if(Lcommands[5] != null) {
			Lcommands[5].execute();
			recentcommand = Lcommands[5];
		}
	}
	
	public void buttonPress7() {
		if(Lcommands[6] != null) {
			Lcommands[6].execute();
			recentcommand = Lcommands[6];
		}
	}
	
	public void buttonPress8() {
		if(Lcommands[7] != null) {
			Lcommands[7].execute();
			recentcommand = Lcommands[7];
		}
	}
	/*public void buttonPress(){
		command.execute();
	}*/	
	
	public void buttonDepress() {//buttonDeoress == undo
		if(recentcommand != null) {
			recentcommand.undo();
			recentcommand = null;
		}
	}
}
