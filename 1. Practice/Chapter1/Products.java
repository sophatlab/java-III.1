public class Products {
    int id;
    String name;
    String size;
    String color;
    Double price;

    public void displayInfo() {
        System.out.println("Product ID: " + this.id);
        System.out.println("Product Name: " + this.name);
        System.out.println("Product Size: " + this.size);
        System.out.println("Product Color: " + this.color);
        System.out.println("Product Price: " + this.price);
    }

    public static void main(String[] args) {
        Products products = new Products();
        products.id = 1;
        products.name = "Pen";
        products.size = "xl";
        products.color = "Blue";
        products.price = 1.4;
        products.displayInfo();
    }
}