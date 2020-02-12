package Controller;

import java.util.Scanner;
import View.View;
import Model.Model;
public class Controller {


    View view;
    Model model;
   public Controller(Model model,View view){
       this.model = model;
       this.view = view;

    }

    String name;
    String login;

    additionalController additional = new additionalController();
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        view.printMessage(View.INPUT_LOGIN);
        model.Check(additional.inputFromScannerLogin(sc));


    }

}

