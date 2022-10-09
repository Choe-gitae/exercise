package collection;
import java.util.HashSet;

public class bHashSetEx 
{
	public static void main(String[] args)
	{
		// HashSet 중복된값 저장X
		HashSet<String> set = new HashSet<String>();
		set.add("rabbit");
		set.add("zebra");
		set.add("fox");
		set.add("zebra");
		set.add("elephant");
		set.add("elephant");
		
		System.out.println( set );
	}
}
