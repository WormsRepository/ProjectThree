package statement.action;

import statement.Action;
import worms.model.Worm;

public class Move extends Action{
	
	public Move(int line, int column) {
		super(line, column);
	}

	@Override
	protected void executeAction(Worm worm) {
		getActionHandler().move(worm);
	}
}
