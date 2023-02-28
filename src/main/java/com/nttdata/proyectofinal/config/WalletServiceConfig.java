package com.nttdata.proyectofinal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WalletServiceConfig {

    @Autowired
    private WalletRepository walletRepository;

    @Bean
    public WalletService walletService() {
        return new WalletServiceImpl(walletRepository);
    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

}
