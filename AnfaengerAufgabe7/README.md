# Java Anfänger-Challenge #7
Die siebte Challenge meiner Anfänger-Aufgaben.

# Aufgabe:
Erstelle eine Methode checkPass(), die überprüft, ob das übergebene Passwort mit dem Passwort übereinstimmt, welches du im Source Code als String deklariert hast.
Ob das Passwort richtig ist, soll dem User dann mitgeteilt werden.
Entweder per Konsolenausgabe oder richtig fancy über eine Dialogbox, die folgendermaßen erstellt wird:  

ERROR - Fehlermeldung:  
JOptionPane.showMessageDialog(null,"Kreiz","Titel", JOptionPane.ERROR_MESSAGE);  

Einfache Meldung:  
JOptionPane.showMessageDialog(null,"Kein Icon","Titel", JOptionPane.PLAIN_MESSAGE);  

Der User kann das Passwort natürlich per Scanner auf der Konsole eingeben. Viel Cooler ist aber folgendes:  

JOptionPane.showInputDialog("Bitte Passwort eingeben:");  
Dieser Befehl liefert einen String zurück mit dem, was der User dort eingegeben hat.  

Aber wie immer: Viele Wege führen ans Ziel! Viel Spaß beim Lösen :)

# Lösung
  Die Lösung befindet sich hier im Ordner "src".