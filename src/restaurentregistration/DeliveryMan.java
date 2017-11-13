package restaurentregistration;

import java.util.*;

/*Name: Ng Li Poh
Group: RSD2-G2
 */
public class DeliveryMan {

    private static int registrationNo = 99;

    public static int getNextRegNo(int regNo) {
        return ++regNo;
    }

    public static void main(String[] args) {
        ArrayList<String> RegInfo = new ArrayList<>();
        int nextNo;
        Scanner scan = new Scanner(System.in);
        String regNo,deliveryManName,ic, phoneNo,email,address;
        System.out.println("------------------------------");
        System.out.println("FASTEST DELIEVRYMAN SDN.BHD.");
        System.out.println("Delivery Man Registration");
        System.out.println("------------------------------\n");

        nextNo = getNextRegNo(registrationNo);
        System.out.print("Registration Number: " + nextNo + "");
        regNo = nextNo + "";
        System.out.print("\nName: ");
        deliveryManName = scan.nextLine();
        System.out.print("IC: ");
        ic = scan.nextLine();
        System.out.print("Phone Number: ");
        phoneNo = scan.nextLine();
        System.out.print("Email: ");
        email=scan.nextLine();
        System.out.print("Home address: ");
        address=scan.nextLine();

        RegInfo.add(regNo);
        RegInfo.add(deliveryManName);
        RegInfo.add(ic);
        RegInfo.add(phoneNo);
        RegInfo.add(email);
        RegInfo.add(address);

        System.out.print("\nRegister (Y/N): ");
        String result = scan.nextLine();
        switch (result) {
            case "Y":
            case "y": {
                System.out.println("--------------------------------------------\n");
                System.out.println("Registration Number: " + regNo);
                System.out.println("Delivery man name: " + deliveryManName);
                System.out.println("IC: " + ic);
                System.out.println("Phone Number: " + phoneNo);
                System.out.println("Email: "+email);
                System.out.println("Home address: "+address);
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
