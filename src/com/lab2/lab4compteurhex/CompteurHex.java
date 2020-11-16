package com.lab2.lab4compteurhex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CompteurHex extends Application {
    //Лабораторная работа №4 – Классы и экземпляры классов в Java
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
   
    public static void main(String[] args) {
        launch(args);
    }
      /*  1.Описать класс, реализующий десятичный счетчик, который может увеличивать 
        или уменьшать свое значение на единицу в заданном диапазоне. 
        Предусмотреть инициализацию счетчика значениями по умолчанию и произвольными значениями. 
        Счетчик имеет два метода: увеличения и уменьшения, — и метод, позволяющее получить его текущее состояние */   
}
