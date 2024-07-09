/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.util.ArrayList;
import java.util.Scanner;



public class Employee extends Worker{
    
      
    
    private static ArrayList<Employee> employeesList = new ArrayList<>();
    private static ArrayList<String> idset = new ArrayList<>();
    
    public Employee() {}
    // Constructor
    public Employee(String worker_id, String name, String address, String email, int salary) {
        this.worker_id = worker_id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
    }

    
     //check ID availlability
    public static Boolean check_Id_inset(String  n){
         return idset.contains(n);
    }
    //add
     @Override
    public void add_worker(){
        boolean avail=true;
      String id="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter employee name:");
        name = in.nextLine();
while(avail){
        System.out.println("Enter employee ID:");
        id = in.nextLine();
        
        avail=check_Id_inset(id);
        if(avail)
          System.out.println("Id is already taken,Enter another Id.");  
}
worker_id=id;
idset.add(id);
        System.out.println("Enter employee address:");
        address = in.nextLine();

        System.out.println("Enter employee email:");
        email = in.nextLine();

        System.out.println("Enter employee salary:");
        salary = in.nextInt();

        employeesList.add(new Employee(worker_id, name, address, email,salary));

        System.out.println("Employee added ");
    }

    //  display employee details
     
     @Override
    public void display_worker() {
        boolean avail=false;
      int index=0;
       String id;
        Scanner in2 = new Scanner(System.in);
        while(!avail){
        System.out.println("Enter employee ID you want to read:");
        id = in2.nextLine();
       
        avail=check_Id_inset(id);
        index=idset.indexOf(id);
        if(!avail)
            System.out.println("ID Not Found ,Enter Another ID");
}
        
        
         System.out.println("Name: " + employeesList.get(index).getName());
        System.out.println("Employee ID: " + employeesList.get(index).getworker_id());
        System.out.println("Address: " + employeesList.get(index).getAddress());
        System.out.println("Email: " + employeesList.get(index).getEmail());
        System.out.println("Salary: " + employeesList.get(index).getSalary());
        
    }

    // display all employees
    public  void display_all_employees() {
        System.out.println("\nAll Employees:");
        for (Employee emp : employeesList) {
           System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getworker_id());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
    }
     
    public static void delete_employee(){
        boolean avail=false;
        int index;
       String id="";
        Scanner in = new Scanner(System.in);
        while(!avail){
        System.out.println("Enter employee ID you want to delete:");
        id = in.nextLine();
       
        avail=check_Id_inset(id);
        if(!avail)
            System.out.println("ID Not Found ,Enter Another ID");
}
index=idset.indexOf(id);
idset.remove(index);
employeesList.remove(index);
 System.out.println("Employee has been Deleted");
    }
}
