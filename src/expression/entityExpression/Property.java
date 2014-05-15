package expression.entityExpression;

import type.Entity;
import expression.E;
import expression.EntityExpression;

public abstract class Property extends EntityExpression{

	public Property(int line, int column, E e) {
		super(line, column);
		setEntity(((EntityExpression) e).getEntity());
	}
	
	public Double getValue(){
		if(getEntity() != null)
			return this.getProperty(getEntity());
		else
			return 0;
	}
	//TODO laten extenden door doubleExpression
	protected abstract double getProperty(Entity entity);
}
