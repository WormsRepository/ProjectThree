package expression;

import be.kuleuven.cs.som.annotate.Basic;
import type.Boolean;

public abstract class BoolExpression extends VariableAccess{

	public BoolExpression(int line, int column) {
		super(line, column);
	}

	
	protected void setValue(boolean value){
		this.value.setBoolean(value);
	}
	
	@Basic
	public Boolean getValue(){
		return this.value;
	}
	
	private Boolean value = new Boolean();
}
