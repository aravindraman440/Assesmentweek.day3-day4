package assessment3testcase;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapProgram {
public static void main(String[] args) {
	String name="AravindKarur";
	
	char[] charArray = name.toCharArray();
	
	Map<Character,Integer> map= new LinkedHashMap<Character,Integer>();
	 for (char c : charArray) {
		if (map.containsKey(c)) {
			map.put(c,map.get(c)+1);
		}
		else {
			map.put(c, 1);
		}
		
	}
	 System.out.print(map);
}
}
