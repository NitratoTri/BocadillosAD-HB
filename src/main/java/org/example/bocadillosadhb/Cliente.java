package org.example.bocadillosadhb;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nombre;
     private String email;
     private int telefono;

     public int getTelefono() {
          return telefono;
     }

     public void setTelefono(int telefono) {
          this.telefono = telefono;
     }

     public Cliente(String email, Long id, String nombre, int telefono) {
          this.email = email;
          this.id = id;
          this.nombre = nombre;
          this.telefono= telefono;
     }

     public Cliente() {
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getNombre() {
          return nombre;
     }

     public void setNombre(String nombre) {
          this.nombre = nombre;
     }

     public Long getId() {
          return id;
     }

     public void setId(Long id) {
          this.id = id;
     }

     @Override
     public String toString() {
          return "Cliente{" +
                  "email='" + email + '\'' +
                  ", id=" + id +
                  ", nombre='" + nombre + '\'' +
                  ", telefono='" + telefono + '\'' +
                  '}';
     }
}
