/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class BoolDemo {
    public static void main(String args[]){

        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is " + b);
     // a boolean value can cintrol the if statement
        if(b) System.out.println("This is executed.");
        b = false;
        System.out.println("This is not executed.");
     // The outcome of a relational operator is a boolean value.
        System.out.println("10 > 9 is " + (10 > 9));

    }
}
