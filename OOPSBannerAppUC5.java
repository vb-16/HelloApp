/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * This version uses a String array with inline initialization.
 * Each banner line is constructed using String.join().
 *
 * @author Vaishnavi
 * @version 5.0
 */
public class OOPSBannerAppUC5 {

    public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " *** ", "***** ", "  ***** "),
            String.join(" ", "*   *", "*   *", "*    * ", "*     "),
            String.join(" ", "*   *", "*   *", "*    *", " *    "),
            String.join(" ", "*   *", "*   *", "***** ", "  ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "      * "),
            String.join(" ", "*   *", "*   *", "*     ", "      * "),
            String.join(" ", " *** ", " *** ", "*     ", " *****  ")
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}