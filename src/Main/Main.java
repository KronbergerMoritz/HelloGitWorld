/**
 * Author: Moritz Kronberger
 * Date: 8.10.2020
 */


package Main;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte 2 Werte ein:");

        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int i = num1 + num2;
            System.out.println(i);
        }
        catch(Exception e)
        {
            
        }

    }

}
