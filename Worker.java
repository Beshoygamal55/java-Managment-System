/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;


abstract class Worker implements Person {
    protected String worker_id="";
    protected String name="";
    protected String address="";
    protected String email="";
    protected int salary=0;
   public String getworker_id() {
        return worker_id;
    }

    public void setworker_id(String employee_id) {
        this.worker_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
   
   @Override
   public void add_worker(){};
    @Override
   public void display_worker(){};
}
