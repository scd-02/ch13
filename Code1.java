import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Sushil");
		map.put(2, "Anurag");
		map.put(3, "vivek");

		Set<Entry<Integer, String>> set1 = map.entrySet();
		Iterator<Entry<Integer, String>> it1 = set1.iterator();
		
		while(it1.hasNext()) {
			Map.Entry<Integer, String> ment1= it1.next();
			System.out.println(ment1.getValue()+" : "+ment1.getKey());
		}
		
		String s= map.get(2);
		System.out.println("Index 2 has value:"+s);
		
		map.remove(1);
		
		System.out.println("via first iterator");
		while(it1.hasNext()) {
			Map.Entry<Integer, String> ment1= it1.next();
			System.out.println(ment1.getValue()+" : "+ment1.getKey());
		}
		
		Set<Entry<Integer, String>> s2=map.entrySet();
		Iterator<Entry<Integer, String>> it2=s2.iterator();
		
		System.out.println("via second iterator");
		while(it2.hasNext()) {
			Map.Entry<Integer, String> ment2= it2.next();
			System.out.println(ment2.getValue()+" : "+ment2.getKey());
		}

	}

}
