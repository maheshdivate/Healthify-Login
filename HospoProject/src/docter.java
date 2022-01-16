import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class docter {
	
	
	@Id
	int uId;
	String Name;
	String Email;
	String password;
	String cPassword;
	String mobile;
	String Qualification;
	String Specialisation;
	String City;
	int pincode;
	
	@Override
	public String toString() {
		return "docter [uId=" + uId + ", Name=" + Name + ", Email=" + Email + ", password=" + password + ", cPassword="
				+ cPassword + ", mobile=" + mobile + ", Qualification=" + Qualification + ", Specialisation="
				+ Specialisation + ", City=" + City + ", pincode=" + pincode + "]";
	}
	public docter(int uId, String name, String email, String password, String cPassword, String mobile,
			String qualification, String specialisation, String city, int pincode) {
		super();
		this.uId = uId;
		Name = name;
		Email = email;
		this.password = password;
		this.cPassword = cPassword;
		this.mobile = mobile;
		Qualification = qualification;
		Specialisation = specialisation;
		City = city;
		this.pincode = pincode;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public String getSpecialisation() {
		return Specialisation;
	}
	public void setSpecialisation(String specialisation) {
		Specialisation = specialisation;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	
	

}
