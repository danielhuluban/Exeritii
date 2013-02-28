/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 2:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class GalToLitTable {
    public static void main(String args[]) {
        double gallons, liters;
        int counter;
        counter = 0;

        for(gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;  // convertim in litri
            System.out.println(gallons + " gallons is " + liters + " liters. ");
            counter++;
            // la fiecare 10 lini se printeaza blanck
            if(counter == 0);
            System.out.println();
            counter = 0;  // reseteaza linia counter

        }

    }

}
