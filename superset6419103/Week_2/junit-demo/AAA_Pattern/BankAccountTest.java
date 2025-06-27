package org.example;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    @Before
    public void setUp(){
        account=new BankAccount(200);
        System.out.println("New account with balance 200");
    }
    @After
    public void teardown(){

          account=null;
        System.out.println("Teardown: Account reset");
    }
    @Test
    public void Deposit(){
        account.deposit(100);
        assertEquals(300,account.getBalance());
    }
    @Test
    public void Withdraw(){
        boolean result=account.withdraw(50);
        assertEquals(150,account.getBalance());
    }
    @Test
    public void WithdrawFailure(){
        boolean result=account.withdraw(1000);
        assertEquals(200,account.getBalance());
    }

}

