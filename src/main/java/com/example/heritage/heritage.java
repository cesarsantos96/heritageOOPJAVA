package com.example.heritage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class heritage extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(heritage.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Cesar", "123.456.789-10", 27);
        p1.escreverDados();
        Pessoa p2 = new Pessoa("Mariazinha", "098.765.432-21", 59);
        p2.escreverDados();

        Aluno a1 = new Aluno("Marcos", "456.789.123-00", 26, "787543");
        a1.estudar();
        a1.escreverDados();



    }
}