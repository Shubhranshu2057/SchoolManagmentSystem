import Entity.AccountEntityAcces;
import Entity.AccountsEntity;
import controller.CreateAccountController;
import controller.LoginController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Start {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int choise = 1;
        int size = 500;
        int accountacoount =0;
        AccountEntityAcces[] accountentity = new AccountEntityAcces[size];
        String message = """
                ----School Management System----
                1)Login
                2)Create Account
                3)Help 
                0)Exit         
                """;
        while(choise>0){
            System.out.println(message);
            System.out.println("Enter Your Options:");

            while (true){
                try {
                    choise = sc.nextInt();
                    break;
                }catch (InputMismatchException E){
                    System.out.println(message);
                    System.out.println("Required 1-0 Options!");
                    sc.nextLine();
                }
            }



            switch (choise){

                //login
                case 1:
                    LoginController login = new LoginController();
                    login.login();
                    break;

                    //Account Create
                case 2:
                    CreateAccountController create = new CreateAccountController();
                    if(create.CreateAccount(accountentity,accountacoount)){
                        accountacoount++;
                    }
                    break;

                    //Help
                case 3:
                    break;
                    //Invalid
                case 0:

                    return;
                default:
                    System.out.println("Invalid Choisce!");
                    break;
            }
        }

    }
}
