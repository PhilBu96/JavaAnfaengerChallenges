public class AnfaengerAufgabe1 {

    public static void main(String[] args) {

        //15 mal 48 = ?
        System.out.println("15 mal 48 = " + 15*48);
        //Das Quadrat von 40
        System.out.println("Das Quadrat von 40 = " + 40*40);
        //Die 3er-Potenz von 95
        System.out.println("Die 3er-Potenz von 95 = " + (int) Math.pow(95, 3));
        //Das Quadrat der Kreiszahl Pi
        System.out.println("Das Quadrat der Kreiszahl Pi = " + Math.pow(Math.PI, 2));
        //Die Quadratwurzel von (der Eulerschen Zahl hoch Pi)
        System.out.println("Die Quadratwurzel von (der Eulerschen Zahl hoch Pi) = " + Math.sqrt(Math.pow(Math.E, Math.PI)));
        //Den Sinus von 42°
        System.out.println("Den Sinus von 42° = " + Math.sin(Math.toRadians(42)));
        //Konvertierung von 1.337 radiant in Grad
        System.out.println("Konvertierung von 1.337 radiant in Grad = " + Math.toDegrees(1.337));


    }

}
