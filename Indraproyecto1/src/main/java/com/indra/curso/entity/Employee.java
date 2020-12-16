package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employees")
public class Employee {
	@Id
	@Column(name = "EMPLOYEE_ID") 
	private Integer employeeid;
	
	@Column(name="FIRST_NAME")
	private String firstname;
	
	@Column(name="LAST_NAME")
	private String lastname;
	
	@Column(name="EMAIL")
	private String Email;
	
	@Column(name="PHONE_NUMBER")
	private String phonenumber;
	
	@Column(name="HIRE_DATE")
	private String hiredate;
	
	@Column(name="JOB_ID")
	private String JobId;
	
	@Column(name="SALARY")
	private float Salary;
	
	@Column(name="COMMISSION_PCT")
	private String commissionpct;
	
	@Column(name="MANAGER_ID")
	private String managerid ;
	
	@Column(name="DEPARTMENT_ID")
	private String departmentid;

	//Constructor vacio
     public Employee(){}
    
    //Constructor 
     public Employee(Integer employeeid, String firstname, String lastname, String email, String phonenumber, String hiredate,
 			String jobId, float salary, String commissionpct, String managerid, String departmentid) {
 		super();
 		this.employeeid = employeeid;
 		this.firstname = firstname;
 		this.lastname = lastname;
 		Email = email;
 		this.phonenumber = phonenumber;
 		this.hiredate = hiredate;
 		JobId = jobId;
 		Salary = salary;
 		this.commissionpct = commissionpct;
 		this.managerid = managerid;
 		this.departmentid = departmentid;
 	}

     
    //Getter and setter
    public Integer getEmployeeid() {
 		return employeeid;
 	}
    
    public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getJobId() {
		return JobId;
	}

	public void setJobId(String jobId) {
		JobId = jobId;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

	public String getCommissionpct() {
		return commissionpct;
	}

	public void setCommissionpct(String commissionpct) {
		this.commissionpct = commissionpct;
	}

	public String getManagerid() {
		return managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

	public String getDepartmentid() {
		return departmentid;
	}

	public void setDepartmentid(String departmentid) {
		this.departmentid = departmentid;
	}
	
	//to String
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname + ", Email="
				+ Email + ", phonenumber=" + phonenumber + ", hiredate=" + hiredate + ", JobId=" + JobId + ", Salary="
				+ Salary + ", commissionpct=" + commissionpct + ", managerid=" + managerid + ", departamentid="
				+ departmentid + "]";
	}
      
}
