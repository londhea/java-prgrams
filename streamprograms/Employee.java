package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.Comparator;
import java.util.Objects;

public class Employee {

    private long empId;
    private String empName;
    private double empSalary;
    private String empLocation;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpLocation() {
        return empLocation;
    }

    public void setEmpLocation(String empLocation) {
        this.empLocation = empLocation;
    }

    public Employee(){

    }

    public Employee(long empId, String empName, double empSalary, String empLocation) {
        this.empId = empId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empLocation = empLocation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empLocation='" + empLocation + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId &&
                Double.compare(employee.empSalary, empSalary) == 0 &&
                Objects.equals(empName, employee.empName) &&
                Objects.equals(empLocation, employee.empLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, empName, empSalary, empLocation);
    }

//    @Override
//    public int compareTo(Object o) {
//        long eid1 = this.empId;
//
//        Employee e1 = (Employee) o;
//        long eid2 = e1.getEmpId();
//
//        System.out.println(eid1 +" <=> "+ eid2);
//        if(eid1 > eid2) {
//            return -1;
//        } else if ( eid1 < eid2) {
//            return +1;
//        } else {
//            return 0;
//        }
//    }

    public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getEmpName().compareTo(o2.getEmpName());
        }
    };
}
