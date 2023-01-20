
public class GenericsUpperBound<T> {
	public T t;
	public void set(T t) {
		this.t=t;
	}
	public T get() {
		return t;
	}
	
	public <U extends Number> void inspectUB(U u) {
		System.out.println("T: "+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}

	
	public <U extends Number> void inspectLB(U u) {
		System.out.println("T: "+t.getClass().getName());
		System.out.println("U: "+u.getClass().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsUpperBound<Integer> obj= new GenericsUpperBound<>();
		obj.set(56);
		obj.inspectUB(34l);
		
		//obj.inspectUB("Sourav");-> error: as string is not present in Number class 
		
		obj.inspectLB(null);
		
	}

}
