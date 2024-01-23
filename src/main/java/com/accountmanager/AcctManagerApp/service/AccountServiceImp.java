package com.accountmanager.AcctManagerApp.service;

import com.accountmanager.AcctManagerApp.entity.Account;
import com.accountmanager.AcctManagerApp.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    @Override
    public List<Account> getAllAccount() {
        List<Account> accountList = accountRepository.findAll();
        return accountList;
    }

    @Override
    public Account getAccount(long id){
        Optional<Account> optionalAccount= accountRepository.findById(id);
        if (optionalAccount.isPresent()){
            Account account = optionalAccount.get();
            return account;
        }
        return null;
    }


    @Override
    public void deleteAccount(Long id) { accountRepository.deleteById(id);}

    @Override
    public void updateAccount(Account account) {
        accountRepository.save(account);
    }

}