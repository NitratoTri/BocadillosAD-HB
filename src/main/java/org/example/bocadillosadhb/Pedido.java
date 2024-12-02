package org.example.bocadillosadhb;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Producto producto;
    @ManyToOne
    private Cliente cliente;
    private int cantidad;
    private Date fecha;
    private Boolean estado;

    public Pedido(int cantidad, Boolean estado, Cliente cliente, Long id, Date fecha, Producto producto) {
        this.cantidad = cantidad;
        this.estado = estado;
        this.cliente = cliente;
        this.id = id;
        this.fecha = fecha;
        this.producto = producto;
    }

    public Pedido() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cantidad=" + cantidad +
                ", id=" + id +
                ", producto=" + producto +
                ", cliente=" + cliente +
                ", fecha=" + fecha +
                ", estado=" + estado +
                '}';
    }
}
