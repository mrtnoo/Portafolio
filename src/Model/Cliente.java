/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Alumno
 */
public class Cliente {
    
    String ID_PERSONA_CLIENTE;
    String PERSONA_ID_PERSONA;

    public Cliente() {
    }

    public Cliente(String ID_PERSONA_CLIENTE, String PERSONA_ID_PERSONA) {
        this.ID_PERSONA_CLIENTE = ID_PERSONA_CLIENTE;
        this.PERSONA_ID_PERSONA = PERSONA_ID_PERSONA;
    }

    public String getID_PERSONA_CLIENTE() {
        return ID_PERSONA_CLIENTE;
    }

    public void setID_PERSONA_CLIENTE(String ID_PERSONA_CLIENTE) {
        this.ID_PERSONA_CLIENTE = ID_PERSONA_CLIENTE;
    }

    public String getPERSONA_ID_PERSONA() {
        return PERSONA_ID_PERSONA;
    }

    public void setPERSONA_ID_PERSONA(String PERSONA_ID_PERSONA) {
        this.PERSONA_ID_PERSONA = PERSONA_ID_PERSONA;
    }
    
    
}
