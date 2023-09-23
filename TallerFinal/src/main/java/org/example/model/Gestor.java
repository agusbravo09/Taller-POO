package org.example.model;

import java.time.LocalDate;

public class Gestor extends Administrativo{
    public Gestor(String nombre, String apellido, LocalDate fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
    }

    public Gestor() {
        // constructor por defecto
    }

    public int getPacientesMedico(LocalDate fecha1, LocalDate fecha2){
        //metodo que devuelve la cantidad de pacientes atendidos por un medico entre 2 fechas
        return 0;
    }

    public int getPacientesAtendidos(LocalDate fecha1, LocalDate fecha2, int edad1, int edad2){
        //metodo que devuelve la cantidad de pacientes atendidos entre 2 fechas y 2 edades
        return 0;
    }

    public String getPacientesRecurrentes(LocalDate fecha1, LocalDate fecha2){
        //metodo que devuelve a los pacientes mas recurrentes entre 2 fechas
        return "retornaria un string o una lista de objetos?";
    }

    public String getMedicoMasPacientes(LocalDate fecha1, LocalDate fecha2){
        //metodo que devuelve los datos del medico que atendio a mas pacientes entre 2 fechas
        return "retornaria un string o la instancia de medico?";
    }

    public String getTriagesRealizados(LocalDate fecha1, LocalDate fecha2){
        //metodo que devuelve la cantidad de traiges realizados y la cantidad de cada color entre 2 fechas
        return "retornaria un string concatenado con toda la informacion";
    }

    public String getTriagesCambiados(){
        //metodo que devuelve la cantidad de triages cambiados por quien efectuo el traigado, indicando color propuesto
        // y color asignado por el funcionario
        return "retornaria un string concatenado con la informacion?";
    }
}
