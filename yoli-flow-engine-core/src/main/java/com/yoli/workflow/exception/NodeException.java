package com.yoli.workflow.exception;

public class NodeException extends RuntimeException{

    public NodeException(String message){
        super(message);
    }

    public NodeException(String message,Throwable cause){
        super(message,cause);
    }

}
