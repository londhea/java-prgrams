package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class FindEmpMaxSalaryUsingStream {

    public static void main(String[] args) {


        List<String> strList = new ArrayList<>();

        strList.add("Ravi");
        strList.add("Akshay");
        strList.add("Ram");
        strList.add("Abhi");

        Collections.sort(strList, (a,b) -> b.compareTo(a));

        System.out.println(strList);

        System.out.println("----------------");

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Ravi", 10000.50, "Mumbai"));
        empList.add(new Employee(3, "Akshay", 24769.90, "Pune"));
        empList.add(new Employee(2, "Ram", 54226.90, "Mumbai"));
        empList.add(new Employee(4, "Abhi", 52826.90, "Kolkata"));

//        Collections.sort(empList, Employee.nameComparator);

        Collections.sort(empList, (a,b) -> b.getEmpName().compareTo(a.getEmpName()));


        System.out.println("Sorted : "+ empList);

        System.out.println("----------------");

        Employee emp = new Employee(1, "Akshay", 4322.90, "Pune");
        Employee emp1 = new Employee(1, "Akshay", 4322.90, "Pune");
        Employee emp2 = emp;

        System.out.println(emp.hashCode() +" "+ emp1.hashCode() +" "+ emp2.hashCode());
        System.out.println(" Shallow compare "+ (emp == emp1));
        System.out.println(" Deep compare "+ (emp.equals(emp1)));



        System.out.println(emp == emp2);
        System.out.println(emp2.equals(emp));

        List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(15);
        intList.add(26);
        intList.add(29);
        System.out.println("Before remove element IntList : "+ intList);
        intList.remove(new Integer(26));
        System.out.println("After remove element IntList : "+ intList);

//        List<Employee> empList = new ArrayList<>();
//        empList.add(new Employee(1, "Akshay", 24769.90, "Pune"));
//        empList.add(new Employee(2, "Ravi", 10000.50, "Mumbai"));
//        empList.add(new Employee(3, "Ram", 54226.90, "Mumbai"));

        List<Employee> collect = empList.stream()
//                .filter(item -> item.getEmpId() > 1)
                .map(e -> {
                    if(e.getEmpId() > 1) {
                        e.setEmpSalary(e.getEmpSalary() * 1.2);
                    }
                    return e;
                })
                .collect(Collectors.toList());

        System.out.println("Salary incremented : "+ collect);


//        Map<String, Long> empLocationCount = empList.stream()
//                .collect(Collectors.groupingBy(Employee::getEmpLocation, Collectors.counting()));
//        System.out.println("Employee Location Count : "+ empLocationCount);

        Map<String, Double> collectAverageAgeByEmpLocation = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpLocation, Collectors.averagingDouble(Employee::getEmpSalary)));

        System.out.println("Employee Salary Average based on Location : "+ collectAverageAgeByEmpLocation);


        long empCount = empList.stream()
                .map(item -> item.getEmpSalary())
                .count();

        Employee empMaxSalary = empList.stream()
                .max(Comparator.comparing(Employee::getEmpSalary)).orElse(null);

        System.out.println("Max Salary : "+ empMaxSalary);

        Map<Employee, String> empMap = new HashMap<>();

        empMap.put(new Employee(1, "Akshay", 24769.90, "Pune"), "Pune");
        empMap.put(new Employee(2, "Ravi", 10000.50, "Mumbai"), "Mumbai");
        empMap.put(new Employee(1, "Akshay", 24769.90, "Pune"), "Kolkata");

        System.out.println();
        empMap.forEach((k, v) -> System.out.println(k +" <-> "+ v));

    }
}

/*
    159413332 1028214719 159413332
    false
    false
    true
    true
    true

    Employee emp = new Employee(1, "Akshay", 4322.90, "Pune");
    Employee emp1 = new Employee(1, "Akshay", 4322.90, "Pune");
    Employee emp2 = emp;

    System.out.println(emp.hashCode() +" "+ emp1.hashCode() +" "+ emp2.hashCode()); //-88433453 1059039781 -88433453

    System.out.println(emp == emp1);        // false
    (both are the new objects and have different refencec into the memory that's why it returns false)

    System.out.println(emp.equals(emp1));   // true
    (we override the equals method in Employee class and matching all the variables,
    If we added space or change character also it will return false)


    System.out.println(emp == emp2);        // true
    System.out.println(emp2.equals(emp));   // true

*/