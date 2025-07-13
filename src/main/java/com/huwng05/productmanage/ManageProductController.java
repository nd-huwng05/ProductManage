package com.huwng05.productmanage;

import com.huwng05.handler.Handler;
import com.huwng05.pojo.Category;
import com.huwng05.pojo.Product;
import com.huwng05.utils.MyStage;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ManageProductController implements Initializable {
    @FXML private TableView<Product> productTable;
    @FXML private ComboBox<Category> cbCates;
    private final Handler h = new Handler();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        this.loadColumns();
        try {
            this.cbCates.setItems(FXCollections.observableList(h.loadListCategory()));
            this.productTable.setItems(FXCollections.observableList(h.loadListProducts()));
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void goBack(ActionEvent event) throws Exception {
        MyStage.getInstance().goBack();
    }

    public void loadColumns() {
        TableColumn colId = new TableColumn("Id");
        colId.setCellValueFactory(new PropertyValueFactory("id"));
        colId.setMinWidth(100);

        TableColumn colName = new TableColumn("Name");
        colName.setCellValueFactory(new PropertyValueFactory("name"));
        colName.setMinWidth(200);

        TableColumn colPrice = new TableColumn("Price");
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colPrice.setMinWidth(100);

        this.productTable.getColumns().addAll(colId, colName, colPrice);
    }

}
