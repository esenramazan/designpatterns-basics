package com.ramazan.designpatterns.structural.composite.jpaexample;

import java.util.List;

//@Entity
//@Table(name = "employees")
public class Employee implements EmployeeComponent {

//    @Id
    private Long empId;
    private String name;
    private String position;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "manager_id")
    private List<Employee> subordinates;

    // getters and setters

    @Override
    public void showEmployeeDetails() {
        System.out.println(empId+" " +name+ " " + position );
        if (subordinates != null) {
            for (EmployeeComponent subordinate : subordinates) {
                subordinate.showEmployeeDetails();
            }
        }
    }
}