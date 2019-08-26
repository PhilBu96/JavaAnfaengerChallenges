public class AnfaengerAufgabe2 {

    /*
    Erstelle eine Methode checkEven(), die prüft, ob eine Zahl gerade ist oder nicht.
    Aus Ergebnis auf der Konsole soll entweder True (die Zahl ist gerade) oder False (die Zahl ist ungerade) rauskommen.
    Ob als Rückgabetyp ein boolean oder ein String herauskommt, kannst du dir aussuchen :-)
     */

    public static String checkEven(int x) {

        String result = "";
        boolean isEven;

        isEven = x % 2 == 0;
        /*
        Andere, aber fortgeschrittenere Version mit einem Lambda-Ausruck.
        In diesem Beispiel viel zu over-engineered, aber schön zu sehen, was alles geht.

        Predicate<Integer> even = (a) -> a % 2 == 0;
        isEven = even.test(x);
         */

        if (isEven) {
            result = String.format("Die Zahl %d ist gerade!", x);
        } else {
            result = String.format("Die Zahl %d ist ungerade!", x);
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(checkEven(5));
        System.out.println(checkEven(68465));
        System.out.println(checkEven(436));
        System.out.println(checkEven(9999999));
        System.out.println(checkEven(-14));
    }
}