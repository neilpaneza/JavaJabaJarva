import java.util.Scanner;

public class inner {

    String name;
    int ram;
    String version;
    battery b;

    // Inner class
    class battery {
        int bat;

        battery() {
            this.bat = 5000;
            System.out.println("Default(int)Battery");
        }

        battery(int batteryCapacity) {
            if (batteryCapacity <= 0) {
                this.bat = 5000; // Default battery
            } else {
                this.bat = batteryCapacity;
            }
        }
    }

    // Constructors
    inner() {
        this.name = "Generic";
        this.ram = 8;
        this.version = "Default";
        this.b = new battery();
        System.out.println("Default(String)com");
    }

    inner(String brand, int capacity, String ver, int batteryCapacity) {
        // Apply defaults if input is invalid or empty
        if (brand == null || brand.trim().isEmpty()) {
            this.name = "Generic";
        } else {
            this.name = brand;
        }

        if (capacity <= 0) {
            this.ram = 8;
        } else {
            this.ram = capacity;
        }

        if (ver == null || ver.trim().isEmpty()) {
            this.version = "Default";
        } else {
            this.version = ver;
        }

        this.b = new battery(batteryCapacity);
    }

    // Display method
    void displayInfo() {
        System.out.println("\nLaptop Specs:");
        System.out.println("Brand Name: " + name);
        System.out.println("RAM Capacity: " + ram + " GB");
        System.out.println("Version: " + version);
        System.out.println("Battery: " + b.bat + " mAh");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many laptops do you want to enter? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        // Create array for laptops
        inner[] laptops = new inner[n];

        // Input loop
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Laptop " + (i + 1) + ":");

            System.out.print("Enter brand name (press Enter for default): ");
            String brand = sc.nextLine();

            System.out.print("Enter RAM capacity in GB (press Enter for default 8): ");
            String ramInput = sc.nextLine();
            int ram = 0;
            if (!ramInput.trim().isEmpty()) {
                try {
                    ram = Integer.parseInt(ramInput);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid RAM input, using default 8 GB.");
                    ram = 8;
                }
            }

            System.out.print("Enter version (press Enter for default): ");
            String version = sc.nextLine();

            System.out.print("Enter battery capacity in mAh (press Enter for default 5000): ");
            String batteryInput = sc.nextLine();
            int battery = 0;
            if (!batteryInput.trim().isEmpty()) {
                try {
                    battery = Integer.parseInt(batteryInput);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid battery input, using default 5000 mAh.");
                    battery = 5000;
                }
            }

            // Create laptop object
            laptops[i] = new inner(brand, ram, version, battery);
        }

        // Display all laptops
        System.out.println("\n========== LAPTOP DETAILS ==========");
        for (int i = 0; i < n; i++) {
            System.out.println("\nLaptop " + (i + 1) + ":");
            laptops[i].displayInfo();
        }

        sc.close();
    }
}
