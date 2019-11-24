package org.askdev.maven;

public class Student {

    private int id;
    private String name;
    Address addr1;

    public Student(int id, String name, Address addr1) {
        this.id = id;
        this.name = name;
        this.addr1 = addr1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddr1() {
        return addr1;
    }

    public void setAddr1(Address addr1) {
        this.addr1 = addr1;
    }
}
