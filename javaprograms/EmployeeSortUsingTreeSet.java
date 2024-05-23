package com.techjivaa.fhirR4JsonConverter.javaprograms;

import com.techjivaa.fhirR4JsonConverter.streamprograms.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeSortUsingTreeSet {
    public static void main(String[] args) {

        /*
        Set<Employee> empSet = new TreeSet<>(new EmployeeNameComparator());

        empSet.add(new Employee(1, "Rahul", 34666.00, "Pune"));
        empSet.add(new Employee(2, "Abhi", 45000.00, "Pune"));
        empSet.add(new Employee(3, "Sunil", 28000.00, "Delhi"));
        empSet.add(new Employee(4, "Vishal", 53000.00, "Mumbai"));

        for(Employee e : empSet) {
            System.out.println(e);
        }
        */
//        System.out.println(empSet);



        Set<String> empSet = new TreeSet<>();

        empSet.add("Rahul");
        empSet.add("Abhi");
        empSet.add("Sunil");
        empSet.add("Vishal");
        empSet.add("");

        for(String s : empSet) {
            System.out.println(s);
        }


        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Rahul", 34666.00, "Pune"));
        empList.add(new Employee(2, "Abhi", 45000.00, "Pune"));
        empList.add(new Employee(3, "Sunil", 28000.00, "Delhi"));
        empList.add(new Employee(4, "Vishal", 53000.00, "Mumbai"));

        System.out.println("ArrayList : Sorting based on Employee name : ");

        empList.stream()
                .sorted(Comparator.comparing(item -> item.getEmpName()))
                .forEach(System.out::println);


        List<String> empStringList = new ArrayList<>();

        empStringList.add("Rahul");
        empStringList.add("Abhi");
        empStringList.add("Sunil");
        empStringList.add("Vishal");
        empStringList.add("");

        System.out.println("ArrayList : Sorting String : ");

        empStringList.stream()
                .sorted()
                .forEach(System.out::println);

//        for()
    }
}
