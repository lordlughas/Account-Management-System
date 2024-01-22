package com.accountmanager.AcctManagerApp.service;

import com.accountmanager.AcctManagerApp.entity.Account;
import com.accountmanager.AcctManagerApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountServiceImp implements AccountService{

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public void createAccount(String name, String type, double amount){
        Account account = new Account();
        account.setName(name);
        account.setType(type);
        account.setAmount(amount);
        accountRepository.save(account);
    }
    public Optional<Account> findByName(String name) {
        return accountRepository.findByName(name);
    }


}