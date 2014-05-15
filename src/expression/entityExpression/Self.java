package expression.entityExpression;

import type.Entity;
import worms.model.Worm;
import expression.EntityExpression;

public class Self extends EntityExpression{

	public Self(int line, int column, Worm worm) {
		super(line, column);
		setEntity(worm);
	}
	//TODO change this.
}
