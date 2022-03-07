package com.example.steganography;

import javafx.scene.image.Image;

public interface Encoder {
    Image encode(Image image,String  message);
}
