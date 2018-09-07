package demo;

public class Bean {
	private int symbolNo;
	private int getSymbolNo() {
		return symbolNo;
	}
	public void setSymbolNo(int symbolNo) {
		this.symbolNo = symbolNo;
	}
	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public  String getInstitution() {
		return institution;
	}
	public  void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getEmail() {
		return email;
	}
	public  void setEmail(String email) {
		this.email = email;
	}
	public  String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String name, institution, email,password;
}
