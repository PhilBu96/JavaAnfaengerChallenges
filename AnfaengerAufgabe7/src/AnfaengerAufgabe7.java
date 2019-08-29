import javax.swing.*;

public class AnfaengerAufgabe7 {

    private static final String PASSWORD = "TopSecret!";

    public static boolean checkPass(String input){

        return input.equals(PASSWORD);

    }

    public static void main(String[] args) {

        String userInput = JOptionPane.showInputDialog("Bitte Passwort eingeben:");

        if (checkPass(userInput)){
            JOptionPane.showMessageDialog(null,
                    "Nice! Das Passwort ist richtig :)","Korrekt!", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Falsch! Das Passwort ist nicht korrekt.","Fehler!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
