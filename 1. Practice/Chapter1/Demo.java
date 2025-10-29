public class Demo {
    public static void main(String[] args) {
        System.out.println("================= DEMO class Pen ====================");
        Pen pen = new Pen();
        pen.id = 1;
        pen.name = "Pen Demo";
        pen.color = "Red";
        pen.brand = "Kufra";
        pen.size = "L";
        pen.price= 2.5;
        pen.displayInfo();
        System.out.println("================= END DEMO class Pen ====================\n");

        System.out.println("================= DEMO class WaterBottle ====================");
        WaterBottle bottle = new WaterBottle();
        bottle.id = 1;
        bottle.name = "Dasani";
        bottle.brand = "Cocola";
        bottle.size = "500 ml";
        bottle.price = 1000.0;
        bottle.showInfo();
        System.out.println("================= END DEMO class WaterBottle ====================\n");
    }
}