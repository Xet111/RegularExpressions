package Controller;

import View.View;

import java.util.Scanner;
import java.util.regex.Pattern;
import Controller.Controller;
import Model.Model;

public class additionalController {

    View view = new View();
    Model model;


    public Pattern createRegEx(){
        Pattern pattern = Pattern.compile("[A-Z]+");
        return pattern;

    }



    public String inputFromScannerLogin(Scanner sc){

        while(!sc.nextLine().matches(createRegEx().toString())){
            view.printMessage(View.WRONG_INPUT + View.INPUT_LOGIN);

        }
        return "True";
    }
}
