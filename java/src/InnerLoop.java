public class InnerLoop {
    public static void main(String[] args){

    inner i = new inner();
    System.out.println("");
    inner.battery b = i.new battery(4000);
    i.displayInfo();
    System.out.println("");
    inner l = new inner("Lenovo", 9, "Windows");
    inner.battery h = l.new battery(6000);
    l.displayInfo();
    System.out.println("");
    inner e = new inner("Huawei", 4, "Windows");
    inner.battery q = e.new battery(4000);
    e.displayInfo();
    System.out.println("");
    inner.battery bat = i.new battery();


    }
}
