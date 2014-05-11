package statement.action;

import be.kuleuven.cs.som.annotate.Basic;
import expression.DoubleExpression;
import expression.E;
import statement.Action;
import worms.model.Worm;

public class Shoot extends Action{

	public Shoot(int line, int column, E yield) {
		super(line, column);
		this.yield = yield;
	}

	@Basic
	public E getYield(){
		return this.yield;
	}
	
	private final E yield;
	
	@Override
	protected void executeAction(Worm worm) {
		getActionHandler().fire(worm, (int)((DoubleExpression) this.getYield()).getValue());
	}
}
