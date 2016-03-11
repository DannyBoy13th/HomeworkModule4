package TemperatureConverter;

import java.util.Scanner;

/**
 * Created by DannyBoy13th on 11.03.2016.
 */
public class Main {
    public static void main(String[] args) {

        Scanner TypeofTempScan = new Scanner(System.in);
        Scanner CelConverter = new Scanner(System.in);
        Scanner FarConverter = new Scanner(System.in);

        double CelsiusTemp;
        double FahrenheitTemp;


        System.out.println("Temperature Converter");
        System.out.println();
        System.out.println("Please choose a type you would like to convert your temperature to, Celsius or Fahrenheit): ");

        if (TypeofTempScan.hasNext("Fahrenheit")) {

            System.out.println("Please, print in your temperature in Celsius");

            if (CelConverter.hasNextDouble()) {
                CelsiusTemp = CelConverter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + CelsiusTemp * 33.8 +"degrees by Fahrenheit");

            }
        }

        if (TypeofTempScan.hasNext("Celsius")){

            System.out.println("Please, print in your temperature in Fahrenheit");

            if (FarConverter.hasNextDouble()){
                FahrenheitTemp = FarConverter.nextDouble();

                System.out.println();
                System.out.println("Result is: " + FahrenheitTemp * -17.22 + "degrees by Fahrenheit" );
            }
        }
    }
}