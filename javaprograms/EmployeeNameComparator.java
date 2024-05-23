package com.techjivaa.fhirR4JsonConverter.javaprograms;

import com.techjivaa.fhirR4JsonConverter.streamprograms.Employee;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {

//    @Override
//    public int compare(Employee e1, Employee e2) {
//        return e1.getEmpName().compareTo(e2.getEmpName());
//    }

    @Override
    public int compare(Employee e1, Employee e2) {
        return String.valueOf(e1.getEmpSalary()).compareTo(String.valueOf(e2.getEmpSalary()));
    }
}
