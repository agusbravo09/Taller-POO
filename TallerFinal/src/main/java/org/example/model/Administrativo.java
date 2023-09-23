package org.example.model;

import java.time.LocalDate;

public class Administrativo extends Funcionario{
    public Administrativo(String nombre, String apellido, LocalDate fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
    }

    public Administrativo() {
        //Constructor por defecto
    }

}
