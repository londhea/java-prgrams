package com.techjivaa.fhirR4JsonConverter.streamprograms;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicateNumbers {

    public static void main(String[] args) {

        List<Integer> integerList =  Arrays.asList(23,54,12,76,26,17,49,95, 26,54);


        integerList.stream()
                .sorted((a,b) -> b.compareTo(a))
                .forEach(System.out::println);

        System.out.println("--------------");

        Set<Integer> duplicateIntegers = new HashSet<>();

        integerList
                .stream()
                .filter(s -> !duplicateIntegers.add(s))
                .forEach(System.out::println);

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(1, "Ravi", 10000.50, "Mumbai"));
        empList.add(new Employee(3, "Akshay", 24769.90, "Pune"));
        empList.add(new Employee(2, "Ram", 54226.90, "Mumbai"));
        empList.add(new Employee(4, "Abhi", 52826.90, "Kolkata"));

//        Comparator<Employee> employeeComparator = (i1,i2) -> (i1.getEmpName().compareTo(i2.getEmpName())) ? -1 : (i1.getEmpName().compareTo(i2.getEmpName())) ? +1 : 0;

//        Collections.sort(empList, employeeComparator);

        Iterator<Employee> iterator = empList.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        int[] arr = {34,65,23,76,43,88,17,54,34,68};

        Map<Boolean, List<Integer>> collect = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));


        System.out.println(" "+ collect);

//        List<Integer> evenList = integerList
//                .stream()
//                .filter(s -> duplicateIntegers.add(s))
//                .collect(Collectors.toList());
//
//        System.out.println("evenList : "+ evenList);

    }
}

/*

O/P

        26
        54
*/
