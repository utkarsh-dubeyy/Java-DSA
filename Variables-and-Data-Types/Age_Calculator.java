//Take your age (int) as input. Print your age in days (age × 365) and in seconds.

import java.util.*;

public class Age_Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age (in years) : ");
        int age = sc.nextInt();

        int days = 365 * age;
        System.out.println("Age (in Days) : " + days);

        long seconds = 31536000L * age;
        System.out.println("Age (in seconds) : " + seconds);
    }
}
