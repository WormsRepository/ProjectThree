package statement.action;

import statement.Action;
import type.Entity;
import worms.model.SimpleActionHandler;


public class Jump extends Action{

	public Jump(int line, int column) {
		super(line, column);
	}
	
	
	@Override
	public void execute(Entity entity) {
		execute(entity, (SimpleActionHandler)jump(getWorm(entity)));
		
		//TODO jumpen met deze facade als facade
		
	}
}
