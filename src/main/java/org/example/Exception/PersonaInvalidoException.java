package org.example.Exception;

public class PersonaInvalidoException extends RuntimeException {
    public PersonaInvalidoException(String message) {
        super(message);
    }
}
