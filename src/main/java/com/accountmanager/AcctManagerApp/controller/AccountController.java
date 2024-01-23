package com.accountmanager.AcctManagerApp.controller;

import com.accountmanager.AcctManagerApp.entity.Account;
import com.accountmanager.AcctManagerApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping(value= "/Account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView home()
    {
        ModelAndView homeView = new ModelAndView();
        homeView.setViewName("account/index");
        return homeView;
    }
    @RequestMapping(value="/create", method = RequestMethod.GET)
    public ModelAndView create(){
        ModelAndView createModelView = new ModelAndView();
        createModelView.setViewName("account/create");
        return createModelView;
    }

    @RequestMapping(value="/regaccount", method = RequestMethod.POST)
    public ModelAndView regaccount(@RequestParam(value= "name")  String name,
                                   @RequestParam(value="type") String type,
                                   @RequestParam(value= "amount") double amount  )
    {
        ModelAndView createdAccountView = new ModelAndView();
        createdAccountView.setViewName("account/create");
        try{
            Optional<Account> accountOptional = accountService.findByName(name);

            if (accountOptional.isPresent()) {
                createdAccountView.addObject("message", "Account Name " +name +" Already Exist: Not Created");
                return createdAccountView;
            } else {
                accountService.createAccount(name, type, amount);
                createdAccountView.addObject("message", "Account Created Successfully!");
                return createdAccountView;
            }

        }
        catch(Exception e){
            createdAccountView.addObject("message", "Error in Creating Account. Please try again!");
            return createdAccountView;
        }
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public ModelAndView dashboard()
    {
        ModelAndView dashboardView = new ModelAndView();
        dashboardView.setViewName("account/dashboard");
        return dashboardView;
    }

}
