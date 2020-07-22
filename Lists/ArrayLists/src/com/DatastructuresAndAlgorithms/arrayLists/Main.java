package com.DatastructuresAndAlgorithms.arrayLists;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        List :
//
//        List is not a concrete data structure.
//        It is an abstract datatype.
//        Doesn't dictate how data is organized.
//        Dictates the operations you can perform.
//        Concrete data structure is usually a concrete class (Except array).
//        Abstract datatype is usually an interface (List).
//
//
//        ArrayList :
//
//        Resizable-array implementation of the List Interface.
//        When we create a list, in the background, an array is created.
//        If we don't specify capacity to the list, it is by default 10.
//        Capacity is 10. So it can hold up to 10 elements when a list is created without specifying capacity.
//        Now if I add 4 elements, then the size is 4. Capacity is still 10.
//        NOT SYNCHRONIZED i.e., ArrayLists are not thread safe.
//        Vector is thread safe.
//        If thread safety is not important, it is recommended to use ArrayList.

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.get(1));

        System.out.println(employeeList.isEmpty());

        employeeList.set(1, new Employee("John", "Adams", 4568));  // O(1)
        employeeList.forEach(employee -> System.out.println(employee));

        System.out.println(employeeList.size());
        employeeList.add(3, new Employee("John", "Doe", 4567));
        employeeList.forEach(employee -> System.out.println(employee));

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        // In the above line, we are extracting the array which is created when the employeeList is created.
        // To define the employeeArray type as Employee[], we need to pass
        // new Employee[employeeList.size()] in employeeList.toArray() method.
        for(Employee employee : employeeArray)
        {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary", "Smith", 22)));
        System.out.println(employeeList.indexOf(new Employee("John", "Doe", 4567)));
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));

        // ArrayList
        // is good for random access if index is known.
        // is good for iterating.
        // is NOT good for inserting the item at any position other than end.
        // is NOT good for deletions/removals
        // is NOT good for accessing the list when index is not known.

    }
}
