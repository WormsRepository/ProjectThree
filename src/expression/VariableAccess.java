package expression;

import java.util.Map;

import type.Entity;
import type.T;
import worms.model.ImplementedPF;
import worms.model.Worm;
import be.kuleuven.cs.som.annotate.Basic;
import type.Double;

public class VariableAccess extends E{

	public VariableAccess(int line, int column, String name, ImplementedPF implementedPF) {
		super(line, column);
		this.name = name;
		this.implementedPF = implementedPF;
	}
	
	public VariableAccess(int line, int column){
		super(line, column);
	}
	
	
	
	@Basic
	private String getName(){
		return this.name;
	}
	
	private String name = null;
	
	
	
	@Basic
	private ImplementedPF getImplementedPF(){
		return this.implementedPF;
	}
	
	private ImplementedPF implementedPF = null;
	
	
	@Basic
	private Worm getWorm(){
		return this.worm;
	}
	
	private void setWorm(Worm worm){
		this.worm = worm;
	}
	
	private Worm worm = null;

	@Override
	public T getValue(){
		setWorm(getImplementedPF().getWorm());
		if(getWorm() != null && getWorm().getProgram() != null){
			Map<String, T> globals = worm.getProgram().getGlobals();
			return globals.get(getName());
		}
		return new T();
		//TODO fix this.(iets me worm) maak er new T() van als mogelijk...
	}
}
