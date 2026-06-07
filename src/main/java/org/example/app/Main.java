package org.example.app;

import org.example.Model.*;



public class Main {

    public static void main(String[] args) throws Exception {

        Guia guia1 = new Guia();

        System.out.println(guia1);

        guia1.setNombre("Brian Vallejos");

        guia1.setEdad(25);

        guia1.setRut("206472057");

        guia1.setEspecialidad("Escalada");
        Direccion direcccion1 = new Direccion("Lonja Escalada", "Lo Prado", "Santiago", 1558);

        guia1.setDireccion(direcccion1);

        System.out.println(guia1);



    }

}



