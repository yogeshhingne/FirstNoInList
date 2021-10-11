package FistNumberInList;
import java.util.*;
import java.util.stream.Collectors;

public class FirstNo {
	public static void main(String args[]) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(4);
		al.add(5);
		Integer a=al.stream().findFirst().orElse(null);
		System.out.println(a);
	}
	
}
