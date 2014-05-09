package expression;

import be.kuleuven.cs.som.annotate.Basic;

public abstract class BoolExpression extends E{

	public BoolExpression(int line, int column) {
		super(line, column);
	}

	protected abstract void setValue(boolean[] booleans);
	
	protected abstract void setValue(double[] values);
	
	protected void setValue(boolean value){
		this.value = value;
	}
	
	@Basic
	public boolean getValue(){
		return this.value;
	}
	
	private boolean value = false;
}
