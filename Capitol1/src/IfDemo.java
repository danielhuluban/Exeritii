/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 12:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class IfDemo {
    public static void main(String args[]){

             int a, b, c;
        a = 2;
        b = 3;
        if (a < b)  System.out.println("a is less than b");

        // urmatoarea linie nu o sa afiseze nimic
        if (a==b)  System.out.println("you won't see this");
        System.out.println();

        c = a - b;  // c contine -1
        System.out.println("c contine -1");
        if (c >= 0) System.out.println("c is not negative");
        if (c <= 0) System.out.println("c is negative");
        System.out.println();

        c = b - a;  // c contine 1
        System.out.println("c contine 1");
        if (c >= 0)  System.out.println("c is non-negative");
        if (c < 0)  System.out.println("c is negative");

    }
}
