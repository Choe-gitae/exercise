package c_collection;
import java.util.*;
import java.util.Map.Entry;


class HashMapTest 
{
	// 전화번호를 저장할 멤버변수
	HashMap<String, HashMap<String,String>> phoneBook = 
			new HashMap<String, HashMap<String,String>>();


	/*
		전화번호 정보를 입력
	*/
	void insertPhoneNo()
	{
		addPhoneNo("가족", "아빠", "010-111-1111");
		addPhoneNo("가족", "엄마", "010-111-1112");
		addPhoneNo("친구", "만득이", "010-333-0303");
		addPhoneNo("업무", "김사장", "010-999-9999");
		addPhoneNo("친구", "천득이", "010-333-3030");
		addPhoneNo("기타", "슈퍼마켓", "032-333-0000");
		addPhoneNo("가족", "동생", "010-111-1113");
		addPhoneNo("기타", "치킨집", "032-777-9292");
		addPhoneNo("친구", "백득이", "010-888-8080");
	}
	
	/*
		전화번호부에 저장
	*/
	void addPhoneNo( String groupName, String name, String tel )
	{
		//--------------------------------------------
		// 1. 전화번호 Map에 해당 그룹이름이 없으면 추가
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap<String, String>());
		}
		
		// 2. 입력된 그룹이름으로 저장된 HashMap을 얻어옴
			HashMap<String, String> phoneNum = phoneBook.get(groupName);
			
		// 3. 그 HashMap에 전화번호와 이름을 저장
			phoneNum.put(name, tel);
	}

	/*
		전화번호부 출력	
	*/
	void printPhoneNo()
	{
		@SuppressWarnings("rawtypes")
		Set set = phoneBook.entrySet();	// 해쉬맵 엔트리 세팅
		@SuppressWarnings("rawtypes")
		Iterator it = set.iterator();	// 세팅한 엔트리 이터레이터

		// phoneBook 엔트리 이터레이터
		while( it.hasNext() )
		{
			@SuppressWarnings("rawtypes")
			Map.Entry e = (Map.Entry) it.next();	//업캐스팅?? //그룹 엔트리 세팅
			@SuppressWarnings("rawtypes")
			Set subSet = ( (HashMap)e.getValue() ).entrySet();	//e.getValue() 그룹 엔트리 값 get //안쪽(phoneNum)해쉬맵 엔트리 세팅
			@SuppressWarnings("rawtypes")
			Iterator subIt = subSet.iterator();	//안쪽(phoneNum)해쉬맵 엔트리 이터레이터

			System.out.println(" # " + e.getKey() + " [" + subSet.size() +"]");	// 출력 # 그룹명[phoneNum갯수]

			//안쪽(phoneNum)해쉬맵 엔트리 이터레이터
			while( subIt.hasNext() )
			{
				@SuppressWarnings("rawtypes")
				Map.Entry  subE = (Map.Entry)subIt.next();	//업캐스팅??
				System.out.println( subE.getValue() + "  " + subE.getKey() );	// 출력 값  키
			}
			System.out.println();	//갱
		}
	}

	public static void main(String[] args) 
	{
		HashMapTest  map = new HashMapTest();
		map.insertPhoneNo();
		map.printPhoneNo();
	}

}
