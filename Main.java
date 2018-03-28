package com.CSAssignments;
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




import javafx.stage.Stage;

public class Main extends Application{
   private  Button prev, exit, creditaccount, chequing, saving, transaction;
    @Override



  public void start(Stage stage) {
      GridPane pane = new GridPane();

      pane.setPadding(new Insets(10, 10, 10, 10));
      pane.setHgap(30);
      pane.setVgap(30);
      //HBox hbox = new HBox();

      prev = new Button("Back");
      exit = new Button("Exit");
      creditaccount = new Button("Credit Account");
      chequing = new Button("Chequing Account");
      saving = new Button("Saving Account");
      transaction = new Button("Transaction");

      pane.add(creditaccount, 0, 0);
      pane.add(chequing, 0, 1);
      pane.add(saving, 1, 0);
      pane.add(transaction, 1, 1);
      pane.add(prev, 0, 2);
      pane.add(exit, 1, 2);

      prev.setOnAction(this::processButtonpress);
      exit.setOnAction(this::processButtonpress);
      creditaccount.setOnAction(this::processButtonpress);
      chequing.setOnAction(this::processButtonpress);
      saving.setOnAction(this::processButtonpress);
      transaction.setOnAction(this::processButtonpress);


      Scene scene = new Scene(pane);
      stage.setScene(scene);
      stage.setTitle("ATM");
      stage.show();
  }
      public void processButtonpress(ActionEvent event){
          if(event.getSource() == creditaccount){

          }
          if(event.getSource() == prev){

          }
          if(event.getSource() == exit){

          }
          if(event.getSource() == chequing){

          }
          if(event.getSource() == saving){

          }
          if(event.getSource() == transaction){

          }

      }


    public static void main(String[] args) {
      Application.launch(Main.class, args);

    }



}
