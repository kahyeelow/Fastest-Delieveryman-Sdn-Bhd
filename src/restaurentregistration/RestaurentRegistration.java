/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurentregistration;

import java.util.*;
import java.util.Scanner;

public class RestaurentRegistration {

    private static int regNum = 1000;

    public static int getNextRegNum(int nextRegNum) {
        nextRegNum++;
        return nextRegNum;
    }

    public static void main(String[] args) {
        ArrayList<String> ResInfo = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String regisNum, restraurentName, restId, foodtype;
        int nextNum;

        System.out.println("------------------------------");
        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        System.out.println("Restaurent Registration");
        System.out.println("------------------------------\n");

        nextNum = getNextRegNum(regNum);
        System.out.print("Registration Number: " + nextNum + "");
        regisNum = nextNum + "";
        System.out.print("\nRestaurent Name: ");
        restraurentName = scan.nextLine();
        System.out.print("Restaurent ID: ");
        restId = scan.nextLine();
        System.out.print("Food Type (Eg: Beverage, Main course): ");
        foodtype = scan.nextLine();

  

        System.out.print("\nRegister (Y/N): ");
        String result = scan.nextLine();
        switch (result) {
            case "Y":
            case "y": {
                System.out.println("--------------------------------------------\n");
                System.out.println("Registration Number: " + regisNum);
                System.out.println("Restaurent Name: " + restraurentName);
                System.out.println("Restaurent ID: " + restId);
                System.out.println("Food Type: " + foodtype);
            }
            break;
        }

        System.out.print("\nConfirm (Y/N): ");
        String result1 = scan.nextLine();
        switch (result1) {
            case "Y":
            case "y": {
                System.out.println("****************************");
                System.out.println("REGISTERED SUCCESSFULLY!!");
                System.out.println("****************************");
            }
            break;
        }

    }

}
