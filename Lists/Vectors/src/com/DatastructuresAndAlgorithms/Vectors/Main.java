package com.DatastructuresAndAlgorithms.Vectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

//        Vector class is a thread safe arrayList.
//        Vector is there since beginning (Java 1.0).
//        ArrayList was introduced in Java 1.2.
//        If thread safety is not important, it is recommended to use ArrayList.

        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));

        // We can see the implementation of Constructor by ctrl+click on Vector.
        // We can see the implementation of add() method by ctrl+click on add.

    }
}
