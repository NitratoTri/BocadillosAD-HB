package org.example.bocadillosadhb;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.sql.Date;

public class HelloController {

    @FXML
    private Button bttnInsert;

    @FXML
    private TableColumn<Pedido, Integer> colCantidad;

    @FXML
    private TableColumn<Pedido, Long> colClienteId;

    @FXML
    private TableColumn<Pedido, Boolean> colEstado;

    @FXML
    private TableColumn<Pedido, Date> colFecha;

    @FXML
    private TableColumn<Pedido, Long> colId;

    @FXML
    private TableColumn<Pedido, Long> colProductoId;

    @FXML
    private ComboBox<Cliente> comboClientes;

    @FXML
    private ComboBox<Producto> comboProductos;

    @FXML
    private TableView<Pedido> tablePedidos;

    @FXML
    private TextField txtCantidad;

    @FXML
    private Label welcomeText;

}
