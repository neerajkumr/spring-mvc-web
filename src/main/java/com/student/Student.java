package com.student;

public class Student {
	private String sName;
	private int sId;
	private String DOB;

	public Student() {
		super();
	}

	public Student(String sName, int sId, String dOB) {
		super();
		this.sName = sName;
		this.sId = sId;
		DOB = dOB;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	@Override
	public String toString() {
		return "Employee [sName=" + sName + ", sId=" + sId + ", DOB=" + DOB + "]";
	}

}
