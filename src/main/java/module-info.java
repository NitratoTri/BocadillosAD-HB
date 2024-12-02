module org.example.bocadillosadhb {
    requires javafx.controls;
    requires javafx.fxml;
    requires jakarta.persistence;
    requires org.hibernate.orm.core;
    requires java.naming;

    opens org.example.bocadillosadhb to javafx.fxml, org.hibernate.orm.core;
    exports org.example.bocadillosadhb;
}