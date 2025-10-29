public class WaterBottle {
    int id;
    String name;
    String brand;
    String size;
    Double price;

    public void showInfo() {
        System.out.println("Water Bottle ID: " + this.id);
        System.out.println("Water Bottle Name: " + this.name);
        System.out.println("Water Bottle Brand: " + this.brand);
        System.out.println("Water Bottle Size: " + this.size);
        System.out.println("Water Bottle Price: " + this.price);
    }

    public static void main(String[] args) {
        WaterBottle obj = new WaterBottle();
        obj.id = 1;
        obj.name = "Dasani";
        obj.brand = "Cocola";
        obj.size = "500 ml";
        obj.price = 1000.0;
        obj.showInfo();

    }
}