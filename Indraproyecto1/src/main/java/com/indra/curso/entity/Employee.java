package com.indra.curso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
	
	@OneToOne
	@JoinColumn(name="JOB_ID")
	private Jobs job;
	
	@Column(name="SALARY")
	private float Salary;
	
	@Column(name="COMMISSION_PCT")
	private String commissionpct;
	
	@Column(name="MANAGER_ID")
	private String managerid ;
	
	@OneToOne
	@JoinColumn(name="DEPARTMENT_ID")
	private Department department;

	//Constructor vacio
     public Employee(){}
    
    //Constructor 
 	public Employee(Integer employeeid, String firstname, String lastname, String email, String phonenumber,
 			String hiredate, Jobs job, float salary, String commissionpct, String managerid, Department department) {
 		super();
 		this.employeeid = employeeid;
 		this.firstname = firstname;
 		this.lastname = lastname;
 		Email = email;
 		this.phonenumber = phonenumber;
 		this.hiredate = hiredate;
 		this.job = job;
 		Salary = salary;
 		this.commissionpct = commissionpct;
 		this.managerid = managerid;
 		this.department = department;
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

	public Jobs getJob() {
		return job;
	}

	public void setJob(Jobs job) {
		this.job = job;
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
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//to String
	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname + ", Email="
				+ Email + ", phonenumber=" + phonenumber + ", hiredate=" + hiredate + ", job=" + job + ", Salary="
				+ Salary + ", commissionpct=" + commissionpct + ", managerid=" + managerid + ", department="
				+ department + "]";
	}  
}
