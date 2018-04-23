
public class doOff implements Command{
	Lights lites;
	
	public doOff(Lights l) {
		this.lites = l; 
	}
	
	@Override
	public void execute() {
		lites.Off();
		
	}

	@Override
	public void undo() {
		lites.On();
		
	}
}
