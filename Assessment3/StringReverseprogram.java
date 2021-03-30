package Assessment3;

import java.util.Arrays;

public class StringReverseprogram {
public static void main(String[] args) {
	String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
	
	int size = input.length;
	System.out.println("String Length:"+size);
	Arrays.parallelSort(input);
	for (int i =size -1 ;i>=0; i--) {
		System.out.println(input[i]);
	} 
}
}
