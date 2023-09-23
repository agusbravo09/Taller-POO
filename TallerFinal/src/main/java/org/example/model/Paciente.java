package org.example.model;

import java.time.LocalDate;

public class Paciente extends Persona{
    private String personaContacto;

    public Paciente(String nombre, String apellido, LocalDate fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String personaContacto) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email);
        this.personaContacto = personaContacto;
    }

    public Paciente(){
        //Constructor por defecto
    }

    public String getPersonaContacto() {
        return personaContacto;
    }

    public void setPersonaContacto(String personaContacto) {
        this.personaContacto = personaContacto;
    }

    /*@Override
    public String toString() {
        return "Paciente{" +
                "personaContacto='" + personaContacto + '\'' +
                '}';
    }
    Es realmente necesario el metodo toString?
     */
}
