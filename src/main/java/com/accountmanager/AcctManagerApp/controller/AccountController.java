package com.accountmanager.AcctManagerApp.controller;

import com.accountmanager.AcctManagerApp.entity.Account;
import com.accountmanager.AcctManagerApp.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.Validator;

import javax.validation.Valid;

@Controller
@Validated
@RequestMapping(value= "/Account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @Autowired
    private Validator validator;
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
            accountService.createAccount(name, type, amount);
            createdAccountView.addObject("message", "Account Created Successfully!");
            return createdAccountView;
        }
        catch(Exception e){
            accountService.createAccount(name, type, amount);
            createdAccountView.addObject("message", "Error in Creating Account. Please try again!");
            return createdAccountView;
        }
    }

}
