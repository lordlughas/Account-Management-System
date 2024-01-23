package com.accountmanager.AcctManagerApp.service;

import com.accountmanager.AcctManagerApp.entity.Account;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface AccountService  {


    void createAccount(String name, String type, double amount);

    Optional<Account> findByName(String name);

    List<Account> getAllAccount();

    Account getAccount(long id);

    void updateAccount(Account account);
}
