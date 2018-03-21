
public class doClose implements Command{
	GarageDoor gd;
	
	public doClose(GarageDoor g) {
		this.gd = g;
	}

	@Override
	public void execute() {
		gd.Close();
		
	}

	@Override
	public void undo() {
		gd.Open();
		
	}

}
