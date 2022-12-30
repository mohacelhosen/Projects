package org.nexttech.club;

public class Students {
    private String name;
    private  int id;
    private String Department;

    public Students(String name, int id, String Department){
        this.name = name;
        this.id = id;
        this.Department = Department;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setDepartment(String Department){
        this.Department = Department;
    }

    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    public String getDepartment() {
        return Department;
    }
}
