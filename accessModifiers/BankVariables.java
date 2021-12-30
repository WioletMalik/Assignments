package accessModifiers;

public class BankVariables {

	private String Name = "wiolet";
	private String Address = "Brampton";
	int sin = 123456;

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		if (name.length() < 20)
			;
		this.Name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public int getSin() {
		
		return sin;
	}

	public void setSin(int sin) {
		if(sin > 10000 && sin < 20000) {
			this.sin = sin;
		}
		
	}

}
