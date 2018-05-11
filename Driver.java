package cs1302.calc;

import javafx.scene.control.Button;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import javafx.scene.paint.Color;

/**
 * This is the driver for this application.
 * This class holds methods that allow the user to interact with the GUI in order to perform mathmatical operations.
 * @author SAMANTHA CARLILE <sjc13678@uga.edu>
 * @author BRIAN WEBER <bw75762@uga.edu>
 */
 
public class Driver extends Application {
    // varibles 
    final Button one = new Button("1");
    final Button two = new Button("2");
    final Button three = new Button("3");
    final Button zero = new Button("0");
    final Button four = new Button("4");
    final Button five = new Button("5");
    final Button six = new Button("6");
    final Button seven = new Button("7");
    final Button eight = new Button("8");
    final Button nine = new Button("9");
    final Button equal = new Button("=");
    final Button plus = new Button("+");
    final Button minus = new Button("-");
    final Button multiply = new Button("*");
    final Button carrot = new Button("^");
    final Button divide = new Button("/");
    final Button exclaim= new Button("!");
    final Button arrow = new Button("<");
    final Button bigX = new Button("X");
    final Button leftArrow = new Button("<<");
    final Button rightArrow = new Button(">>");
    public Button r = new Button("Use Recursion");
    Button b = new Button("Hide Binary");
    Label bit = new Label("0");
    Label bit1 = new Label("0");
    Label bit2 = new Label("0");
    Label bit3 = new Label("0");
    Label bit4 = new Label("0");
    Label bit5 = new Label("0");
    Label bit6 = new Label("0");
    Label bit7 = new Label("0");
    Label bit8 = new Label("0");
    Label bit9 = new Label("0");
    Label bit10 = new Label("0");
    Label bit11 = new Label("0");
    Label bit12 = new Label("0");
    Label bit13 = new Label("0");
    Label bit14 = new Label("0");
    Label bit15 = new Label("0");
    Label bit16 = new Label("0");
    Label bit17 = new Label("0");
    Label bit18 = new Label("0");
    Label bit19 = new Label("0");
    Label bit20 = new Label("0");
    Label bit21 = new Label("0");
    Label bit22 = new Label("0");
    Label bit23 = new Label("0");
    Label bit24 = new Label("0");
    Label bit25 = new Label("0");
    Label bit26 = new Label("0");
    Label bit27 = new Label("0");
    Label bit28 = new Label("0");
    Label bit29 = new Label("0");
    Label bit30 = new Label("0");
    Label marker4 = new Label("   4");
    Label marker8 = new Label("  8   ");
    Label marker12 = new Label("  12   ");
    Label marker16 = new Label(" 16 ");
    Label marker20 = new Label("   20   ");
    Label marker24 = new Label("  24  ");
    Label marker28 = new Label("28  ");
    Label marker32 = new Label("31");

    ArrayList<Label> list = new ArrayList<>();
    boolean recursive = false;
    boolean iterative = true; 
    boolean binaryStatus = true;  

    public TextField textSpace = new TextField();
    public TextField answer = new TextField();
    // variables
/**
 * This method does not accept any parameters and has no return value.
 * This method sets the two TextFields to where they are read-only. 
 */
    
    public void disable() {
        textSpace.setDisable(true);
        answer.setDisable(true);
    }  //disable
/**
 * This method does not have a return value.
 * This method builds the GUI through calling other methods and setting the stage. 
 * @param stage
 */   
    
    @Override
    public void start(Stage stage) {  
     BorderPane border = new BorderPane(); 
        
        border.setTop(addHbox());
        border.setCenter(addVBox1());
        border.setBottom(addHBox2());
 
        Scene scene = new Scene(border,500,500);
       
        stage.setScene(scene);
        stage.setTitle("Programmer's Calculator");
        stage.sizeToScene();
        stage.show();
        
    } // createAndShowGUI

/**
* This is the main method. 
* @param args the command line arguments
*/
    public static void main(String[] args) {
        launch(args);
    } // main
/**
 * This method does not accept any parameters.
 * This method designs the textfields and assigns them to an HBox. 
 * @return border - to add to the GUI
 */ 
    
     public BorderPane addHbox() {
        BorderPane border = new BorderPane();
        textSpace.setPrefHeight(50);
        textSpace.setPrefWidth(500);
        textSpace.setStyle("-fx-background-color: #438693;");
        textSpace.setStyle("-fx-font-size: 20pt;");
        textSpace.setAlignment(Pos.CENTER_RIGHT);
        answer.setStyle("-fx-font-size: 35pt;");
        answer.setPrefWidth(500);
        answer.setAlignment(Pos.CENTER_RIGHT);
        
        HBox hbox = new HBox(); 
        HBox hbox1 = new HBox();
        hbox.getChildren().add(textSpace);
        hbox1.getChildren().add(answer);
        border.setTop(hbox);
        border.setBottom(hbox1);

        return border;
        } // add Hbox
/**
 * This method does not accept any parameters.
 * This method designs labels and adds them to a VBox. 
 * @return vbox- to add to the GUI
 */ 
    public VBox addVBox1(){

        bit3.setTextFill(Color.web("#0076a3"));
        bit4.setTextFill(Color.web("#0076a3"));
        bit5.setTextFill(Color.web("#0076a3"));
        bit6.setTextFill(Color.web("#0076a3"));
        bit11.setTextFill(Color.web("#0076a3"));
        bit12.setTextFill(Color.web("#0076a3"));
        bit13.setTextFill(Color.web("#0076a3"));
        bit14.setTextFill(Color.web("#0076a3"));
        bit11.setTextFill(Color.web("#0076a3"));
        bit19.setTextFill(Color.web("#0076a3"));
        bit20.setTextFill(Color.web("#0076a3"));
        bit21.setTextFill(Color.web("#0076a3"));
        bit22.setTextFill(Color.web("#0076a3"));
        bit27.setTextFill(Color.web("#0076a3"));
        bit28.setTextFill(Color.web("#0076a3"));
        bit29.setTextFill(Color.web("#0076a3"));
        bit30.setTextFill(Color.web("#0076a3"));

        bit.setFont(Font.font ("Verdana", 20 ));
        bit1.setFont(Font.font ("Verdana", 20));
        bit2.setFont(Font.font ("Verdana", 20));
        bit3.setFont(Font.font ("Verdana", 20));
        bit4.setFont(Font.font ("Verdana", 20));
        bit5.setFont(Font.font ("Verdana", 20));
        bit6.setFont(Font.font ("Verdana", 20));
        bit7.setFont(Font.font ("Verdana", 20));
        bit8.setFont(Font.font ("Verdana", 20));
        bit9.setFont(Font.font ("Verdana", 20));
        bit10.setFont(Font.font ("Verdana", 20));
        bit11.setFont(Font.font ("Verdana", 20));
        bit12.setFont(Font.font ("Verdana", 20));
        bit13.setFont(Font.font ("Verdana", 20));
        bit14.setFont(Font.font ("Verdana", 20));
        bit15.setFont(Font.font ("Verdana", 20));
        bit16.setFont(Font.font ("Verdana", 20));
        bit17.setFont(Font.font ("Verdana", 20));
        bit18.setFont(Font.font ("Verdana", 20));
        bit19.setFont(Font.font ("Verdana", 20));
        bit20.setFont(Font.font ("Verdana", 20));
        bit21.setFont(Font.font ("Verdana", 20));
        bit22.setFont(Font.font ("Verdana", 20));
        bit23.setFont(Font.font ("Verdana", 20));
        bit24.setFont(Font.font ("Verdana", 20));
        bit25.setFont(Font.font ("Verdana", 20));
        bit26.setFont(Font.font ("Verdana", 20));
        bit27.setFont(Font.font ("Verdana", 20));
        bit28.setFont(Font.font ("Verdana", 20));
        bit29.setFont(Font.font ("Verdana", 20));
        bit30.setFont(Font.font ("Verdana", 20));
        
        list.add(0,bit);
        list.add(1,bit1);
        list.add(2,bit2);
        list.add(3,bit3);
        list.add(4,bit4);
        list.add(5,bit5);
        list.add(6,bit6);
        list.add(7,bit7);
        list.add(8,bit8);
        list.add(9,bit9);
        list.add(10,bit10);
        list.add(11,bit11);
        list.add(12,bit12);
        list.add(13,bit13);
        list.add(14,bit14);
        list.add(15,bit15);
        list.add(16,bit16);
        list.add(17,bit17);
        list.add(18,bit18);
        list.add(19,bit19);
        list.add(20,bit20);
        list.add(21,bit21);
        list.add(22,bit22);
        list.add(23,bit23);
        list.add(24,bit24);
        list.add(25,bit25);
        list.add(26,bit26);
        list.add(27,bit27);
        list.add(28,bit28);
        list.add(29,bit29);
        list.add(30,bit30);    
        
        bit.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        }); 
        bit1.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit2.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit3.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit4.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit5.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit6.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit7.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit8.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit9.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit10.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit11.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit12.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit13.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit14.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit15.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit16.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit17.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit18.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit19.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit20.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit21.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit22.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit23.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit24.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit25.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit26.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit27.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit28.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit29.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        bit30.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
               changeDigit(t);
            }
        });
        
        HBox hbox1 = new HBox(3);
        hbox1.getChildren().addAll(list);
        HBox hbox2 = new HBox(30);
        hbox2.setPadding(new Insets(0,50,0,0));
        hbox2.getChildren().addAll(marker32,marker28,marker24, marker20,marker16,marker12,marker8,marker4);
        VBox vbox = new VBox();
        vbox.setPrefWidth(500);
        vbox.setMaxWidth(500);
        vbox.setMinWidth(500);
        vbox.setPadding(new Insets(0,0,0,0));
        vbox.setStyle("-fx-background-color: #D3D3D3");
        vbox.getChildren().addAll(hbox1,hbox2);
        
        return vbox;
    } // add VBox1
/**
 * This method does not accept any parameters.
 * This method designs number buttons and adds them to a VBox. 
 * @return vbox- to add to the GUI
 */ 
    public VBox addHBox2(){
        one.setMinWidth(50.0);
        one.setPrefWidth(50.0);
        one.setPrefHeight(50.0);
        one.setMaxWidth(50.0);
        one.setMinHeight(50.0);
        one.setMaxHeight(50.0);
        one.setFont(Font.font ("Verdana", 20));
        two.setMaxHeight(50.0);
        two.setMinHeight(50.0);
        two.setMinWidth(50.0);
        two.setPrefWidth(50.0);
        two.setMaxWidth(50.0);
        two.setPrefHeight(50.0);
        two.setFont(Font.font ("Verdana", 20));
        three.setMaxHeight(50.0);
        three.setMinHeight(50.0);
        three.setMinWidth(50.0);
        three.setPrefWidth(50.0);
        three.setMaxWidth(50.0);
        three.setPrefHeight(50.0);
        three.setFont(Font.font ("Verdana", 20));
        four.setMaxHeight(50.0);
        four.setMinHeight(50.0);
        four.setMinWidth(50.0);
        four.setPrefWidth(50.0);
        four.setMaxWidth(50.0);
        four.setPrefHeight(50.0);
        four.setFont(Font.font ("Verdana", 20));
        five.setMaxHeight(50.0);
        five.setMinHeight(50.0);
        five.setMinWidth(50.0);
        five.setPrefWidth(50.0);
        five.setMaxWidth(50.0);
        five.setPrefHeight(50.0);
        five.setFont(Font.font ("Verdana", 20));
        six.setMaxHeight(50.0);
        six.setMinHeight(50.0);
        six.setMinWidth(50.0);
        six.setPrefWidth(50.0);
        six.setMaxWidth(50.0);
        six.setPrefHeight(50.0);
        six.setFont(Font.font ("Verdana", 20));
        seven.setMaxHeight(50.0);
        seven.setMinHeight(50.0);
        seven.setMinWidth(50.0);
        seven.setPrefWidth(50.0);
        seven.setMaxWidth(50.0);
        seven.setPrefHeight(50.0);
        seven.setFont(Font.font ("Verdana", 20));
        eight.setMaxHeight(50.0);
        eight.setMinHeight(50.0);
        eight.setMinWidth(50.0);
        eight.setPrefWidth(50.0);
        eight.setMaxWidth(50.0);
        eight.setPrefHeight(50.0);
        eight.setFont(Font.font ("Verdana", 20));
        nine.setMaxHeight(50.0);
        nine.setMinHeight(50.0);
        nine.setMinWidth(50.0);
        nine.setPrefWidth(50.0);
        nine.setMaxWidth(50.0);
        nine.setPrefHeight(50.0);
        nine.setFont(Font.font ("Verdana", 20));
        zero.setMaxHeight(50.0);
        zero.setMinHeight(50.0);
        zero.setMinWidth(50.0);
        zero.setPrefWidth(50.0);
        zero.setMaxWidth(50.0);
        zero.setPrefHeight(50.0);
        zero.setFont(Font.font ("Verdana", 20));
        divide.setMaxHeight(50.0);
        divide.setMinHeight(50.0);
        divide.setMinWidth(50.0);
        divide.setPrefWidth(50.0);
        divide.setMaxWidth(50.0);
        divide.setPrefHeight(50.0);
        divide.setFont(Font.font ("Verdana", 20));
        multiply.setMaxHeight(50.0);
        multiply.setMinHeight(50.0);
        multiply.setMinWidth(50.0);
        multiply.setPrefWidth(50.0);
        multiply.setMaxWidth(50.0);
        multiply.setPrefHeight(50.0);
        multiply.setFont(Font.font ("Verdana", 20));
        minus.setMaxHeight(50.0);
        minus.setMinHeight(50.0);
        minus.setMinWidth(50.0);
        minus.setPrefWidth(50.0);
        minus.setMaxWidth(50.0);
        minus.setPrefHeight(50.0);
        minus.setFont(Font.font ("Verdana", 20));
        plus.setMaxHeight(50.0);
        plus.setMinHeight(50.0);
        plus.setMinWidth(50.0);
        plus.setPrefWidth(50.0);
        plus.setMaxWidth(50.0);
        plus.setPrefHeight(50.0);
        plus.setFont(Font.font ("Verdana", 18));
        exclaim.setMaxHeight(50.0);
        exclaim.setMinHeight(50.0);
        exclaim.setMinWidth(50.0);
        exclaim.setPrefWidth(50.0);
        exclaim.setMaxWidth(50.0);
        exclaim.setPrefHeight(50.0);
        exclaim.setFont(Font.font ("Verdana", 20));
        carrot.setMaxHeight(50.0);
        carrot.setMinHeight(50.0);
        carrot.setMinWidth(50.0);
        carrot.setPrefWidth(50.0);
        carrot.setMaxWidth(50.0);
        carrot.setPrefHeight(50.0);
        carrot.setFont(Font.font ("Verdana", 18));
        arrow.setMaxHeight(50.0);
        arrow.setMinHeight(50.0);
        arrow.setMinWidth(50.0);
        arrow.setPrefWidth(50.0);
        arrow.setMaxWidth(50.0);
        arrow.setPrefHeight(50.0);
        arrow.setFont(Font.font ("Verdana", 18));
        bigX.setMaxHeight(50.0);
        bigX.setMinHeight(50.0);
        bigX.setMinWidth(50.0);
        bigX.setPrefWidth(50.0);
        bigX.setMaxWidth(50.0);
        bigX.setPrefHeight(50.0);
        bigX.setFont(Font.font ("Verdana", 20));
        leftArrow.setMaxHeight(50.0);
        leftArrow.setMinHeight(50.0);
        leftArrow.setMinWidth(50.0);
        leftArrow.setPrefWidth(50.0);
        leftArrow.setMaxWidth(50.0);
        leftArrow.setPrefHeight(50.0);
        rightArrow.setMaxHeight(50.0);
        rightArrow.setMinHeight(50.0);
        rightArrow.setMinWidth(50.0);
        rightArrow.setPrefWidth(50.0);
        rightArrow.setMaxWidth(50.0);
        rightArrow.setPrefHeight(50.0);
        equal.setMaxHeight(50.0);
        equal.setMinHeight(50.0);
        equal.setMinWidth(110.0);
        equal.setPrefWidth(110.0);
        equal.setMaxWidth(110.0);
        equal.setPrefHeight(50.0);
        equal.setFont(Font.font ("Verdana", 20));
        r.setMaxHeight(50.0);
        r.setMinHeight(50.0);
        r.setMinWidth(170.0);
        r.setPrefWidth(170.0);
        r.setMaxWidth(170.0);
        r.setPrefHeight(50.0);
        r.setFont(Font.font ("Verdana", 15));
        b.setMaxHeight(50.0);
        b.setMinHeight(50.0);
        b.setMinWidth(170.0);
        b.setPrefWidth(170.0);
        b.setMaxWidth(170.0);
        b.setPrefHeight(50.0);
        b.setFont(Font.font ("Verdana", 15));
        
        leftArrow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                expression(t);               
            }
        });
        rightArrow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                expression(t);               
            }
        });
        
        arrow.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                backspace(t);               
            }
        });
        
        one.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
                num(t);               
            }
        });
        two.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);
            }
        });
        three.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);
            }
        });
        four.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);
            }
        });
        five.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);               
            }
        });
        six.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);
            }
        });
        seven.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);               
            }
        });
        eight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
              num(t);
               
            }
        });
        nine.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent t) {
               num(t);
            }
        });
        zero.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                num(t);
            }
        });
        divide.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        multiply.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        exclaim.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        carrot.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        plus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        minus.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                expression(t);
            }
        });
        equal.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                solve(t);
            }
        });
        r.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                changeExpression(t);
            }
        });
        bigX.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                clears(t);
            }
        });
        b.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent t){
                hideBinary(t);
            }
        });
        
        
        
        BorderPane border = new BorderPane();
        
        VBox vbox = new VBox(20);
        vbox.setPrefHeight(300);
        vbox.setPrefWidth(500);
        vbox.setStyle("-fx-background-color: #438680;");
        HBox hbox1 = new HBox(10);
        hbox1.setPadding(new Insets(10,0,0,40));
        hbox1.setMaxHeight(50.0);
        hbox1.setMinHeight(50.0);
        hbox1.setMinWidth(350.0);
        hbox1.setPrefWidth(350.0);
        hbox1.setMaxWidth(350.0);
        hbox1.setPrefHeight(50.0);

        
        HBox hbox2 = new HBox(10);
        hbox2.setPadding(new Insets(0,0,0,40));
        hbox2.setMaxHeight(50.0);
        hbox2.setMinHeight(50.0);
        hbox2.setMinWidth(350.0);
        hbox2.setPrefWidth(350.0);
        hbox2.setMaxWidth(350.0);
        hbox2.setPrefHeight(50.0);

        
        HBox hbox3 = new HBox(10);
        hbox3.setPadding(new Insets(0,0,0,40));
        hbox3.setMaxHeight(50.0);
        hbox3.setMinHeight(50.0);
        hbox3.setMinWidth(350.0);
        hbox3.setPrefWidth(350.0);
        hbox3.setMaxWidth(350.0);
        hbox3.setPrefHeight(50.0);
        

        
        HBox hbox4 = new HBox(10);
        hbox4.setPadding(new Insets(0,0,0,40));
        hbox4.setMaxHeight(50.0);
        hbox4.setMinHeight(50.0);
        hbox4.setMinWidth(350.0);
        hbox4.setPrefWidth(350.0);
        hbox4.setMaxWidth(350.0);
        hbox4.setPrefHeight(50.0);


        hbox1.getChildren().addAll(seven,eight,nine,divide,exclaim,arrow,bigX);
              
        hbox2.getChildren().addAll(four,five,six,multiply,carrot,leftArrow,rightArrow);
        
        hbox3.getChildren().addAll(one,two,three,minus,r);
  
        hbox4.getChildren().addAll(zero,equal,plus,b);
        

        vbox.getChildren().addAll(hbox1,hbox2,hbox3,hbox4);
        
        
        return vbox;
        
        
    } // add HBox2
/**
 * This method does not have any return types. 
 * This method is called when the user presses a number button on the calculator and updates the correct textField. 
 * @param event
 */ 
    
    public void num(ActionEvent event) {
        String num = ((Button) event.getSource()).getText();
        String oldNum = textSpace.getText();
        String newNum = oldNum + num;
        textSpace.setText(newNum);
    } // num
/**
 * This method does not have any return types. 
 * This method is called when the user presses an expression button on the calculator and updates the correct textField. 
 * @param event
 */     
    public void expression(ActionEvent event) {
        String num = ((Button) event.getSource()).getText();
        String oldNum = textSpace.getText();
        String newNum = oldNum + " " + num + " ";
        textSpace.setText(newNum);
    } // expression
/**
 * This method does not have any return types. 
 * This method is called when the user presses the clear button on the calculator and clears the correct textField. 
 * @param event
 */
    public void clears(ActionEvent event) {
        textSpace.setText("");
        answer.setText("");

        for (int i = 0; i <= 31; i++) {
            list.get(i).setText("0");
        }

    } // clears
/**
 * This method does not have any return values. 
 * This method is called when the user presses the equals button on the calculator and updates the correct textfield for the user.
 * It calculates the answer based how the user wants to solve the problem, recursion or iteration. Then, it updates the answer textfield.
 * It calls the updateBinary method. 
 * @param event
 */

   public void solve(ActionEvent event) {
   
        if (iterative == true) {
            String equation = textSpace.getText();
            String postFixEquation = equation.replaceAll(">>", ">");
            String reallyPostFixEquation = postFixEquation.replaceAll("<<", "<");
            String infix[] = reallyPostFixEquation.split(" ");
            String postfix[] = ReversePolishNotation.infixToPostfix(infix);
            Math iterativeMath = new IterativeMath();
            int result = ReversePolishNotation.evaluate(iterativeMath, postfix);
            answer.setText(String.valueOf(result));
            updateBinary();
        }
        if (recursive == true) {
            String equation = textSpace.getText();
            String infix[] = equation.split(" ");
            String postfix[] = ReversePolishNotation.infixToPostfix(infix);
            Math recursiveMath = new RecursiveMath();
            int result = ReversePolishNotation.evaluate(recursiveMath, postfix);
            answer.setText(String.valueOf(result));
            updateBinary();
        }
    } // solve
/**
 * This method does not have any return values. 
 * This method is called when the user presses the "Use Recursion" or "Use Iteration" button on the calculator.
 * It changes the status of the calcuator to switch which way it is going to solve. It changes the text of the button to display to the user a different option
 * It calls the clears method. 
 * @param event
 */

    public void changeExpression(ActionEvent event) {
        if (iterative == true) {
            iterative = false;
            recursive = true;
            r.setText("Use Recursion");
            clears(event);
        } else if (recursive == true) {
            recursive = false;
            iterative = true;
            r.setText("Use Iteration");
            clears(event);
        }
    } // changeExpression
/**
 * This method does not have any return values and does not accpet any parameters. 
 * This method is called the update the answer field when a user changes a binary label. 
 */
    public void updateField() {
        String binaryString = "";

        for(int i = 0; i<31; i++){
        
            binaryString = binaryString + list.get(i).getText();
        }

        int binaryStringToInt = Integer.parseInt(binaryString, 2);
        String binaryStringtoIntToString = Integer.toString(binaryStringToInt);

        answer.setText(binaryStringtoIntToString);
    } // updateField
/**
 * This method does not have any return values. 
 * This method is called when the user presses the backspace button on the calculator and updates both textfields. 
 * @param event
 */
    public void backspace(ActionEvent event) {
        String equation = textSpace.getText();

        if (equation.charAt(equation.length() - 1) == ' ') {
            equation = equation.substring(0, equation.length() - 3);
        } else {
            equation = equation.substring(0, equation.length() - 1);
        }

        textSpace.setText(equation);
        answer.setText("");
    } // backspace
/**
 * This method does not have any return values. 
 * This method is called when the user presses a binary label on the calculator and changes the label to either a "0" or "1". 
 * It calls the updateField method. 
 * @param event
 */
    public void changeDigit(MouseEvent event) {
        if ((((Label) event.getSource()).getText()).equals("0")) {
            ((Label) event.getSource()).setText("1");
            updateField();
        } else if ((((Label) event.getSource()).getText()).equals("1")) {
            ((Label) event.getSource()).setText("0");
            updateField();
        }
    } // changeDigit
 /**
 * This method does not have any return values and does not have any parameters. 
 * This method gets the answer of the probelm from the textfield and turns it into binary form. Then, it adds that binary form to the binary labels.  
 */
    public void updateBinary() {
        String calculatedNumberString = answer.getText();
        int calculatedNumber = Integer.parseInt(calculatedNumberString);
        String calculatedNumberInBinary = Integer.toBinaryString(calculatedNumber);
        String reverse = "";
        int length = calculatedNumberInBinary.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + calculatedNumberInBinary.charAt(i);
        }

        for (int i = 0; i < calculatedNumberInBinary.length(); i++) {
        System.out.println(calculatedNumberInBinary);
            list.get(30-i).setText(Character.toString(reverse.charAt(i)));

        }
    } // updateBinary
 /**
 * This method does not have any return values.
 * This method is called when the user presses the "Hide Binary" or "Show Binary" button and either shows or hides the binary labels and marker labels. 
 * It also updates the text of the button accordingly. 
 * @param event  
 */
    public void hideBinary(ActionEvent event) {

        if (binaryStatus == false) {
            for (int i = 0; i < 31; i++) {
                list.get(i).setVisible(false);
            }

            marker32.setVisible(false);
            marker28.setVisible(false);
            marker24.setVisible(false);
            marker20.setVisible(false);
            marker16.setVisible(false);
            marker12.setVisible(false);
            marker8.setVisible(false);
            marker4.setVisible(false);

            b.setText("Show Binary");

            binaryStatus = true;
        } else if (binaryStatus == true) {
            for (int i = 0; i < 31; i++) {
                list.get(i).setVisible(true);
            }

            marker32.setVisible(true);
            marker28.setVisible(true);
            marker24.setVisible(true);
            marker20.setVisible(true);
            marker16.setVisible(true);
            marker12.setVisible(true);
            marker8.setVisible(true);
            marker4.setVisible(true);

            b.setText("Hide Binary");

            binaryStatus = false;
        }

    } // hideBinary

}
