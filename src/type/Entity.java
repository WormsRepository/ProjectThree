package type;

import be.kuleuven.cs.som.annotate.*;
import worms.model.World;

public abstract class Entity extends T{
	
	/**
	 * Get the world to which this entity is attached.
	 */
	@Basic @Raw
	public World getWorld(){
		return this.world;
	}
	
	protected abstract void setWorld(World world);
	
	public abstract double getX();
	public abstract double getY();
	
	protected World world = null;
	
	
}
