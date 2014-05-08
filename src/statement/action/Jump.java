package statement.action;

import statement.Action;
import worms.model.Worm;


public class Jump extends Action{

	public Jump(int line, int column) {
		super(line, column);
	}

	@Override
	protected void executeAction(Worm worm) {
		getActionHandler().jump(worm);
	}
}
