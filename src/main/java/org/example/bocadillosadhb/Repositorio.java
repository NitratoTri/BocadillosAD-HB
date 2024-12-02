package org.example.bocadillosadhb;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

public class Repositorio {
    // Aquí podríamos implementar un repositorio de objetos, como una lista o una base de datos

    public Cliente insertClient(Cliente cliente) {
        Transaction tx = null;
        Session session = HibernateUtil.creaSesion();
        tx = session.beginTransaction();
        session.persist(cliente);
        tx.commit();
        session.close();
        return cliente;
    }

    public Producto insertProduct(Producto producto) {
        Transaction tx = null;
        Session session = HibernateUtil.creaSesion();
        tx = session.beginTransaction();
        session.persist(producto);
        tx.commit();
        session.close();
        return producto;
    }

    public Pedido insertPedidoConstruido(Cliente cli, Producto p) {
        Pedido pedido = new Pedido();
        pedido.setCliente(cli);
        pedido.setProducto(p);
        pedido.setFecha(Date.valueOf(LocalDate.now()));
        pedido.setCantidad(1);
        pedido.setEstado(false);
        Transaction tx = null;
        Session session = HibernateUtil.creaSesion();
        tx = session.beginTransaction();
        session.persist(pedido);
        tx.commit();
        session.close();
        return pedido;
    }

    public Pedido insertPedido(Pedido pedido) {
        Transaction tx = null;
        Session session = HibernateUtil.creaSesion();
        tx = session.beginTransaction();
        session.persist(pedido);
        tx.commit();
        session.close();
        return pedido;
    }

    //Metodo para una Observable list de todos los clientes que tenemos
    public ObservableList<Cliente> getClientes() {
        ObservableList<Cliente> clientes = FXCollections.observableArrayList();
        Session session = null;

        try {
            session = HibernateUtil.creaSesion();
            List<Cliente> clientesList = session.createQuery("from Cliente", Cliente.class).getResultList();
            clientes.setAll(clientesList); // Convierte la lista a ObservableList
        } catch (Exception e) {
            e.printStackTrace(); // Manejo básico de errores
        } finally {
            if (session != null) {
                session.close(); // Asegura que la sesión se cierre
            }
        }

        return clientes;
    }

    //Metodo para una Observable list de todos los productos que tenemos
    public ObservableList<Producto> getProductos() {
        ObservableList<Producto> productos = FXCollections.observableArrayList();
        Session session = null;

        try {
            session = HibernateUtil.creaSesion();
            List<Producto> productosList = session.createQuery("from Producto", Producto.class).getResultList();
            productos.setAll(productosList); // Convierte la lista a ObservableList
        } catch (Exception e) {
            e.printStackTrace(); // Manejo básico de errores
        } finally {
            if (session != null) {
                session.close(); // Asegura que la sesión se cierre
            }
        }

        return productos;
    }

    //Metodo para una Observable list de todos los pedidos que tenemos
    public ObservableList<Pedido> getPedidos() {
        ObservableList<Pedido> pedidos = FXCollections.observableArrayList();
        Session session = null;

        try {
            session = HibernateUtil.creaSesion();
            List<Pedido> pedidosList = session.createQuery("from Pedido", Pedido.class).getResultList();
            pedidos.setAll(pedidosList); // Convierte la lista a ObservableList
        } catch (Exception e) {
            e.printStackTrace(); // Manejo básico de errores
        } finally {
            if (session!= null) {
                session.close(); // Asegura que la sesión se cierre
            }
        }

        return pedidos;
    }
}




