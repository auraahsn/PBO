/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
 /*
 Nama: Aura Husnaini P.Z
 NPM: 2017051045
 Kelas: A
 */
 
package main;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author ANT_HP
 */

public class Main extends Application  {
    @Override
    public void start(Stage primaryStage){
        
        primaryStage.setTitle("Register");
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);
        
        VBox root = new VBox();
        TilePane panel2 = new TilePane();
        
        Button btnReg = new Button();
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();
        TextField tf3 = new TextField();
        TextField tf4 = new TextField();
        TextField tf5 = new TextField();
        TextField tf6 = new TextField();
        Label lb1 = new Label("First Name");
        Label lb2 = new Label("Last Name");
        Label lb3 = new Label("E-Mail Address");
        Label lb4 = new Label("Contact No");
        Label lb5 = new Label("Password");
        Label lb6 = new Label("Confirm Password");
        btnReg.setText("Register");
                
        btnReg.setOnAction(event -> {
            System.out.println("Button diklik");
        });
        
        panel2.getChildren().addAll(btnReg);
        panel2.setAlignment(Pos.CENTER);
        panel2.setPadding(new Insets(40,20,20,10));
        btnReg.setStyle("-fx-font: 14 arial");
        btnReg.setStyle("-fx-text-fill: White");
        btnReg.setStyle("-fx-background-color: Blue");
        root.setPadding(new Insets(40,30,30,30));
        root.setSpacing(5); 
        
        root.getChildren().addAll(lb1, tf1, lb2, tf2, lb3, tf3, lb4, tf4, lb5, tf5, lb6, tf6, panel2);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    

    public static void main(String[] args) {
        launch(args);
    }

}
