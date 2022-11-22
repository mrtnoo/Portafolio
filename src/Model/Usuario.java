/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Usuario {
    String id_empleado;
    String direccion;
    String nacimiento;
    String contraseña;
    String turno;
    String tipo_emp;
    String id_persona;

    public Usuario() {
    }

    public Usuario(String id_empleado, String direccion, String nacimiento, String contraseña, String turno, String tipo_emp, String id_persona) {
        this.id_empleado = id_empleado;
        this.direccion = direccion;
        this.nacimiento = nacimiento;
        this.contraseña = contraseña;
        this.turno = turno;
        this.tipo_emp = tipo_emp;
        this.id_persona = id_persona;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTipo_emp() {
        return tipo_emp;
    }

    public void setTipo_emp(String tipo_emp) {
        this.tipo_emp = tipo_emp;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
    
    
    
    
    
    
    
}
