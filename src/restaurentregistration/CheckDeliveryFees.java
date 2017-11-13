package agilesprint1;

import java.util.*;

public class CheckDeliveryFees {

    public static void main(String[] args) {
        int City, area=0;
        Scanner scan = new Scanner(System.in);

        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        System.out.println("-----------------------------");
        System.out.println("Services available areas:");
        System.out.println("1.Setapak");
        System.out.println("2.Kuala Lumpur City");
        System.out.println("3.Bangsar");
        System.out.println("4.Johor Bharu");
        System.out.println("5.Sri Petaling");
        System.out.println("6.Cheras");

        System.out.print("Please select your Location:");
        City = scan.nextInt();

        System.out.print("\n");
        if (City <= 0 || City > 6) {
            System.out.println("Please only enter digit 1 to 6!");
        } else {
            switch (City) {
                
                
                case 1:
                    System.out.println("1.Wangsa Maju");
                    System.out.println("2.Melati Utama");
                    System.out.println("3.Genting Klang");

                    System.out.print("Please select your Area:");
                    area = scan.nextInt();
                    break;

                case 2:
                    System.out.println("1.Bukit Bintang");
                    System.out.println("2.KLCC");
                    System.out.println("3.Pudu");

                    System.out.print("Please select your Area:");
                    area = scan.nextInt();
                    break;

                case 3:
                    System.out.println("1.MidValley");
                    System.out.println("2.University Malaya");
                    System.out.println("3.Bukit Damansara");

                    System.out.print("Please select your Area:");
                    area = scan.nextInt();
                    break;

                case 4:
                    area = 3;
                    break;

                case 5:
                    System.out.println("1.Bukit Jalil");
                    System.out.println("2.Kuchai Lama");
                    System.out.println("3.Taman Desa");

                    System.out.print("Please select your Area:");
                    area = scan.nextInt();
                    break;

                case 6:
                    System.out.println("1.Taman Connaught");
                    System.out.println("2.Taman Murni");
                    System.out.println("3.Alam Damai");

                    System.out.print("Please select your Area:");
                    area = scan.nextInt();
                    break;

            }
            
            if (area==1){
                System.out.println("Delivery fees to your area will be RM10.00");
            }
            else if(area==2){
                System.out.println("Delivery fees to your area will be RM15.00");
            }
            else if(area==3){
                System.out.println("Delivery fees to your area will be RM20.00");
            }
            else{
                System.out.println("Please only enter digit 1 to 3!");
            }
        }
        
        
    }

}
