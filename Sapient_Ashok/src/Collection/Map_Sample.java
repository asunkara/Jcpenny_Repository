package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_Sample {

	public static void main(String[] args) {
		Map<Integer,String> map	=new TreeMap<Integer,String>();
		map.put(1,"Ashok");
		map.put(2, "harsha");
		map.put(3,"rajesh");
		map.put(4, "laxman");
		for(Map.Entry r: map.entrySet()){
System.out.println(r);
	}

}}
	
