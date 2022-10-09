package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		
		ArrayList<Student> list = method();
		System.out.println(list);
		for (Student student : list) {
			System.out.println(student);
		}
		
		// [참고] 전체요소를 순서대로 검색
		//		Enumeration -> Iterator
		System.out.println("=====================");
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	
	static ArrayList<Student> method() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("홍길동", 25));
		list.add(new Student("홍길이", 33));
		list.add(new Student("홍삼이", 44));
		return list;
	}

}

//----------------------------------------------------------
class Student{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
