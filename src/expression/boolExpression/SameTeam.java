package expression.boolExpression;

import be.kuleuven.cs.som.annotate.Basic;
import expression.BoolExpression;
import expression.E;

public class SameTeam extends BoolExpression{

	public SameTeam(int line, int column, E e) {
		super(line, column);
		this.e = e;
		setValue();
	}
	
	
	@Basic
	public E getE(){
		return this.e;
	}
	
	private final E e;
	
	private boolean sameTeam(){
		
	}
}
