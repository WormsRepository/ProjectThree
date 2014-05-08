package statement.action;

import statement.Action;
import type.Entity;
import worms.model.SimpleActionHandler;

public class Move extends Action{
	
	public Move(int line, int column) {
		super(line, column);
	}

	// TODO implementing class
	
	@Override
	public void execute(Entity entity) {
		execute(entity, move(getWorm(entity)));
			//TODO jumpen met deze facade als facade
		
	}
}
