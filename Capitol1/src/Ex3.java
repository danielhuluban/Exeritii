/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */

// you can see the difference between int and double.

public class Ex3 {
    public static void main(String ergs[]){
        int var;    //declaram o variabila de tip int   var = numele variabilei
        double x;    // declaran o variabila de tip double (floating-point)  x = numele variabilei
        var = 10;   //dam valoarea 10 variabilei var
        x = 10.0;    // dam valoarea 10.0 varabilei x
        System.out.println("Original value of var:" + " " + var);
        System.out.println("Original value of x:" + " " + x);
        System.out.println();  // print linie goala
        // impartim amandoua variabilele
        var = var / 4;
        x = x / 4;
        System.out.println("variabila var dupa impartire:\t " + var);
        System.out.println("variabila x dupa impartire: " + x);


    }
}
