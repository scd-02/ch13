import java.util.Enumeration;
import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;

public class HashTableEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enumeration<String> nms;
		String keys;
		Hashtable<String, String> ht = new Hashtable<>(16);
		ht.put("Mia", "A");
		ht.put("Tim", "B");
		ht.put("Leo", "C");
		ht.put("Sam", "D");
		ht.put("Beb", "t");
//		ht.put("ke5", "u");
//		ht.put("ke9", "p");
//		ht.put("ke0", "o");

//		int index=ht.hashCode()&(16-1);
//		System.out.println(index);

		nms= ht.keys();
		
		while(nms.hasMoreElements()) {
			keys=nms.nextElement();
			System.out.println(keys+" : "+ht.get(keys));
		}
		
		
//		Set<Entry<String, String>> s = ht.entrySet();
//		Iterator<Entry<String, String>> it = s.iterator();
//		while (it.hasNext()) {
//			Map.Entry<String, String> m = it.next();
//			System.out.println(m.getKey() + ": " + m.getValue());
//		}

	}

}
