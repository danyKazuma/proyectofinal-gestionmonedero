package com.nttdata.proyectofinal.config;
import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Currency;

@MongoEntity(collection = "wallets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Wallet extends PanacheMongoEntity {

    private String userId;
    private BigDecimal balance;
    private Currency currency;
    private String name;
}