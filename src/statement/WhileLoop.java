package statement;

import javax.swing.text.html.parser.Entity;

import worms.model.Worm;
import expression.E;

public class WhileLoop extends S{
	
	public WhileLoop(int line, int column, E condition, S body){
		super(line, column);
		this.condition = condition;
		this.body = body;
	}
	
	
	
	public E getCondition(){
		return this.condition;
	}
	
	final E condition;
	
	
	
	public S getBody(){
		return this.body;
	}
	
	final S body;



	@Override
	public void execute(Entity entity) {
		if(this.getCondition() instanceof BoolExpression){
			while(getCondition().getBoolValue()){
				getBody().execute(entity);
			}
		}
		else{
			System.out.println("Class: WhileLoop: execution error");
			if(Worm.class.isInstance(entity)){
				if(entity.getProgram() != null){
					(Worm) entity.getProgram().setExecuting(false);
				}
				// fix this
			}
		}
	}
}
