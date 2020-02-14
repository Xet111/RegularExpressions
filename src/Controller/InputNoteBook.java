package Controller;

import java.util.Scanner;
import View.View;

import static Controller.RegExContainer.LOGIN_USER;
import static Controller.RegExContainer.NAME_ENG;
import static Controller.RegExContainer.NAME_UKR;
import static View.TextConstant.FIRST_NAME;
import static View.TextConstant.LOGIN_DATA;

public class InputNoteBook {
    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

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
    }
}


