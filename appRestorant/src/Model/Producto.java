/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Producto {
    
    String id;
    String nombre;
    String activo;
    String pesaje;
    String tipoAnimal;
    String receta;
    String stock;
    String tipoProducto;

    public Producto() {
    }

    public Producto(String id, String nombre, String activo, String pesaje, String tipoAnimal, String receta, String stock, String tipoProducto) {
        this.id = id;
        this.nombre = nombre;
        this.activo = activo;
        this.pesaje = pesaje;
        this.tipoAnimal = tipoAnimal;
        this.receta = receta;
        this.stock = stock;
        this.tipoProducto = tipoProducto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }

    public String getPesaje() {
        return pesaje;
    }

    public void setPesaje(String pesaje) {
        this.pesaje = pesaje;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }


    
}
