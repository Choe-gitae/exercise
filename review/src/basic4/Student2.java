package basic4;

public class Student2 {

	String hakbun;
	String name;
	int kor, eng, math;
	int total;
	double avg;
	
	public void calTotal() {
		total = kor + eng + math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name+"님 성적 : "+total+"/"+avg);
	}
}
