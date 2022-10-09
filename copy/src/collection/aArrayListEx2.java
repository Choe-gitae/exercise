package collection;

import java.util.ArrayList;
import java.util.Collections;

public class aArrayListEx2 {
	public static void main(String[] args) 
	{
		// List 인덱스 사용가능 중복된 값도 저장
		ArrayList<String> list = new ArrayList<String>();
		list.add("rabbit");  
		list.add("zebra");
		list.add("squirrel");
		list.add("fox");
		list.add("lion");
		list.add("elephant");
		// 노랜표시 없애려면 generics 지정
		
		list.set(3, "frog");
		System.out.println(list);
		
		list.remove(5);
		System.out.println(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}
	
}
