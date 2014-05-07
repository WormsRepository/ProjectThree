package statement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import type.Entity;
import worms.model.Facade;
import worms.model.SimpleActionHandler;
import worms.model.Worm;

public abstract class Action extends S{
	
	public Action(int line, int column) {
		super(line, column);
	}

	public Worm getWorm(Entity entity){
		if(entity.getObject() instanceof Worm)
			return (Worm) entity.getObject();
		return null;
	}
	
	
	
	public SimpleActionHandler getActionHandler(){
		return this.actionHandler;
	}
	
	//TODO check if the right facade is added to this handler.
	private SimpleActionHandler actionHandler = new SimpleActionHandler(new Facade());
	
	protected void execute(Entity entity, Method method) 
			throws InvocationTargetException{
		Worm worm = getWorm(entity);
		if(worm != null){
			try{
				method.invoke(getActionHandler());
			}
			catch(IllegalAccessException exc){
				assert false;
			}
		}
		else{
			// TODO stop program
		}
	}
	
	
	//TODO make the method ' execute (entity, method) ' and call it in subclasses.
}
