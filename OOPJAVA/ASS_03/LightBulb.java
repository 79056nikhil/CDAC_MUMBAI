public class LightBulb {
    boolean isOn; // to check if the bulb is ON or OFF

    void switchOn() {
        isOn = true;
        System.out.println("The light bulb is ON.");
    }

    void switchOff() {
        isOn = false;
        System.out.println("The light bulb is OFF.");
    }

    void checkStatus() {
        if (isOn) {
            // System.out.println("LightBulb status: " + (isOn ? "ON" : "OFF"));
            System.out.println("The light bulb is currently ON.");
        } else {
            System.out.println("The light bulb is currently OFF.");
        }
    }

}

class LightBulbTest {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb(); // Creating an instance(object) of LightBulb

        bulb.checkStatus();
        bulb.switchOn();
        bulb.checkStatus();
        bulb.switchOff();
        bulb.checkStatus();
    }
}

// import java.util.Scanner;

// class LightBulb {
// boolean isOn = false; // Initial state is OFF

// void switchOn() { // switch on
// isOn = true;
// System.out.println("The light bulb is now ON.");
// }

// void switchOff() { // switch OFF
// isOn = false;
// System.out.println("The light bulb is now OFF.");
// }

// // to check the bulb is ON or OFF
// void checkStatus() {
// System.out.println(" LightBulb status: " + (isOn ? "ON" : "OFF"));
// }
// }

// public class LightBulbTest {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// LightBulb bulb = new LightBulb();
// int choice;

// // Menu Loop
// do {
// System.out.println(" Light Bulb Menu");
// System.out.println("1. Switch ON");
// System.out.println("2. Switch OFF");
// System.out.println("3. Check Status");
// System.out.println("0. Exit");
// System.out.print("Enter your choice: ");
// choice = sc.nextInt();

// switch (choice) {
// case 1:
// bulb.switchOn();
// break;
// case 2:
// bulb.switchOff();
// break;
// case 3:
// bulb.checkStatus();
// break;
// case 0:
// System.out.println("Thank you");
// break;
// default:
// System.out.println(" Invalid choice! Please enter a valid option.");
// }
// } while (choice != 0);

// }
// }
