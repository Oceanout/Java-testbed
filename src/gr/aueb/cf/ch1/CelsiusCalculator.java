package gr.aueb.cf.ch1;

import java.util.Scanner;

public class CelsiusCalculator {
    Scanner Scan = new Scanner(System.in);
    System.out.println("Fahrenheit to Celsius (1) or Celsius to Fahrenheit (2)");
    int result = scan.netInt ();

    if (result == 1){
        // Φαρεναϊτ σε Κελσίου

        System.out.println("Έχετε επιλέξει Φαρεναϊτ σε Κελσιου!");
        System.out.println("Προσθέστε Φαρεναϊτ:");
        double value = scan.nextDouble();
        double valueFinal = (value - 32) * 5/9;
        System.out.println("Κελσίου:");
        System.out.println(Math.round(valueFinal *10.0)/10.0);


    }   else if (result == 2) {
        //Κελσίου σε Φαρεναϊτ

        System.out.println("");

    }

}
