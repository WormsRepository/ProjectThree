package statement;


import type.Entity;
import worms.model.Facade;
import worms.model.SimpleActionHandler;
import worms.model.Worm;

public abstract class Action extends S{
	
	public Action(int line, int column) {
		super(line, column);
	}

	public Worm getWorm(Entity entity){
		if(entity instanceof Worm)
			return (Worm) entity;
		return null;
	}
	
	
	
	public SimpleActionHandler getActionHandler(){
		return this.actionHandler;
	}
	
	private SimpleActionHandler actionHandler = new SimpleActionHandler(new Facade());
	
	protected abstract void executeAction(Worm worm);
	
	@Override
	public void execute(Entity entity){
		Worm worm = getWorm(entity);
		if(worm != null){
			this.executeAction(worm);
		}
		else{
			// TODO stop program
		}
	}
	
	
	//TODO make the method ' execute (entity, method) ' and call it in subclasses.
}
