package c_collection;
import java.util.*;

public class bHashSetLottoEx 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> lottos = new HashSet<Integer>();

		//중복된 값이 나오면 숫자가 모자라게 된다.
//		for (int i = 0; i < 6; i++) {
//			int num = (int)(Math.random()*45)+1;
//			lottos.add(num);
//		}
		
		// 중복된 값은 제외하고 숫자 6개가 나올때까지 반복
		while(lottos.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			lottos.add(num);
		}
		ArrayList<Integer> list = new ArrayList<>(lottos);
		Collections.sort(list);

		System.out.println(list);

		
	}
}
