//code to caluculate average of three numbers 

import java.util.*;

public class Average {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        float num_1 = sc.nextInt();
        System.out.print("Enter number : ");
        float num_2 = sc.nextInt();
        System.out.print("Enter number : ");
        float num_3 = sc.nextInt();
        float avg = (num_1 + num_2 + num_3) / 3;
        System.out.println("Average : " + avg);
    }
}
