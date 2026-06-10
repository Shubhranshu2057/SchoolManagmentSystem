package controller;

import Entity.AccountEntityAcces;

import java.util.Scanner;

public class LoginController {
    public void login(AccountEntityAcces[] accountdb,int AccountCount){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Username:");
        String username = sc.next();
        System.out.println("Enter Password:");
        String password = sc.next();
        Boolean found =false;
        for(int i=0;i<AccountCount;i++){
            if(accountdb[i].getUsername().equals(username)&&accountdb[i].getPassword().equals(password)&&accountdb[i].getStatus().equals("active")&&accountdb[i].getType().equals("student")){
                if(accountdb[i].getAttempts()>=3){
                    System.out.println("Your Account Is blocked Due To Field Attempts!");
                    return;
                }
                System.out.println("Successful Login!");
                found=true;
                return;
            } else if (accountdb[i].getUsername().equals(username)) {
                System.out.println("Your Password Is Incorrect!");
                found=false;
                return;
            }
            if(!found){
                System.out.println("Username Invalid");
            }
        }



    }
}
