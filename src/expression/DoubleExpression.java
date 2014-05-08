package expression;

public abstract class DoubleExpression extends E{

	public DoubleExpression(int line, int column) {
		super(line, column);
	}
	
	
	
	protected abstract void setValue(double[] values);
	
	protected void setValue(double value){
		this.value = value;
	}
	
	protected double getValue(){
		return this.value;
	}
	
	private double value = 0;
}
