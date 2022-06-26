package com.springboot.demo.demo.Exceptions;

public class NoPersonFoundException extends Exception{
    public NoPersonFoundException(String message){
        super(message);
    }

}
