package com.jsp.firstapplication.exception;

public class OrderNotFound extends RuntimeException{

    public OrderNotFound(String message) {
        super(message);

    }
}
