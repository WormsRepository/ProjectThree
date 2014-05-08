package statement.action;

import statement.Action;
import worms.model.Worm;

public class Skip extends Action{

	public Skip(int line, int column) {
		super(line, column);
	}

	@Override
	protected void executeAction(Worm worm){}
}
