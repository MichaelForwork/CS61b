/* -*- encoding: utf-8 -*-
'''
@File    :   Account.java
@Time    :   2020/08/28 15:57:23
@Author  :   Michael 
@Version :   1.0
@Contact :   Search username of MichaelForwork at github
@Doc    :    this file is for lab2 exercise2 
'''
# -*-*-*-*- here is the beginning of this script -*-*-*-*- */

// @source : https://cs61bl.org/su18/labs/lab02/


import org.junit.Test;
import static org.junit.Assert.*;

public class Account{

    private double balance;
    private Account parentAccount;    // parents will provide the overdraft protection

    // parents and it's friends are  null.
    public Account(double balance){
        this.balance = balance;
        this.parentAccount = null;
    }

    public Account(double balance, Account parentAccount){
        this.balance = balance;
        this.parentAccount = parentAccount;

    }

    public double getBalance() {
        return balance;
    }

    public Account getParentAccount() {
        return parentAccount;
    }

    // if success return true else return false.
    // if balance couldn't afford then goto the parentaccount and so on.
    public boolean withdraw(double money){
        if(money <= this.balance){
            this.balance -= money;
            return true;
        }
        else{
            return this.overdraftProtection(money - balance) ;
        }
    }

    // increase the balance.
    public boolean deposit(double money){
        if(money < 0){
            return false;
        }
        this.balance += money;
        return true;
    }

    // transfer all of the money from the argument account to the current account.
    // the argument account balance should be zeroed while the current account’s balance increases by the argument’s old balance.
    public boolean merge(Account account){
        if( account == null || account.balance < 0){
            return false;
        }
        this.balance += account.balance;
        account.balance = 0;
        return true;
    }


    // when the balance would go negative, the bank will deduct the necessary funds from a second account.
    // yeah, the second account is parentaccount, if parent doesn't have enough balance then withdraw should fail.
    private boolean overdraftProtection(double money){

        // if an account doesnt have parent then fail
        if (this.parentAccount == null){
            System.out.println("this account doesn't have parents and withdraw fail.");
            return false;
        }

        // if his parent have enough balance for this withdraw then return turn, else call his parent's parent recurssively
        if (money <= this.parentAccount.balance){
            this.parentAccount.balance -= money;
            System.out.println("you parent has paied the money which is " + String.valueOf(money));
            return true;
        }
        else{
            Account parent = this.parentAccount;    // to ask parent's parent for help
            if (parent.parentAccount == null){
                System.out.println("your parent's parent doesn't have enough money!");
                return false;
            }else
                return parent.overdraftProtection(money - parent.balance);
        }

    }


    public static void interedf (){

    }


}
