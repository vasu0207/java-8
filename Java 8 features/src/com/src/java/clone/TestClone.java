package com.src.java.clone;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Entered Main");
        Employee emp = new Employee();
        emp.setFname("Fname");
        emp.setLname("Lname");
        Address add = new Address();
        emp.setAddress(add);
        add.setCity("hyd");
        add.setCountry("india");
        add.setDistrict("lingampally");
        add.setState("AP");

        Employee cloned = (Employee) emp.clone();
        System.out.println("original : " + emp.toString());

        System.out.println("cloned   : " + cloned.toString());

        Address add1 = new Address();
        add1.setCity("nagpur");
        add1.setCountry("maharastra");
        add1.setDistrict("nagpur");
        add1.setState("nagpur");

        cloned.getAddress().setState("Nagpur");
        cloned.setFname("Changed");

        System.out.println("After updated......");
        System.out.println("original : " + emp.toString());

        System.out.println("cloned   : " + cloned.toString());
        System.out.println("Exist Main");
    }
}
