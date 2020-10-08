/**
 * Author: Moritz Kronberger
 * Date: 8.10.2020
 */


package Main;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben Sie bitte 2 Werte ein:");

        boolean cond = false;


                try {

                    double num1 = sc.nextInt();
                    double num2 = sc.nextInt();

                    double i = num1 + num2;

                    cond = true;


                    System.out.println("Das Ergebnis Lautet: " + i);
                } catch (Exception e) {
                    System.out.println("Nochmal!");
                }
            }

        }




