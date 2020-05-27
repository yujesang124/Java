package Ex0527;

public class Member {
	String name;
	String id;
	String password;
	int age;

	Member(String name, String id) {
		this.name = name;
		this.id = id;

	}

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 13-1
	boolean login(String id, String password) {
		if (id.equals("inchoriya") && password.equals("12345") ) {
			return true;
		} else {
			return false;
		}

	}

	// 13-2
	public void logout(String id) {
		if (id.equals("inchoriya")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}

}
