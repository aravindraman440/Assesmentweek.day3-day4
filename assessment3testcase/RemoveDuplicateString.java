package assessment3testcase;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  //Declare a String as PayPal India
		String str ="PayPal India"; 
		//Convert it	into a character array
		char[] charArray = str.toCharArray();
		System.out.println(charArray); 
		//Declare a Set as charSet for Character
		Set<Character> obj =new LinkedHashSet<Character>(); 
		//Declare a Set asdupCharSet for duplicate Character 
		for (char eachChar :charArray) {
			obj.add(eachChar); 
			System.out.print(eachChar+" "); 
			}
		System.out.println("============"); 
		for (Character character : obj) {
			if(character !=' ') {
				System.out.print(character); } 
			}

//		String str="welcome to Selenium automation";
//		System.out.println(str);
//		char[] charArray = str.toCharArray();
//		Set<Character> singleChar = new LinkedHashSet<Character>();
//		for (char character :charArray) {
//			singleChar.add(character);
//			System.out.print(character+" ");
//		}
//		System.out.println();
//		for (Character character2 : singleChar) {
//			if(character2 !=' ') {
//				System.out.print(character2);
//			}
		}
				
}  


