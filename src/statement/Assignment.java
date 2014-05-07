package statement;

import be.kuleuven.cs.som.annotate.*;
import expression.E;
import type.Entity;

public class Assignment extends S{
	
	public Assignment(int line, int column, String variableName, E rhs){
		super(line, column);
		this.variableName = variableName;
		this.rhs = rhs;
	}
	
	
	
	@Basic
	public String getVariableName(){
		return this.variableName;
	}
	
	private final String variableName;
	
	
	
	@Basic
	public E getRhs(){
		return this.rhs;
	}
	
	private final E rhs;
	
	

	@Override
	public void execute(Entity entity) {
		// TODO Auto-generated method stub
		
	}
}
