/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.Collection;
import java.util.Map;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
public class Bank {
    
    int number;
    String name;
    private Map<String, Account> accounts;
    private Map<Integer, Customer> customers;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public Account getAccountByNumber(String number){
        Account accountSearch = accounts.get(number);
        return accountSearch;
    }
    
    public Customer getCustomerByNumber(int number){
        Customer customerSearch = customers.get(number);
        return customerSearch;
        
    }
    
    
    
    public Customer addCustomer(int number, String fn, String ln){
        Customer newCustomer = new Customer(number,fn,ln);
        customers.put(number, newCustomer);
        return newCustomer;
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        
        if (getCustomerByNumber(customer.getNumber()) != null) {
            Account newAccount = new Account(number, name, rate, customer);
            accounts.put(number, newAccount);
        }
        
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }
    
    
    
}
