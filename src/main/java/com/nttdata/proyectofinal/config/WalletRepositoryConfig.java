package com.nttdata.proyectofinal.config;
import io.quarkus.mongodb.panache.PanacheMongoRepositoryBase;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;



@ApplicationScoped
public class WalletRepositoryConfig implements PanacheMongoRepositoryBase<Wallet, String> {
    private PanacheMongoRepository<Wallet> walletRepository;

    public PanacheMongoRepository<Wallet> getWalletRepository() {
        return walletRepository;
    }
}