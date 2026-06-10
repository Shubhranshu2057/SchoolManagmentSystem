package controller;

import Entity.AccountEntityAcces;
import Entity.AccountsEntity;

import java.util.Scanner;

public class CreateAccountController {

    public int code(){
        int a = (int) Math.abs(Math.random()*90000)+100000;
        return a;
    }

    public boolean CreateAccount(AccountEntityAcces[] accountdb,int Accountcount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Name:");
        String first = sc.next();
        System.out.println("Enter Your Last Name:");
        String last = sc.next();
        System.out.println("Enter User Name:");
        String Username = sc.next();
        System.out.println("Enter Your Password:");
        String password = sc.next();
        for(int i=0;i<Accountcount;i++){
            if(accountdb[i]!=null&&accountdb[i].getUsername().equals(Username)){
                System.out.println("Account UserName Already Exist!");
                return false;
            }
        }
        int tempnew = code();
       accountdb[Accountcount] = new AccountEntityAcces(first,last,Username,password,tempnew,"student","active",1800,false,0);
        System.out.println("Account Created Successfully");
        return true;
    }
}
