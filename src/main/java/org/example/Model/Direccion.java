package org.example.Model;

public class Direccion {
    private String calle;
    private String comuna;
    private String ciudad;
    private int numeracion;







    public Direccion(){
        this("sinCalle","sinComuna","sinCiudad",0);
    }



    public Direccion(String calle, String comuna, String ciudad, int numeracion) {
        this.calle = calle;
        this.comuna = comuna;
        this.ciudad = ciudad;
        this.numeracion = numeracion;
    }



    public String getCalle() {return calle;}
    public void setCalle(String calle) {
        if(calle!=null && !calle.trim().isEmpty()){
            this.calle = calle;
        }else{
            System.out.println("Ingrese una calle valida");
        }
    }



    public String getComuna() {return comuna;}
    public void setComuna(String comuna) {
        if(comuna!=null && !comuna.trim().isEmpty()){
            this.comuna = comuna;
        }
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        if(ciudad !=null && !ciudad.trim().isEmpty()){
            this.ciudad = ciudad;
        }
    }

    public int getNumeracion() {return numeracion;}
    public void setNumeracion(int numeracion) {this.numeracion = numeracion;}
    @Override

    public String toString(){

        return "Direccion: "+calle+" #"+numeracion+", "+comuna+", "+ciudad;

    }





}