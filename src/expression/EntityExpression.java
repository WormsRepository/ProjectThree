package expression;

import be.kuleuven.cs.som.annotate.Basic;
import type.Entity;

public abstract class EntityExpression extends E{

	public EntityExpression(int line, int column) {
		super(line, column);
	}

	//TODO implementing entity
	
	@Basic
	public Entity getEntity(){
		return this.entity;
	}
	
	private Entity entity = null;
}
