package expression;

import be.kuleuven.cs.som.annotate.Basic;

public abstract class DoubleExpression extends E{

	public DoubleExpression(int line, int column) {
		super(line, column);
	}
	
	protected void setValue(double value){
		this.value = value;
	}
	
	@Basic
	public double getValue(){
		return this.value;
	}
	
	private double value = 0;
}
