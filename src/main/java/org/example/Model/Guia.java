package org.example.Model;



public class Guia extends Persona {

    private String especialidad;





    public Guia() {

        super();

        this.especialidad = "sinEspecialidad";

    }



    public Guia(String nombre, String rut, int edad, String especialidad) {

        super(nombre, rut, edad);

        this.especialidad = especialidad;

    }



    public String getEspecialidad() {return especialidad;}



    public void setEspecialidad(String especialidad) {

        if (especialidad != null && !especialidad.trim().isEmpty()){

            this.especialidad = especialidad;

        }

    }



    @Override

    public String toString(){

        return super.toString() + "Especialidad: "+especialidad+"\n";

    }











}