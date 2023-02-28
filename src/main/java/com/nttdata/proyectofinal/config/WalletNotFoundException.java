package com.nttdata.proyectofinal.config;

public class WalletNotFoundException extends RuntimeException  {
    public WalletNotFoundException(String message) {
        super(message);
    }
}
