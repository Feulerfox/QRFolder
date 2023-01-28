package com.Ex4;

import com.Ex3.Invoices;

public class Main {
    public static void main(String[] args) {

        // Test Customer class
        com.Ex4.Customer c1 = new Customer(88, "Tan Ah Teck",'m');
        System.out.println(c1);
        System.out.println(c1.getName());
        c1.setGender('d');
        System.out.println(c1.getGender());


        // Test Account class
        Account ac=new Account(12,c1,90.0);
        System.out.println(ac);
        System.out.println(ac.getBalance());
        System.out.println(ac.deposit(90.3));
        System.out.println(ac.getBalance());
        System.out.println(ac.withdraw(12.4));

    }
}
