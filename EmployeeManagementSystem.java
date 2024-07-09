/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class EmployeeManagementSystem {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("Employee Management System");

        Label employeeLabel = new Label("******************** Employee Management System ****************");
        Button addEmployeeButton = new Button("Add New Employee");
        Button displayAllEmployeesButton = new Button("Display All Employees");
        Button displayEmployeeButton = new Button("Display Employee");
        Button deleteEmployeeButton = new Button("Delete Employee");
        Button goBackButton = new Button("Go back");

        addEmployeeButton.setOnAction(e -> {
            Employee employee = new Employee();
            employee.add_worker();
        });

        displayAllEmployeesButton.setOnAction(e -> {
            Employee employee = new Employee();
            employee.display_all_employees();
        });

        displayEmployeeButton.setOnAction(e -> {
            Employee employee = new Employee();
            employee.display_worker();
        });

        deleteEmployeeButton.setOnAction(e -> Employee.delete_employee());

        goBackButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10, employeeLabel, addEmployeeButton, displayAllEmployeesButton, displayEmployeeButton, deleteEmployeeButton, goBackButton);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}
