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

public class ManagerManagementSystem {

    public static void display() {
        Stage window = new Stage();
        window.setTitle("Manager Management System");

        Label managerLabel = new Label("******************** Manager Management System ****************");
        Button addManagerButton = new Button("Add New Manager");
        Button displayAllManagersButton = new Button("Display All Managers");
        Button displayManagerButton = new Button("Display Manager");
        Button deleteManagerButton = new Button("Delete Manager");
        Button goBackButton = new Button("Go back");

        addManagerButton.setOnAction(e -> {
            Manager manager = new Manager();
            manager.add_worker();
        });

        displayAllManagersButton.setOnAction(e -> {
            Manager manager = new Manager();
            manager.display_all_Managers();
        });

        displayManagerButton.setOnAction(e -> {
            Manager manager = new Manager();
            manager.display_worker();
        });

        deleteManagerButton.setOnAction(e -> Manager.delete_manager());

        goBackButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10, managerLabel, addManagerButton, displayAllManagersButton, displayManagerButton, deleteManagerButton, goBackButton);
        Scene scene = new Scene(layout, 400, 300);
        window.setScene(scene);
        window.show();
    }
}

