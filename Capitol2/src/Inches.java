/**
 * Created with IntelliJ IDEA.
 * User: danielhuluban
 * Date: 2/28/13
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Inches {
    public static void main(String args[]) {
        long ci;
        long im;
        im = 5280 * 12;
        ci = im * im * im;
        System.out.println("There are " + ci + " cubic inches in cubic mile.");
    }
}
