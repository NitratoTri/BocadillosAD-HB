package org.example.bocadillosadhb;

import javafx.collections.ObservableList;
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

    private Repositorio repo= new Repositorio();
    private ObservableList<Pedido> pedidos= repo.getPedidos();
    @FXML
    public void initialize() {
        // TODO Auto-generated method stub
        //Hacemos que la lista de los pedidos que tenemos se muestre en nuestro Table View
        tablePedidos.setItems(pedidos);
        //Añadimos los datos de las columnas al Table View
        colId.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getId()));
        colClienteId.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getId()));
        colProductoId.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getId()));
        colCantidad.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getCantidad()));
        colFecha.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getFecha()));
        colEstado.setCellValueFactory(cellData -> new javafx.beans.property.SimpleObjectProperty<>(cellData.getValue().getEstado()));

        //Cargamos los datos de los comboBox con los datos que tenemos en la base de datos
        comboClientes.setItems(repo.getClientes());
        comboProductos.setItems(repo.getProductos());
    }
}
