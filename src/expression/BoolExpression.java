package expression;

import be.kuleuven.cs.som.annotate.Basic;

public abstract class BoolExpression extends E{

	public BoolExpression(int line, int column) {
		super(line, column);
	}

	
	protected void setValue(boolean value){
		this.value = value;
	}
	
	@Basic
	public boolean getValue(){
		return this.value;
	}
	
	private boolean value = false;
}
