package com.yoli.workflow.exception;

public class PaserException extends RuntimeException {

    public PaserException(String message){
        super(message);
    }

    public PaserException(String message,Throwable cause){
        super(message,cause);
    }

}
