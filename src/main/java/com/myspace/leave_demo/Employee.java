package com.myspace.leave_demo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Employee implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private java.lang.Long empId;
	private java.lang.String fName;
	private java.lang.String lName;
	private java.lang.Long level;

	private com.myspace.leave_demo.Department department;

	public Employee() {
	}

	public java.lang.Long getEmpId() {
		return this.empId;
	}

	public void setEmpId(java.lang.Long empId) {
		this.empId = empId;
	}

	public java.lang.String getfName() {
		return this.fName;
	}

	public void setfName(java.lang.String fName) {
		this.fName = fName;
	}

	public java.lang.String getlName() {
		return this.lName;
	}

	public void setlName(java.lang.String lName) {
		this.lName = lName;
	}

	public java.lang.Long getLevel() {
		return this.level;
	}

	public void setLevel(java.lang.Long level) {
		this.level = level;
	}

	public com.myspace.leave_demo.Department getDepartment() {
		return this.department;
	}

	public void setDepartment(com.myspace.leave_demo.Department department) {
		this.department = department;
	}

	public Employee(java.lang.Long empId, java.lang.String fName,
			java.lang.String lName, java.lang.Long level,
			com.myspace.leave_demo.Department department) {
		this.empId = empId;
		this.fName = fName;
		this.lName = lName;
		this.level = level;
		this.department = department;
	}

}