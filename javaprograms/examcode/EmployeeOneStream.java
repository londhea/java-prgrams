package com.techjivaa.fhirR4JsonConverter.javaprograms.examcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class EmployeeOneStream {

    public static void main(String[] args) {

        // Find employee by gender

        EmployeeOne e1 = new EmployeeOne(1, "Abc", 23, "Male", "76348");
        EmployeeOne e2 = new EmployeeOne(2, "Pqr", 34, "Female", "24967");
        EmployeeOne e3 = new EmployeeOne(3, "Xyz", 27, "Female", "63567");
        EmployeeOne e4 = new EmployeeOne(4, "Tuv", 26, "Male", "43876");
        EmployeeOne e5 = new EmployeeOne(5, "Wxy", 37, "Male", "66567");

        List<EmployeeOne> employeeOneList = new ArrayList<>();
        employeeOneList.add(e1);
        employeeOneList.add(e2);
        employeeOneList.add(e3);
        employeeOneList.add(e4);
        employeeOneList.add(e5);


        long maleCount = employeeOneList.stream()
                .filter(item -> item.getGender().equals("Male"))
                .count();

        System.out.println("Male Count : "+ maleCount);

        long femaleCount = employeeOneList.stream()
                .filter(item -> item.getGender().equals("Female"))
                .count();
        System.out.println("Female Count : "+ femaleCount);

        Map<String, Long> collect = employeeOneList.stream()
                .collect(Collectors.groupingBy(e -> e.getGender(), Collectors.counting()));
        System.out.println("Collect : "+ collect);

    }
}
