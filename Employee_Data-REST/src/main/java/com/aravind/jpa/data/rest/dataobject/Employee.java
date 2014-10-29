
/**
 * 
 */
package com.aravind.jpa.data.rest.dataobject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * POJO class that helps to map db entity
 * @author aravind
 *
 */
@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private int empID;
	private String empName;
	private String empDept;
	private double salary;
	private String designation;
	
	

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}



	/**
	 * @return the empID
	 */
	public int getEmpID() {
		return empID;
	}



	/**
	 * @param empID the empID to set
	 */
	public void setEmpID(int empID) {
		this.empID = empID;
	}



	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}



	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	/**
	 * @return the empDept
	 */
	public String getEmpDept() {
		return empDept;
	}



	/**
	 * @param empDept the empDept to set
	 */
	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}



	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}
	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee ID = " + empID + "--" + "Employee Name = " + empName
				+ "--" + "Department = " + empDept + "--" + "Salary = "
				+ salary + "--" + "Designation = " + designation;
	}
}
