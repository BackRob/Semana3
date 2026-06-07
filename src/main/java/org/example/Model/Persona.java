package org.example.Model;



public class Persona {

    private String nombre;

    private String rut;

    private int edad;

    private Direccion direccion;



    //constructores

    public Persona(){

        this("sinNombre","sinRut",0);

    }



    public Persona(String nombre, String rut, int edad) {

        this.nombre = nombre;

        this.rut = rut;

        this.edad = edad;

        this.direccion = new Direccion();

    }



    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {

        if (nombre != null && !nombre.trim().isEmpty() ){

            this.nombre = nombre;

        }else{

            System.out.println("Escriba un nombre valido");

        }

    }

    public String getRut() {return rut;}



    public void setRut(String rut) {

        if (rut != null && !rut.trim().isEmpty()){

            this.rut = rut.trim();

        }

    }

    public int getEdad() {return edad;}

    public void setEdad(int edad) {this.edad = edad;}



    public Direccion getDireccion() {return direccion;}

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }





    @Override

    public String toString(){

        return "Nombre: "+ nombre +

                "\nRut: "+ rut+

                "\nEdad: "+edad+"\n"+direccion+ "\n";



    }











}

