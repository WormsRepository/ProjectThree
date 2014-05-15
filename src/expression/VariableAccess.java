package expression;

import java.util.Map;

import type.Entity;
import type.T;
import worms.model.Worm;
import be.kuleuven.cs.som.annotate.Basic;
import type.Double;

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
		if(getWorm() != null && getWorm().getProgram() != null){
			Map<String, T> globals = worm.getProgram().getGlobals();
			return globals.get(getName());
		}
		return new Double();
		//TODO fix this.(iets me worm) maak er new T() van als mogelijk...
	}
}
