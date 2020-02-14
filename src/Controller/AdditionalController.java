package Controller;

import View.View;

import java.util.Scanner;
import java.util.regex.Pattern;
import Controller.Controller;
import Model.Model;

public class AdditionalController {

    View view ;
    Scanner scanner;
    AdditionalController(View view, Scanner scanner){
        this.view = view;
        this.scanner = scanner;
    }





    public String inputFromScannerLogin(Scanner sc, String regEx){

        while(!sc.nextLine().matches(regEx)){
            view.printMessage(View.WRONG_INPUT + View.INPUT_LOGIN);

        }
        return "True";
    }
}
