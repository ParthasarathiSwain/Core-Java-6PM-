package Interface;

public interface Test01 {
	public abstract void sleep1();
	public abstract void sleep2();
	public abstract void sleep3();
	public abstract void sleep4();
	
	static void dance() {
		
	}
	default void walk() {
		
	}
}


/*an empty interface known as marker interface
 * interface A{
 * 
 * }
 * functional interface
 * ex:
 * interface B{
 * 	void eat();
 * }
 * 
 * 
 */
