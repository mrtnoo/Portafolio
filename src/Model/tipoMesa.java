/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class tipoMesa {
    
    int ID_TIPO;
    String UBICACION;

    public tipoMesa() {
    }

    public tipoMesa(int ID_TIPO, String UBICACION) {
        this.ID_TIPO = ID_TIPO;
        this.UBICACION = UBICACION;
    }

    public int getID_TIPO() {
        return ID_TIPO;
    }

    public void setID_TIPO(int ID_TIPO) {
        this.ID_TIPO = ID_TIPO;
    }

    public String getUBICACION() {
        return UBICACION;
    }

    public void setUBICACION(String UBICACION) {
        this.UBICACION = UBICACION;
    }
    
    
    
    
}
