import java.util.ArrayList;

class Type<T1, T2> {
	T1 s;
	T2 i;

	public Type(T1 s, T2 i) {
		this.s = s;
		this.i = i;
	}
}

public class GenericsBasics {

	public static void main(String[] args) {
		
		Type<String, Integer> obj = new Type<>("Sourav", 10);

		String s = obj.s;
		int i = obj.i;

		System.out.println(s + " " + i);
		
		ArrayList<Type<String,Integer>> al= new ArrayList<>();
		al.add(new Type<>("Sourav",10));
		al.add(new Type<>("sdfo",3));
		
		System.out.println(al.get(0).s);
	}

}
