package expression.boolExpression;

import expression.BoolExpression;
import expression.DoubleExpression;
import expression.E;


public class GreaterThan extends BoolExpression{
	
	public GreaterThan(int line, int column, E e1, E e2) {
		
		super(line, column);
		setValue(((DoubleExpression) e1).getValue() >
				((DoubleExpression) e2).getValue());
	}
}