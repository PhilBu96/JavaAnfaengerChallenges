public class AnfaengerAufgabe5 {

    //ACHTUNG!!!
    //Seit dieser Aufgabe dokumentiere ich immer alle Methoden.
    //Ein professioneller Entwickler tut das immer, damit alle wissen, was genau die Methoden tun usw.
    //Die Notation wird ganz bequem von IntelliJ generiert, ist aber auch nicht kompliziert.

    /**
     * Diese Methode sorgt dafür, dass ein String in Leetspeak umgewandelt werden soll.
     * Momentan tut sie das allerdings nur mit dem 'A' und 'a'.
     * @param input Der String, der in Leetspeak umgewandelt werden soll.
     * @return Einen String, der in Leetspeak ist.
     */
    public static String toLeetSpeak(String input){
        String output = "";

        /*Gibt schönere Methoden, diese ist aber die einfachste. Zuerst alle großen 'A' ersetzen und in den String
        * output schreiben, dann alle kleinen 'a' ersetzen und wieder in output schreiben.*/
        output = input.replaceAll("A", "4");
        output = output.replaceAll("a", "4");

        return output;
    }

    public static void main(String[] args) {

        System.out.println(toLeetSpeak("We are anonymous!"));
        System.out.println(toLeetSpeak("Just because we can..."));
        System.out.println(toLeetSpeak("My name is not Arne."));
        System.out.println(toLeetSpeak("Dann dock ich das Ding da an!"));
        System.out.println(toLeetSpeak("GAME OVER!!!"));

    }

}
