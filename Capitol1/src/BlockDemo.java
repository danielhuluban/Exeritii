/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 2:17 PM
 * To change this template use File | Settings | File Templates.
 */

// Here's a program that uses a block of code to prevent a division by zero:

public class BlockDemo {
    public static void main(String args[]){
        double i, j, d;
        i = 5;
        j = 10;
        // obiectivul acestuia este un bloc
        if (i != 0){
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is: " + d);
        }

    }
}
