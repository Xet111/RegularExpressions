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


    public void processUser(){
        Scanner sc = new Scanner(System.in);
       InputNoteBook inputNoteBook = new InputNoteBook(view,sc);
       inputNoteBook.inputNote();




    }

}

