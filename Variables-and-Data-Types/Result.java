// Take the marks of 5 subjects as input (each out of 100). Print the total and the percentage.

import java.util.*;

public class Result {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics, Chemistry, Maths, English and IP respectively : ");
        int Physics = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Maths = sc.nextInt();
        int English = sc.nextInt();
        int IP = sc.nextInt();

        int total_marks = Physics + Chemistry + Maths + English + IP;
        float score = total_marks * 0.2f;

        System.out.println("Total Marks : " + total_marks);
        System.out.println("Percentage : " + score);
    }
}
