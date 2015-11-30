/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedBeans;

import ch.hearc.ig.odi.customeraccount.services.Services;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */

@Stateless
@Named(value="customerCreateBean")
public class CustomerCreateBean {
    
    @Inject Services services;
    
    private int number;
    private String firstName;
    private String lastName;

    public CustomerCreateBean() {
    }
    
    public int createCustomer(){
        services.saveCustomer(number, firstName, lastName);
        return 0;
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
    
    
    
    
}
