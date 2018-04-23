import java.util.ArrayList;

public class MegaCmd implements Command{
	ArrayList<Command> commands;
	
	public MegaCmd (ArrayList<Command> cmd) {
		this.commands = cmd;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(Command cmd : commands){
			cmd.execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(Command cmd : commands){
			cmd.undo();
		}
	}
}
