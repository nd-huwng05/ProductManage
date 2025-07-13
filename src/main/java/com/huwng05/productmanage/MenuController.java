package com.huwng05.productmanage;

import com.huwng05.pojo.Product;
import com.huwng05.utils.MyStage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;

import java.io.IOException;

public class MenuController {
    public void handleMangeProduct(ActionEvent event) throws IOException {
        MyStage.getInstance().show("ManageProduct.fxml");
    }
}
