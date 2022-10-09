package c_collection;
import java.util.TreeSet;

public class bTreeSetEx 
{
	public static void main(String[] args) 
	{
		TreeSet<String>  set = new TreeSet<String>();
		
		set.add("elephant");
		set.add("tiger");
		set.add("lion");
		set.add("cat");
		set.add("dog");
		set.add("ant");
		set.add("snake");
		set.add("zebra");
		set.add("bee");

		System.out.println( set );
		System.out.println(set.subSet("d", "s"));	// d~s이전 까지 s 미포함
		System.out.println(set.headSet("e"));
		System.out.println(set.tailSet("e"));
		

	}
}
