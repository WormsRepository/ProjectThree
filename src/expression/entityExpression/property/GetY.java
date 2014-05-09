package expression.entityExpression.property;

import type.Entity;
import expression.E;
import expression.entityExpression.Property;

public class GetY extends Property{

	public GetY(int line, int column, E e) {
		super(line, column, e);
	}

	@Override
	protected double getProperty(Entity entity) {
		return entity.getY();
	}
}
