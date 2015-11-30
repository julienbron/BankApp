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
@Named(value="customerDetailsBean")
public class CustomerDetailsBean {

    private int number;
    private String firstName;
    private String  lastName;
    private List<Account> accounts;
    
    
    @Inject Services services;
    
    public CustomerDetailsBean() {
    }
    
    public int getCustomer(int number){
        Customer customer = services.getCustomer(number);
        this.number = customer.getNumber();
        this.firstName = customer.getFirstName();
        this.lastName = customer.getLastName();
        this.accounts = customer.getAccounts();
        if (number > 0) {
            return 0;
        } else{
            return 1;
        }
        
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    
    
    
    
}
