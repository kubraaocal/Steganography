package com.example.steganography;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class View extends Pane {
    public Controller controller;
    public  View(Controller controller){
        this.controller=controller;

        setPrefSize(256*2,500);
        Image image=new Image("https://img.wattpad.com/cover/156444298-256-k529980.jpg");
        ImageView originalView=new ImageView(image);

        ImageView modifiedView=new ImageView();
        modifiedView.setTranslateX(256);

        TextField field=new TextField("Enter message");
        field.setTranslateY(400);
        field.setOnAction(e -> controller.onEncode());

        Button btnDecode=new Button("DECODE");
        btnDecode.setTranslateX(256);
        btnDecode.setTranslateY(400);
        btnDecode.setOnAction(e -> controller.onDecode());

        controller.injectViews(originalView,modifiedView,field);

        getChildren().addAll(originalView,modifiedView,field,btnDecode);

    }
}
