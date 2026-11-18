/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
import java.util.*;

public class HomeWorkQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter price of pencil : ");
        float pencil = sc.nextFloat();
        System.out.print("Enter price of pen : ");
        float pen = sc.nextFloat();
        System.out.print("Enter price of eraser : ");
        float eraser = sc.nextFloat();

        double bill = pencil + pen + eraser;
        double total_bill = bill + (bill * 0.18);

        System.out.println("Bill (excluding GST) : " + bill);
        System.out.println("Bill (including GST) : " + total_bill);

    }
}
