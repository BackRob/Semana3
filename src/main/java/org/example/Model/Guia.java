package org.example.Model;


import org.example.Exception.GuiaInvalidoException;
import org.example.Exception.PersonaInvalidoException;

public class Guia extends Persona {

    private String especialidad;


    public Guia() {
        super();
        this.especialidad = "SIN_ESPECIALIDAD";

    }



    public Guia(String nombre, Rut rut, int edad, String especialidad,Direccion direccion)throws PersonaInvalidoException,GuiaInvalidoException {
        super(nombre, rut, edad,direccion);
        setEspecialidad(especialidad);
    }

    public String getEspecialidad() {return especialidad;}



    public void setEspecialidad(String especialidad)throws GuiaInvalidoException {

        if (especialidad == null ||especialidad.trim().isEmpty()){
            throw new GuiaInvalidoException("Especialidad Invalida, Por Favor Ingresar Espacialidad Valida");
        }
        this.especialidad = especialidad;
    }



    @Override
    public String toString(){
        return "\n----Guia----\n"+super.toString() + "Especialidad: "+especialidad+"\n------------\n";
    }











}