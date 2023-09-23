package org.example.model;

import java.time.LocalDate;

public class Enfermera extends Funcionario{
    public Enfermera(String nombre, String apellido, LocalDate fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
    }

    public Enfermera() {
    //Constructor por defecto
    }

    public void cambiarTriage(){
    // metodo para cambiar triage
    }

    public void asignarBoxPaciente(){
    // metodo para asignar box a paciente
    }

}
