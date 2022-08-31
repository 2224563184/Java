package com;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.jar.JarException;

@ControllerAdvice
public class extion {
    @ExceptionHandler(value = {RuntimeException.class,ArrayStoreException.class})
    public String session(){
        return "index";
    }

}
