package org.example.Model;

import org.example.Exception.DireccionInvalidoException;

public class Direccion {
    private String calle;
    private String comuna;
    private String ciudad;
    private int numeracion;


    public Direccion(){
        this.calle = "SIN_CALLE";
        this.comuna="SIN_COMUNA";
        this.ciudad= "SIN_CIUDAD";
        this.numeracion= 0;
    }



    public Direccion(String calle, String comuna, String ciudad, int numeracion)throws DireccionInvalidoException {
        setCalle(calle);
        setComuna(comuna);
        setCiudad(ciudad);
        setNumeracion(numeracion);
    }



    public String getCalle() {return calle;}
    public void setCalle(String calle) throws DireccionInvalidoException {
        if(calle==null || calle.trim().isEmpty()){
            throw new DireccionInvalidoException("Dirección Invalida, Ingrese Dirección Valida");
        }
        this.calle = calle;
    }



    public String getComuna() {return comuna;}
    public void setComuna(String comuna) throws DireccionInvalidoException{
        if(comuna==null || comuna.trim().isEmpty()){
            throw new DireccionInvalidoException("Comuna Invalida, Ingrese Comuna Valida");
        }

        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) throws DireccionInvalidoException {
        if(ciudad ==null || ciudad.trim().isEmpty()){
            throw new DireccionInvalidoException("Ciudad Invalida, Ingrese ciudad Valida");
        }

        this.ciudad = ciudad;
    }

    public int getNumeracion() {return numeracion;}
    public void setNumeracion(int numeracion) throws DireccionInvalidoException{
        if(numeracion<0){
            throw new DireccionInvalidoException("Numero Invalido, Ingrese un numero mayor o igual a 0");
        }
        this.numeracion = numeracion;
    }


    @Override
    public String toString(){

        return "\nDireccion: "+calle+" #"+numeracion+", "+comuna+", "+ciudad+"\n";

    }





}