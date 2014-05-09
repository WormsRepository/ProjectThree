package statement;

import be.kuleuven.cs.som.annotate.*;
import type.Entity;
import expression.DoubleExpression;
import expression.E;

public class Print extends S{
	
	public Print(int line, int column, E e){
		super(line, column);
		this.e = e;
	}

	@Basic
	public E getE(){
		return this.e;
	}
	
	private final E e;
	
	@Override
	public void execute(Entity entity) {
		System.out.println(((DoubleExpression) getE()).getValue());
	}
}
