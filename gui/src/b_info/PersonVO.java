package b_info;

public class PersonVO {

	private String name;
	private String id;
	private String tel;
	private String gender;
	private String home;
	private int age;
	
	public PersonVO() {}
	public PersonVO(String name, String id, String tel, String gender, String home, int age) {
		super();
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.gender = gender;
		this.home = home;
		this.age = age;
	}// 생성자
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}// end of get set
	
	@Override
	public String toString() {
		return "PersonVO [name=" + name + ", id=" + id + ", tel=" + tel + ", gender=" + gender + ", home=" + home
				+ ", age=" + age + "]\n";
	}// end of toString()
	
}// end of PersonVO
