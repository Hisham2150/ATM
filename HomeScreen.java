package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.stage.Stage;

public class HomeScreen extends Application {
private Button sign, exit;
  @Override

    public void start(Stage stage){



    GridPane pane = new GridPane();
      pane.setPadding(new Insets(10, 10, 10, 10));
      pane.setHgap(15);
      pane.setVgap(30);
      sign = new Button("Sign in");
      exit = new Button("Exit");

      Label welcome = new Label("Welcome To The Bank of America");
      Label pin = new Label("Enter your PIN");
      TextField text = new TextField();

      pane.add(welcome,0,0);
      pane.add(pin,0,1);
      pane.add(text,1,1);
      pane.add(sign,0,2);


      Scene scene = new Scene(pane);
      stage.setTitle("HomeScreen");
      stage.setScene(scene);
      stage.show();





  }




    public static void Main(String[] args) {
        Application.launch(HomeScreen.class, args);
    }
}
