package worms.model;

import java.util.Map;

import be.kuleuven.cs.som.annotate.Basic;
import statement.S;
import type.T;
import expression.E;

public class Program {
	
	public Program(Worm worm){
		this.worm = worm;
		//TODO worm.setProgram
	}
	
	//TODO implementedPF hier initialiseren met actionHandler en worm
	
	@Basic
	public Worm getWorm(){
		return this.worm;
	}
	
	private final Worm worm;
	
	
	public Map<String, T> getGlobals(){
		return this.globals;
	}
	
	private void setGlobals(Map<String, T> globals){
		this.globals = globals;
	}
	
	private Map<String, T> globals;
	
	public S getStatement(){
		return this.statement;
	}
	
	private void setStatement(S statement){
		this.statement = statement;
	}
	
	private S statement;
	
	
	
	public boolean getIsExecuting(){
		return this.isExecuting;
	}
	
	public void setIsExecuting(boolean b){
		this.isExecuting = b;
	}
	
	private boolean isExecuting;
	//TODO: true or false?
	
	public void execute(){
		getStatement().execute(getWorm());
	}
	//TODO beginnen vanaf laatst uitgevoerde statement
}
