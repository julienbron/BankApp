/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.customeraccount.business;

import java.util.Collection;

/**
 *
 * @author Julien Bron <julien.bron@he-arc.ch>
 */
public class Bank {
    
    int number;
    String name;
    private Collection<Account> accounts;
    private Collection<Customer> customers;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
    }
    
    public Account getAccountByNumber(String number){
        Account accountSearch = null;
            for (Account account : accounts) {
                if (account.getNumber().equals(number)) {
                    accountSearch = account;
                    break;
                }
            }
        return accountSearch;
    }
    
    public Customer getCustomerByNumber(int number){
        Customer customerSearch = null;
            for (Customer customer : customers) {
                if (customer.getNumber() == number) {
                    customerSearch = customer;
                    break;
                }
            }
        return customerSearch;
        
    }
    
    public void addCustomer(int number, String fn, String ln){
        Customer newCustomer = new Customer(number,fn,ln);
        customers.add(newCustomer);
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        
        if (getCustomerByNumber(customer.getNumber()) != null) {
            Account newAccount = new Account(number, name, rate, customer);
            accounts.add(newAccount);
        }
        
    }
    
    
    
}
