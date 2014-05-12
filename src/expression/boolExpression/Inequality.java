package expression.boolExpression;

import expression.BoolExpression;
import expression.DoubleExpression;
import expression.E;


public class Inequality extends BoolExpression{

	public Inequality(int line, int column, E e1, E e2) {
		
		super(line, column);
		setValue(((DoubleExpression) e1).getValue() !=
				((DoubleExpression) e2).getValue());
	}
}
