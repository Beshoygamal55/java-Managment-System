/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Worker {
     private int bonus=0;
      private static ArrayList<Manager> managerList = new ArrayList<>();
    private static ArrayList<String> idset_manager = new ArrayList<>();
    
    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
//constructor 
     public Manager(){}
    public Manager(String worker_id, String name, String address, String email, int salary, int bonus) {
        this.worker_id = worker_id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.salary = salary;
        this.bonus = bonus;
    }
public static Boolean check_Id_inset(String  n){
         return idset_manager.contains(n);
    }
    
 @Override
 public void add_worker(){
        boolean avail=true;
      String id="";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Manager name:");
        name = in.nextLine();
while(avail){
        System.out.println("Enter Manager ID:");
        id = in.nextLine();
        
        avail=check_Id_inset(id);
        if(avail)
          System.out.println("Id is already taken,Enter another Id.");  
}
worker_id=id;
idset_manager.add(id);
        System.out.println("Enter Manager address:");
        address = in.nextLine();

        System.out.println("Enter Manager email:");
        email = in.nextLine();

        System.out.println("Enter Manager salary:");
        salary = in.nextInt();

         System.out.println("Enter Manager bonus:");
        bonus = in.nextInt();
        
        managerList.add(new Manager(worker_id, name, address, email,salary,bonus));

        System.out.println("Manager added ");
    }

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
        index=idset_manager.indexOf(id);
        if(!avail)
            System.out.println("ID Not Found ,Enter Another ID");
}
        
        
         System.out.println("Name: " + managerList.get(index).getName());
        System.out.println("Employee ID: " + managerList.get(index).getworker_id());
        System.out.println("Address: " + managerList.get(index).getAddress());
        System.out.println("Email: " + managerList.get(index).getEmail());
        System.out.println("Salary: " + managerList.get(index).getSalary());
         System.out.println("Salary: " + managerList.get(index).getBonus());
    }
    public  void display_all_Managers() {
        System.out.println("\nAll Managers:");
        for (Manager emp : managerList) {
           System.out.println("\nManager Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Manager ID: " + emp.getworker_id());
        System.out.println("Address: " + emp.getAddress());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Bonus: " + emp.getBonus());
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        }
    }
      public static void delete_manager(){
        boolean avail=false;
        int index;
       String id="";
        Scanner in = new Scanner(System.in);
        while(!avail){
        System.out.println("Enter manager ID you want to delete:");
        id = in.nextLine();
       
        avail=check_Id_inset(id);
        if(!avail)
            System.out.println("ID Not Found ,Enter Another ID");
}
index=idset_manager.indexOf(id);
idset_manager.remove(index);
managerList.remove(index);
 System.out.println("manager has been Deleted");
    }
}
