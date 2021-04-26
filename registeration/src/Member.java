
public class Member 
{
private String uname,password,email,phone,rollno,dob,gender,course;

public Member() {
	super();
}

public Member(String uname, String password, String email, String phone, String rollno, String dob, String gender, String course) {
	super();
	this.uname = uname;
	this.password = password;
	this.email = email;
	this.phone = phone;
	this.rollno = rollno;
	this.dob = dob;
	this.gender = gender;
	this.course = course;
}


public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}

public void setPhone(String phone) {
	this.phone = phone;
}

public String getRollno() {
	return rollno;
}

public void setRollno(String rollno) {
	this.rollno = rollno;
}

public String getDob() {
	return dob;
}

public void setDob(String dob) {
	this.dob = dob;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getCourse() {
	return course;
}

public void setCourse(String course) {
	this.course = course;
}




	
}
