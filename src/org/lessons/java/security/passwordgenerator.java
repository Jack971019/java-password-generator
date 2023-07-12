package org.lessons.java.security;

import java.util.Scanner;

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
        userFavoriteColor = "blu";
        userdayofbirth = 10;
        usermonthofbirth = 9;
        useryearofbirth = 1997;

        // calcolo somma numero per la password

        int userpasswordnumber = userdayofbirth + usermonthofbirth + useryearofbirth;

        // genero password

        System.out.println("la tua password è:" + userName + userSurname + userFavoriteColor + userpasswordnumber);


        //BONUS

        Scanner scanner = new Scanner(System.in);
        //creazione variabili

        String usernameBonus;
        String usersurnameBonus;
        String userfavoritecolorBonus;
        int userdayofbirthBonus;
        int usermonthohbirthBonus;
        int useryearofbirthBonus;

        // assegnazione valori variabili scritte dall'utente in console

        System.out.println("scrivi il tuo nome:");
        usernameBonus = scanner.next();

        System.out.println("scrivi il tuo cognome:");
        usersurnameBonus = scanner.next();


        System.out.println("scrivi il tuo colore preferito:");
        userfavoritecolorBonus = scanner.next();

        System.out.println("scrivi il giorno in cui sei nato:");
        userdayofbirthBonus = scanner.nextInt();

        System.out.println("scrivi il tuo mese di nascita:");
        usermonthohbirthBonus = scanner.nextInt();

        System.out.println("scrivi il tuo anno di nascita:");
        useryearofbirthBonus = scanner.nextInt();

        System.out.println("la tua nuova password è:" + usernameBonus + usersurnameBonus + userfavoritecolorBonus + (userdayofbirthBonus + usermonthohbirthBonus+ useryearofbirthBonus) );

        //BONUS REPOSITORY COMPLETED

    }
}
