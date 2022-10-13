/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Empleado {
    
    String ID_PERSONA_EMPLEADO ;
    String CONTRASEÑA;
    String TURNO_EMPLEADO_ID_TURNO; 
    String TIPO_EMPLEADO_ID_TIPO_EMPLEADO;
    String PERSONA_ID_PERSONA;

    public Empleado() {
    }

    public Empleado(String ID_PERSONA_EMPLEADO, String CONTRASEÑA, String TURNO_EMPLEADO_ID_TURNO, String TIPO_EMPLEADO_ID_TIPO_EMPLEADO, String PERSONA_ID_PERSONA) {
        this.ID_PERSONA_EMPLEADO = ID_PERSONA_EMPLEADO;
        this.CONTRASEÑA = CONTRASEÑA;
        this.TURNO_EMPLEADO_ID_TURNO = TURNO_EMPLEADO_ID_TURNO;
        this.TIPO_EMPLEADO_ID_TIPO_EMPLEADO = TIPO_EMPLEADO_ID_TIPO_EMPLEADO;
        this.PERSONA_ID_PERSONA = PERSONA_ID_PERSONA;
    }

    public String getID_PERSONA_EMPLEADO() {
        return ID_PERSONA_EMPLEADO;
    }

    public void setID_PERSONA_EMPLEADO(String ID_PERSONA_EMPLEADO) {
        this.ID_PERSONA_EMPLEADO = ID_PERSONA_EMPLEADO;
    }

    public String getCONTRASEÑA() {
        return CONTRASEÑA;
    }

    public void setCONTRASEÑA(String CONTRASEÑA) {
        this.CONTRASEÑA = CONTRASEÑA;
    }

    public String getTURNO_EMPLEADO_ID_TURNO() {
        return TURNO_EMPLEADO_ID_TURNO;
    }

    public void setTURNO_EMPLEADO_ID_TURNO(String TURNO_EMPLEADO_ID_TURNO) {
        this.TURNO_EMPLEADO_ID_TURNO = TURNO_EMPLEADO_ID_TURNO;
    }

    public String getTIPO_EMPLEADO_ID_TIPO_EMPLEADO() {
        return TIPO_EMPLEADO_ID_TIPO_EMPLEADO;
    }

    public void setTIPO_EMPLEADO_ID_TIPO_EMPLEADO(String TIPO_EMPLEADO_ID_TIPO_EMPLEADO) {
        this.TIPO_EMPLEADO_ID_TIPO_EMPLEADO = TIPO_EMPLEADO_ID_TIPO_EMPLEADO;
    }

    public String getPERSONA_ID_PERSONA() {
        return PERSONA_ID_PERSONA;
    }

    public void setPERSONA_ID_PERSONA(String PERSONA_ID_PERSONA) {
        this.PERSONA_ID_PERSONA = PERSONA_ID_PERSONA;
    }
    
    
    
}
