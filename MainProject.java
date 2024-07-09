/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainProject extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Management System");

        Label welcomeLabel = new Label("******************** Welcome To Our Management System ****************");
        Button managerButton = new Button("Manager Management System");
        Button employeeButton = new Button("Employee Management System");
        Button exitButton = new Button("Exit");

        managerButton.setOnAction(e -> ManagerManagementSystem.display());
        employeeButton.setOnAction(e -> EmployeeManagementSystem.display());
        exitButton.setOnAction(e -> {
            System.out.println("Exiting.");
            primaryStage.close();
        });

        VBox layout = new VBox(10, welcomeLabel, managerButton, employeeButton, exitButton);
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

