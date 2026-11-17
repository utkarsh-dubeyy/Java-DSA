// calculate area of square

import java.util.*;

public class AreaOfSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side : ");
        int side = sc.nextInt();
        long area = side * side;
        System.out.println("Area : " + area);
    }
}
