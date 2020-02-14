package Controller;

public interface RegExContainer {
     String NAME_UKR = "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{2,20}$" ;
     String NAME_ENG = "^[A-Z][a-z]{2,20}";
     String LOGIN_USER = "[A-Z a-z 0-9 -_]{8,20}";
     String SECOND_NAME_ENG = "^[A-Z][a-z]{2,20}";
     String FATHERS_NAME_ENG = "^[A-Z][a-z]{2,20}";
}
