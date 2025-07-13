package com.huwng05.productmanage;

import com.huwng05.db.connector.MySqlConnector;
import com.huwng05.utils.MyStage;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        MyStage.init(stage);
        MyStage.getInstance().show("menu.fxml");
    }

    @Override
    public void stop() throws Exception {
        MySqlConnector.getInstance().close();
    }

    public static void main(String[] args) {
        launch();
    }
}