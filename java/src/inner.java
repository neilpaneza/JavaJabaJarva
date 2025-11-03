public  class inner {

 String name;
 int ram;
 String version;


  inner(){
     this.name = "Generic";
     this.ram = 8;
     this.version = "Default";


     System.out.println("Default(String)com");
 }

 inner(String brand, String ver) {
     this.name = brand;
     this.ram = 8;
     this.version = ver;

 }

     inner(String brand, int capacity, String ver){
         this.name = brand;
         this.ram = capacity;
         this.version = ver;

     }

          class battery {

             int bat;

             battery(){
                 this.bat = 5000;
                 System.out.println("Default(int)Battery");


             }

             battery(int batteryCapacity) {
                 this.bat = batteryCapacity;

             }



          }

     battery b = new battery();

    void displayInfo() {
        System.out.println("Laptop Specs:");
        System.out.println("Brand Name: " + name);
        System.out.println("Ram Cap: " + ram + " GB");
        System.out.println("Version: " + version);
        System.out.println("Battery: " + b.bat + " mah  ");
    }

}
