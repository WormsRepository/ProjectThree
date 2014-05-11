package statement.action;

import be.kuleuven.cs.som.annotate.Basic;
import expression.DoubleExpression;
import expression.E;
import statement.Action;
import worms.model.Worm;

public class Turn extends Action{

	public Turn(int line, int column, E angle) {
		super(line, column);
		this.angle = angle;
	}

	@Basic
	public E getAngle(){
		return this.angle;
	}
	
	private final E angle;
	
	@Override
	protected void executeAction(Worm worm) {
		getActionHandler().turn(worm, ((DoubleExpression) getAngle()).getValue());
	}
	
}
