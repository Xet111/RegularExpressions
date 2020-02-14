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





    public String inputFromScanner(String message, String regEx){

        String res;
        view.printMessage(message);
        while(!(scanner.hasNext() && (res = scanner.next()).matches(regEx))){
            view.printWrongStringInput(message);

        }
        return res;
    }
}
