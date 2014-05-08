package expression;

import type.Entity;

public abstract class EntityExpression extends E{

	public EntityExpression(int line, int column) {
		super(line, column);
	}

	//TODO implementing entity
	
	protected Entity getEntity(){
		return this.entity;
	}
	
	private Entity entity = null;
}
