package Controller;

import java.util.Scanner;
import View.View;

import static Controller.RegExContainer.*;
import static View.TextConstant.FIRST_NAME;
import static View.TextConstant.LOGIN_DATA;
import static View.TextConstant.SECOND_NAME_DATA;

public class InputNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;
    private String secondName;
    private String fathersName;

    public InputNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        AdditionalController utilityController =
                new AdditionalController(view, sc);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? NAME_UKR : NAME_ENG;

        this.firstName =
                utilityController.inputFromScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputFromScanner
                        (LOGIN_DATA, LOGIN_USER);
        this.secondName =
                utilityController.inputFromScanner
                        (SECOND_NAME_DATA,SECOND_NAME_ENG);
        this.fathersName =
                utilityController.inputFromScanner
                        (FIRST_NAME,FATHERS_NAME_ENG);
    }
}


