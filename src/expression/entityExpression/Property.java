package expression.entityExpression;

import type.Entity;
import expression.E;
import expression.EntityExpression;

public abstract class Property extends EntityExpression{

	public Property(int line, int column, E e) {
		super(line, column);
		setEntity(((EntityExpression) e).getEntity());
	}
	
	public double getValue(){
		return this.getProperty(getEntity());
	}
	
	protected abstract double getProperty(Entity entity);
}
