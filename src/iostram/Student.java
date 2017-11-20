package iostram;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1234L;
	
	private long StudentID;
	
	private String name;
	
	private char sex;

	public Student(long studentID, String name, char sex) {
		// TODO Auto-generated constructor stub
		this.StudentID = studentID;
		this.name = name;
		this.sex = sex;
	}

	public long getStudentID() {
		return StudentID;
	}

	public void setStudentID(long studentID) {
		StudentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", name=" + name + ", sex=" + sex + "]";
	} 
	
}
