/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedBeans;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Customer;
import ch.hearc.ig.odi.customeraccount.services.Services;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */

@Stateful
@SessionScoped
@Named(value="accountDetailsBean")
public class AccountDetailsBean {

    private String number;
    private String name;
    private double balance;
    private double rate;
    private int customerNumber;
    
    
    @Inject Services services;
    
    public AccountDetailsBean() {
    }
    
    public int getAccount(String number){
        Account account = services.getAccount(number);
        this.number = account.getNumber();
        this.name = account.getName();
        this.balance = account.getBalance();
        this.rate = account.getRate();
        this.customerNumber = account.getCustomer().getNumber();
          
        return 0;
        
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

}
