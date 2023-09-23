package org.example.model;

import java.time.LocalDate;

public class Medico extends Funcionario{
    private int matricula;

    public Medico(String nombre, String apellido, LocalDate fechaNac, String domicilio, int documento, String telFijo, String celular, tipoEstCivil estadoCivil, String email, String usuario, String contrasena, tipoRol rol, int matricula) {
        super(nombre, apellido, fechaNac, domicilio, documento, telFijo, celular, estadoCivil, email, usuario, contrasena, rol);
        this.matricula = matricula;
    }

    public Medico(){
    // constructor por defecto
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void cambiarTriage(){
    // metodo para cambiar el triage
    }

    public void realizarTriage(){
    // Es necesario este metodo?
    }

    public void asignarBoxPaciente(){
    // Es necesario este metodo?
    }

    public void getHistoriaClinica(){
    // metodo para consultar historia clinica de paciente
    }

   /* @Override
    public String toString() {
        return "Medico{" +
                "matricula=" + matricula +
                '}';
    }
    Es realmente necesario el metodo toString?
    */
}
