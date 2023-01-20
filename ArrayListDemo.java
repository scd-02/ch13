import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> al= new ArrayList<>();
		al.add("String");
		al.add(6);
		al.add(5);
		int n=(int)al.get(1);//compile time error :- add typeCast
		int s=(int)al.get(0);//runtime error :- add generics
		
		System.out.println(n+s);//error is generated

	}

}
