/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.managedBeans;

import ch.hearc.ig.odi.customeraccount.services.Services;
import java.io.Serializable;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
@Stateless
@Named(value="customersBean")
public class CustomersBean implements Serializable {

    @Inject Services services;
    
    public CustomersBean() {
    }
    
    public List getCustomers(){
        return services.getCustomersList();
    }
    
}
