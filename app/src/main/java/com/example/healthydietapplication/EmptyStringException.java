package com.example.healthydietapplication;

public class EmptyStringException extends Throwable {
    private String msg;

    public EmptyStringException(String msg){
        this.msg=msg;
    }

    public String exc(String msg){
        return msg;
    }
}
