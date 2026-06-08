package org.example.app;

import org.example.Model.*;



public class Main {

    public static void main(String[] args) throws Exception {

        Guia guia1 = new Guia();//creacion de guia vacio

        System.out.println(guia1);//se muestra

        guia1.setNombre("Brian Vallejos");//le asignamos nombre
        guia1.setEdad(25);//le asignamos edad

        Rut rut1 = new Rut("20647205-7");//creamos el rut
        guia1.setRut(rut1); //asignamos el rut

        try { //prueba del manejo de errores para la captura de errores personalizados
            guia1.setEspecialidad("");//asignamos vacío
        }catch (Exception e){
            System.out.println("Error: "+e.getMessage()+"\n");
        }

        Direccion direccion1 = new Direccion(  //Creacion de direccion
                "Lonja Escalada",
                "Lo Prado",
                "Santiago",
                1558);
        guia1.setDireccion(direccion1);//Asignación de Direccion

        System.out.println(guia1);//mostrar guia1 con datos seteados


    }

}



