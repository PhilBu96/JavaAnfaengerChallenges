import java.util.LinkedList;
import java.util.List;

public class AnfaengerAufgabe4 {

    public static void main(String[] args) {

        //"Sauberste" Lösung, bzw. die Lösung, die auch ein fortgeschrittener Entwickler vorziehen würde
        for(int i = 0; i <= 1000; i++){
            System.out.println(i);
        }

        //Mithilfe einer while-Schleife ist eine Zählervariable nötig, die in einer For-Schleife schon eingebaut ist
        int count = 0;
        while (count <= 1000){
            System.out.println(count);
            count++;
        }

        /*FÜR PROFIS: Damit die Ausgabe ein wenig schöner aussieht, wird zuerst eine Liste vom Typ Integer befüllt
        * um danach ganz einfach wieder ausgegeben zu werden. Im Prinzip wird hier nur das System Out auf die Liste
        * geschoben. Das einzige, was die For-Schleife macht ist, jede Zahl von 0 - 1000 in diese Liste zu schreiben.
        * Eine Liste ist in Java eigentlich nur ein dynamisches Array, was zur Laufzeit verändert werden kann. In einem
        * Array lassen sich zur Laufzeit zwar die Werte verändern, aber die Liste nicht vergrößern oder verkleinern.*/
        List<Integer> intList = new LinkedList<>();
        for (int i = 0; i <= 1000; i++){
            intList.add(i);
        }
        System.out.println(intList);

        /*Listen sind extrem mächtig (aber nicht so mächtig wie Maps) und sind sehr oft gute alternativen zu Arrays.
        * Außerdem sind sie einfacher zu handhaben, als Arrays (zumindest für Anfänger). Listen sind generisch, das
        * bedeutet, dass jeder Datentyp in eine Liste geschrieben werden kann. Dafür sorgt die selbstständige
        * Typisierung, die in <> steht. Ein <String> würde z.B. bedeuten, dass die Liste Strings beinhaltet.
        * Ein <Auto> würde bedeuten, dass die Liste Autos beinhaltet (sofern man die Klasse Auto definiert hat ;) )*/

    }

}
