package com.javaprc.feature00.beans;

public class Employee {
	
	private Integer empId;
    private String empName;    // Employee Name
    private String deptName;   // IT, Account, Security
    private String roleName;   // admin, user, staff
    private double sal;        // Salary

    // Default Constructor
    public Employee() {}

    // Parameterized Constructor
    public Employee(Integer empId, String empName, String deptName, String roleName, double sal) {
        this.empId = empId;
        this.empName = empName;
        this.deptName = deptName;
        this.roleName = roleName;
        this.sal = sal;
    }

    // Getters and Setters
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + 
               ", deptName=" + deptName + ", roleName=" + roleName + 
               ", sal=" + sal + "]";
    }
	
}
