package com.nttdata.proyectofinal.config;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface WalletRepository extends MongoRepository<Wallet, String> {
    Wallet findByUserId(String userId);
}