package expression.entityExpression.property;

import type.Entity;
import expression.E;
import expression.entityExpression.Property;

public class GetX extends Property{

	public GetX(int line, int column, E e) {
		super(line, column, e);
	}

	@Override
	protected double getProperty(Entity entity) {
		return entity.getX();
	}
}
