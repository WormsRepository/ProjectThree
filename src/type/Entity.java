package type;

public class Entity extends T{
	
	public Entity(Object object){
		this.object = object;
	}
	
	public Object getObject(){
		return this.object;
	}
	
	private Object object = null;
}
