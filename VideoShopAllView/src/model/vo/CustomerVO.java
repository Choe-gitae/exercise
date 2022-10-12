package model.vo;

public class CustomerVO {
	String name;		// 고객명
	String tel;			// 전화번호
	String addTel;		// 보조 전화번호
	String addr;		// 주소
	String email;		// 이메일

	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddTel() {
		return addTel;
	}
	public void setAddTel(String addTel) {
		this.addTel = addTel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
