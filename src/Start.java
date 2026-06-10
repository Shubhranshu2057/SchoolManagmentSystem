import controller.LoginController;

import java.util.Scanner;

public class Start {

    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int choise = 1;
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
            choise = sc.nextInt();
            switch (choise){

                //login
                case 1:
                    LoginController login = new LoginController();
                    login.login();
                    break;

                    //Account Create
                case 2:
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
