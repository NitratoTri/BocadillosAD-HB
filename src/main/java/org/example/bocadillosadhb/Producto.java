package org.example.bocadillosadhb;

import jakarta.persistence.*;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Column(nullable = false, unique = true)
    private String tipo;
    private String tamano;
    private Double precio;

    public Producto(Long id, String tamano, String tipo, Double precio, String nombre) {
        this.id = id;
        this.tamano = tamano;
        this.tipo = tipo;//pequeño medio y grande
        this.precio = precio;
        this.nombre = nombre;
    }

    public Producto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getTamaño() {
        return tamano;
    }

    public void setTamaño(String tamaño) {
        this.tamano = tamaño;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", tamaño=" + tamano +
                ", precio=" + precio +
                '}';
    }
}
