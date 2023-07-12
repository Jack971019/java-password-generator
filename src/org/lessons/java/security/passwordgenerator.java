package org.lessons.java.security;

public class passwordgenerator {
    public static void main(String[] args) {
        //creazione variabili

        String userName;
        String userSurname;
        String userFavoriteColor;
        int userdayofbirth;
        int usermonthofbirth;
        int useryearofbirth;

        //assegno valori alle variabili

        userName = "Giacomo";
        userSurname = "Testori";
        userFavoriteColor = "blue";
        userdayofbirth = 10;
        usermonthofbirth = 9;
        useryearofbirth = 1997;

        // calcolo somma numero per la password

        int userpasswordnumber = userdayofbirth + usermonthofbirth + useryearofbirth;

        // genero password

        System.out.println("la tua password è:" + userName + userSurname + userFavoriteColor + userpasswordnumber);




    }
}
