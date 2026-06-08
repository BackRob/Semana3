package org.example.Model;

import org.example.Exception.RutInvalidoException;

public class Rut {
    private String rut;

    public Rut(){  //constructor vacio
        this.rut = "SIN_RUT";
    }

    public Rut(String rut) throws RutInvalidoException{ //control de errores personalizado
        if (rut==null || !rut.matches("[0-9]+-[0-9kK]")){
            throw new RutInvalidoException("Rut inválido, formato esperado: 12345678-9");

        }
        this.rut = rut;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "\nRut= " + rut + "\n";
    }
}
