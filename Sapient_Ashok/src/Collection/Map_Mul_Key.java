package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_Mul_Key {

	public static void main(String[] args) {
		Map <String,String>m=new TreeMap<String,String>();
		m.put("as","Ashok");
		m.put("as","laxman");
		m.put("as","rajesh");

		for(Map.Entry r: m.entrySet()){
			Object key = r.getKey();
			Object value = r.getValue();
		System.out.println(key);
			System.out.println(value);
	}

}}

