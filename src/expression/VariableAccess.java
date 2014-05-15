package expression;

import java.util.Map;

import type.T;
import worms.model.Worm;
import be.kuleuven.cs.som.annotate.Basic;

public class VariableAccess extends E{

	public VariableAccess(int line, int column, String name, Worm worm) {
		super(line, column);
		this.name = name;
		this.worm = worm;
	}
	
	
	
	@Basic
	public String getName(){
		return this.name;
	}
	
	private final String name;
	
	
	
	@Basic
	public Worm getWorm(){
		return this.worm;
	}
	
	private final Worm worm;

	@Override
	public T getValue(){
		Map<String, T> globals = worm.getProgram().getGlobals();
		return globals.get(getName());
	}
}
