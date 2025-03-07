import java.util.Scanner; // Import Scanner for user input

public class CarDemo {
    double fuel = 0, kmDriven = 0; // Fuel and Distance variables

    // Method to add fuel
    void addFuel(double liters) {
        fuel = fuel + liters; // Increase fuel amount
        System.out.println("Fuel added: " + liters + "L"); // Show fuel added
    }

    // Method to drive the car
    void drive(double km) {
        double neededFuel = km / 10; // 10 km per liter
        if (fuel >= neededFuel) { // Check if enough fuel is available
            kmDriven = kmDriven + km; // Increase distance driven
            fuel = fuel - neededFuel; // Reduce fuel based on distance
            System.out.println("🚗 Drove " + km + " km | Fuel left: " + fuel + "L"); // Show status
        } else {
            System.out.println("⚠️ Not enough fuel!"); // Show warning if fuel is low
        }
    }

    // Method to check total distance driven
    void checkOdometer() {
        System.out.println("📏 Distance driven: " + kmDriven + " km"); // Print distance driven
    }

    // Main method (Program starts here)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object for input
        CarDemo myCar = new CarDemo(); // Create Car object

        System.out.print("Enter fuel amount (L): "); // Ask user to enter fuel
        double fuelAmount = sc.nextDouble(); // Read fuel input
        myCar.addFuel(fuelAmount); // Call addFuel() method

        System.out.print("Enter distance to drive (km): "); // Ask user for distance
        double distance = sc.nextDouble(); // Read distance input
        myCar.drive(distance); // Call drive() method

        myCar.checkOdometer(); // Call method to check odometer (total distance)

        sc.close(); // Close Scanner
    }
}



// import java.util.Scanner;

// public class CarDemo {
// double fuel = 0, kmDriven = 0; // Fuel and Distance

// void addFuel(double liters) {
// fuel = fuel + liters;
// System.out.println(" Fuel added: " + liters + "L");
// }

// void drive(double km) {
// double neededFuel = km / 10; // 10 km per liter
// if (fuel >= neededFuel) {
// kmDriven = kmDriven + km;
// fuel = fuel - neededFuel;
// System.out.println(" Drove " + km + " km | Fuel left: " + fuel + "L");
// } else {
// System.out.println("Not enough fuel!");
// }
// }

// void checkOdometer() {
// System.out.println("Distance driven: " + kmDriven + " km");
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// CarDemo myCar = new CarDemo();
// int choice;

// while (true) {
// System.out.println("\n===== Car Menu =====");
// System.out.println("1. Add Fuel");
// System.out.println("2. Drive");
// System.out.println("3. Check Odometer");
// System.out.println("0. Exit");
// System.out.print("Enter your choice: ");
// choice = sc.nextInt(); // Removed duplicate 'int' keyword

// if (choice == 0) {
// System.out.println("Exiting... Thank you!");
// break; // Exit the loop
// }

// if (choice == 1) {
// System.out.print("Enter fuel amount (L): ");
// myCar.addFuel(sc.nextDouble());
// } else if (choice == 2) {
// System.out.print("Enter distance to drive (km): ");
// myCar.drive(sc.nextDouble());
// } else if (choice == 3) {
// myCar.checkOdometer();
// } else {
// System.out.println(" Invalid choice! Try again.");
// }
// }

// }
// }
