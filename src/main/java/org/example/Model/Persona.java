package org.example.Model;


import org.example.Exception.PersonaInvalidoException;

public class Persona {

    private String nombre;
    private Rut rut;
    private int edad;

    private Direccion direccion;

    //constructores

    public Persona(){

        this("SIN_NOMBRE",new Rut(),0,new Direccion());

    }



    public Persona(String nombre, Rut rut, int edad, Direccion direccion) throws PersonaInvalidoException{
        setNombre(nombre);
        setRut(rut);
        setEdad(edad);
        setDireccion(direccion);

    }



    public String getNombre() {return nombre;}

    public void setNombre(String nombre) throws PersonaInvalidoException {
        if (nombre == null || nombre.trim().isEmpty() ){
            throw new PersonaInvalidoException("Nombre invalido, debe escribir algo");
        }
        this.nombre = nombre;
    }

    public Rut getRut() {return rut;}



    public void setRut(Rut rut)throws PersonaInvalidoException {
        if(rut == null){
            throw new PersonaInvalidoException("Rut no puede ser null");
        }
        this.rut = rut;
    }

    public int getEdad() {return edad;}

    public void setEdad(int edad)throws PersonaInvalidoException {
        if(edad<0) {
            throw new PersonaInvalidoException("Debe Ingresar una Edad Valida");
        }

        this.edad = edad;
    }



    public Direccion getDireccion() {return direccion;}

    public void setDireccion(Direccion direccion)throws PersonaInvalidoException {
        if(direccion==null){
            throw new PersonaInvalidoException("Dirección no puede ser null");
        }
        this.direccion = direccion;
    }





    @Override

    public String toString(){

        return "Nombre: "+ nombre +
                rut+
                "Edad: "+edad+
                direccion;



    }











}

