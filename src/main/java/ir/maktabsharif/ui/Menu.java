package ir.maktabsharif.ui;

import ir.maktabsharif.exception.InvalidInput;
import ir.maktabsharif.utility.Input;
import ir.maktabsharif.utility.Sout;

public class Menu {

    public void startMenu() throws InvalidInput {

        Sout.print("***** WELCOME TO LIBRARY MANAGEMENT SYSTEM *****");

        String answer = Input.stringInput("do you have account ?(YSE/NO)");

        if (answer.equalsIgnoreCase("yes")){
            memberMenu();
        }else if (answer.equalsIgnoreCase("no")){
            signIn();
        }else{
            throw new InvalidInput("invalid answer please try again!");
        }

    }

    private void signIn() {
        Sout.print("***** SIGN IN *****");
        String firstName = Input.stringInput("Please enter your first name: ");
        String lastName = Input.stringInput("Please enter your last name: ");
        Sout.print("***** ACCESSIBILITY *****\n" +
                "   1. LIBRARIAN_MEMBER\n" +
                "   2. NORMAL_MEMBER\n");

        Integer accessibility = Input.intInput("Please enter your accessibility number: ");


    }

    private void memberMenu() {

    }


}
