package com.yoli.workflow.exception;

/**
 * 节点不存在异常
 * */
public class NotNodeException extends RuntimeException{

    public NotNodeException(String message){
        super(message);
    }
}
