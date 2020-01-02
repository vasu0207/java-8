package com.src.java.clone;

public class Employee implements Cloneable{

    private String fname;
    private String Lname;
    private Address address;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{

        Employee cloned = (Employee) super.clone();
        cloned.setAddress((Address) cloned.getAddress().clone());
       return cloned;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "fname='" + fname + '\'' +
                ", Lname='" + Lname + '\'' +
                ", address=" + address +
                '}';
    }
}
