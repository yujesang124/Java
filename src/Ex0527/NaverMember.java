package Ex0527;

public class NaverMember {

	/*
	 1. 필드
	 String 타입의 아이디, 비밀번호, 이름, 생년월일, 성별, 이메일, 휴대전화 (비밀번호는 private로 설정)

	 2. getter, setter 지정
	 
	 3. 기본생성자와 모든 매개변수를 가지고 있는 생성자
	 
	 4. toString()메소드 생성
	 */
	String id;
	private String password;
	String name;
	String birth;
	String gender;
	String email;
	String phoneNum;
	// 매개변수 생성자
	public NaverMember(String id, String password, String name, String birth, String gender, String email, String phoneNum) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.birth = birth;
		this.gender = gender;
		this.email = email;
		this.phoneNum = phoneNum;
		
	}
	
	public NaverMember() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonNum() {
		return phoneNum;
	}
	public void setPhonNum(String phonNum) {
		this.phoneNum = phonNum;
	}

	@Override
	public String toString() {
		return "NaverMember [id=" + id + ", password=" + password + ", name=" + name + ", birth=" + birth + ", gender="
				+ gender + ", email=" + email + ", phoneNum=" + phoneNum + "]";
	}
}
