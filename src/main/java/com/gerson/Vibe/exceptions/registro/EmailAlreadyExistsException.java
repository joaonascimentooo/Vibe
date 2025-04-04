package com.gerson.Vibe.exceptions.registro;

public class EmailAlreadyExistsException extends RuntimeException{

    public  EmailAlreadyExistsException(String message){
        super(message);
    }
}
