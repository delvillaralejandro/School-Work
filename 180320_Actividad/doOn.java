
public class doOn implements Command{
	Lights lites;
	
	public doOn(Lights l) {
		this.lites = l;
	}
	
	@Override
	public void execute() {
		lites.On();
		
	}

	@Override
	public void undo() {
		lites.Off();
		
	}

}
