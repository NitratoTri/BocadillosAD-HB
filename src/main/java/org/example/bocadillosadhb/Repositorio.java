package org.example.bocadillosadhb;

import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.Date;
import java.time.LocalDate;

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
    public Pedido insertPedidoConstruido(Cliente cli, Producto p){
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
    public Pedido insertPedido(Pedido pedido){
        Transaction tx = null;
        Session session = HibernateUtil.creaSesion();
        tx = session.beginTransaction();
        session.persist(pedido);
        tx.commit();
        session.close();
        return pedido;
    }
    //Metodo para una Observable list de todos los clientes que tenemos
    public ObservableList<Cliente> getClientes(){
        Session session = HibernateUtil.creaSesion();
        ObservableList<Cliente> clientes = (ObservableList<Cliente>) session.createQuery("from Cliente").list();
        session.close();
        return clientes;
    }
}
