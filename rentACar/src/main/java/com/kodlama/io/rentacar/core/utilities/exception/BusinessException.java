package com.kodlama.io.rentacar.core.utilities.exception;

public class BusinessException extends RuntimeException {

    //super base sınıftır buradaki base sınıfımız bizim RuntimeException sınıfıdır
    public BusinessException(String message) {
        super(message);
    }
}
