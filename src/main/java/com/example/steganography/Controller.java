package com.example.steganography;

import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    private Model model;

    public Controller(Model model){
        this.model=model;
    }

    public ImageView originalView,modifiedView;
    public TextField fieldMessage;

    public void injectViews(ImageView original,ImageView modified,TextField fieldMessage){
        this.originalView =original;
        this.modifiedView=modified;
        this.fieldMessage=fieldMessage;
    }
    public void onEncode(){
        Image modified=model.encode(originalView.getImage(),fieldMessage.getText());
        modifiedView.setImage(modified);

    }

    public void onDecode(){
        String message=model.decode(modifiedView.getImage());
        System.out.println(message);

    }
}
