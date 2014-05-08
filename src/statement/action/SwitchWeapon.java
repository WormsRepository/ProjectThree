package statement.action;

import statement.Action;
import worms.model.Worm;

public class SwitchWeapon extends Action{

	public SwitchWeapon(int line, int column) {
		super(line, column);
	}

	@Override
	protected void executeAction(Worm worm) {
		getActionHandler().toggleWeapon(worm);
	}
}
