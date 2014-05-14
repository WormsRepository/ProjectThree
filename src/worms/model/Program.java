package worms.model;
import statement.*;
import worms.gui.game.*;
import worms.model.programs.ParseOutcome;
import worms.model.programs.ProgramParser;

import java.util.Map;

import be.kuleuven.cs.som.annotate.Basic;
import statement.S;
import type.T;
import expression.E;

public class Program {
	
	public Program(){
		//TODO set worm in program
	}
	
	
	
	@Basic
	public Worm getWorm(){
		return this.worm;
	}
	
	private Worm worm = null;
	
	
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
	
	private S statement = null;
	
	
	
	public boolean getIsExecuting(){
		return this.isExecuting;
	}
	
	public void setIsExecuting(boolean b){
		this.isExecuting = b;
	}
	
	private boolean isExecuting;
	//TODO: true or false?
	
	public void executeNext(){
		getNextStatement().execute(getWorm());
	}
	//TODO beginnen vanaf laatst uitgevoerde statement
	public S getNextStatement(){
		//TODO (Sequence)(statement).getStatements();
		//TODO nummer van statement zoeken adhv nrStatement.
		return null;
	}
	
	private int nrStatement = 0;
	//TODO implementedPF hier initialiseren met actionHandler en worm
	@Basic
	public ImplementedPF getFactory(){
		return factory;
	}
	@Basic
	public void setFactory(ImplementedPF factory){
		this.factory = factory;
	}
	private ImplementedPF factory = null;
	
	
	public IActionHandler getHandler(){
		return handler;
	}
	@Basic
	public void setHandler(IActionHandler handler){
		this.handler = handler;
	}
	private IActionHandler handler = null;
	
	public void parseProgram(String programText){
		ProgramParser<E, S, T> parser = new ProgramParser<E, S, T>(factory);
		parser.parse(programText);
		
		//set the globals for the program.
		this.setGlobals(parser.getGlobals());
		//set the statement for the program.
		this.setStatement((S)(parser.getStatement()));
		//TODO iets me parserOutcome.
		
	}
}
