//calculating sum of two numbers from user input

import java.util.*;

public class SumOfNumbers_UserInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num_1 = sc.nextInt();
        System.out.print("Enter number : ");
        int num_2 = sc.nextInt();
        long sum = (num_1 + num_2);
        System.out.println("Sum : " + sum);
    }
}
