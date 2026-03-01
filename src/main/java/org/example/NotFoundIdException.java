package org.example;

public class NotFoundIdException extends RuntimeException{

    public NotFoundIdException (String msg) {
        super(msg);
    }
}