public class Pen extends Products {
    String brand;

    public void showPen() {
        super.displayInfo();
        System.out.println("Product Brand: " + this.brand);
    }

    public static void main(String[] args) {
        Pen p = new Pen();
        p.id = 2;
        p.name = "Pen1";
        p.color = "red";
        p.size = "L";
        p.price = 20.5;
        p.brand = "Kufra";
        p.showPen();
    }
}