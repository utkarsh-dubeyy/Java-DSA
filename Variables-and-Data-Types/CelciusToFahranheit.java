// code to convert celcius temparature to faranheit

import java.util.*;

public class CelciusToFaranheit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celcius : ");
        float temperature = sc.nextFloat();
        float farenheit = (temperature * 9.0f / 5.0f) + 32;
        System.out.println("Converted temperature : " + farenheit);
    }
}
