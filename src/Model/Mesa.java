/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class Mesa {
    
    int id_mesa;
    String max_clientes;
    String estado;
    int tipo_mesa;

    public Mesa() {
    }

    public Mesa(int id_mesa, String max_clientes, String estado, int tipo_mesa) {
        this.id_mesa = id_mesa;
        this.max_clientes = max_clientes;
        this.estado = estado;
        this.tipo_mesa = tipo_mesa;
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
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

    public int getTipo_mesa() {
        return tipo_mesa;
    }

    public void setTipo_mesa(int tipo_mesa) {
        this.tipo_mesa = tipo_mesa;
    }

    public void setId_mesa(ResultSet a) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
