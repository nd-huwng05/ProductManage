package com.huwng05.utils;

import com.huwng05.productmanage.App;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Stack;

public class MyStage {
   private static MyStage instance;
   private final Stage stage;
   private static Scene scene;
   private final Stack<Parent> history = new Stack<>();

   private MyStage(Stage stage) {
       this.stage = stage;
       this.stage.setTitle("ProductManage");
   }

   public static void init(Stage stage) {
       if (instance == null) instance = new MyStage(stage);
   }

   public static MyStage getInstance() {
       if (instance == null) throw new IllegalStateException("STAGE IS NULL");
       return instance;
   }

   public void show(String fxml) throws IOException {
       Parent root = new FXMLLoader(App.class.getResource(fxml)).load();
       if (scene != null) {
           history.push(scene.getRoot());
           scene.setRoot(root);
       }
       else scene = new Scene(root);
       this.stage.setScene(scene);
       this.stage.show();
   }

   public void goBack() {
       if (!history.isEmpty()) return;
       scene.setRoot(history.pop());
       this.stage.setScene(scene);
       this.stage.show();
   }
}
