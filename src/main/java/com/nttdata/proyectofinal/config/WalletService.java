package com.nttdata.proyectofinal.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WalletService {
    private final WalletRepository walletRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository) {
        this.walletRepository = walletRepository;
    }

    public Wallet createWallet(Wallet wallet) {
        return walletRepository.save(wallet);
    }

    public List<Wallet> getAllWallets() {
        return walletRepository.findAll();
    }

    public Wallet getWalletById(String id) throws WalletNotFoundException {
        return walletRepository.findById(id)
                .orElseThrow(() -> new WalletNotFoundException("Wallet with id " + id + " not found"));
    }

    public Wallet updateWallet(String id, Wallet wallet) throws WalletNotFoundException {
        Wallet existingWallet = walletRepository.findById(id)
                .orElseThrow(() -> new WalletNotFoundException("Wallet with id " + id + " not found"));

        existingWallet.setName(wallet.getName());
        existingWallet.setBalance(wallet.getBalance());
        existingWallet.setCurrency(wallet.getCurrency());

        return walletRepository.save(existingWallet);
    }

    public void deleteWallet(String id) throws WalletNotFoundException {
        if (!walletRepository.existsById(id)) {
            throw new WalletNotFoundException("Wallet with id " + id + " not found");
        }

        walletRepository.deleteById(id);
    }
}
