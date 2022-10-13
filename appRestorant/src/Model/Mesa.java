/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Mesa {
    
    String id_mesa;
    String max_clientes;
    String estado;
    String tipo_mesa;

    public Mesa() {
    }

    public Mesa(String id_mesa, String max_clientes, String estado, String tipo_mesa) {
        this.id_mesa = id_mesa;
        this.max_clientes = max_clientes;
        this.estado = estado;
        this.tipo_mesa = tipo_mesa;
    }

    public String getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(String id_mesa) {
        this.id_mesa = id_mesa;
    }

    public String getMax_clientes() {
        return max_clientes;
    }

    public void setMax_clientes(String max_clientes) {
        this.max_clientes = max_clientes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTipo_mesa() {
        return tipo_mesa;
    }

    public void setTipo_mesa(String tipo_mesa) {
        this.tipo_mesa = tipo_mesa;
    }

    
}
