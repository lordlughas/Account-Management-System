package com.accountmanager.AcctManagerApp.service;

import com.accountmanager.AcctManagerApp.entity.Account;
import org.springframework.stereotype.Service;

@Service
public interface AccountService  {


    void createAccount(String name, String type, double amount);
}
