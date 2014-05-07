package statement;

import be.kuleuven.cs.som.annotate.*;
import type.Entity;
import worms.model.programs.ProgramFactory.ForeachType;


public class ForEachLoop extends S{
	
	public ForEachLoop(int line, int column, ForeachType type, String variableName, S body){
		super(line, column);
		this.type = type;
		this.variableName = variableName;
		this.body = body;
	}
	
	
	
	@Basic
	public ForeachType getType(){
		return this.type;
	}
	
	private final ForeachType type;
	
	
	
	@Basic
	public String getVariableName(){
		return this.variableName;
	}
	
	private final String variableName;
	
	
	
	@Basic
	public S getBody(){
		return this.body;
	}
	
	private final S body;
	
	

	@Override
	public void execute(Entity entity) {
		for(getType() type: getType()){
			
		}
		//TODO implement method
	}
}
