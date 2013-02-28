/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 5:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class VarInitDemo {
    public static void main(String args[]) {
        int x;
        for(x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}
