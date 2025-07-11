module com.huwng05.productmanage {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jdk.jdi;


    opens com.huwng05.productmanage to javafx.fxml;
    exports com.huwng05.productmanage;
}