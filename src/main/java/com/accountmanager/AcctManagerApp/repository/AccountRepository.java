package com.accountmanager.AcctManagerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.accountmanager.AcctManagerApp.entity.Account;


@Repository
public interface AccountRepository extends JpaRepository <Account, Long> {

}

