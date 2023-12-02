// package org.example;

import java.lang.*;
import java.util.*;

public class test3 {
    public static class Employee {
        private int id;
        private String name;

        public int getID() {
            return id;
        }

        public void setID(int id) {
            this.id = id;
        }

        // getter and setter methods
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Employee(int id, String name) {
            super();
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String args[]) {
        Employee emp = new Employee(14, "Raman");
        Employee emp2 = new Employee(29, "Shreya");
        Employee emp3 = new Employee(14, "Raman");
        Employee emp4 = emp;

        System.out.println(emp.toString()); // Statement-1
        System.out.println(emp.equals(emp2)); // Statement-2
        System.out.println(emp.equals(emp3)); // Statement-3
        System.out.println(emp.equals(emp4)); // Statement-4
    }
}
