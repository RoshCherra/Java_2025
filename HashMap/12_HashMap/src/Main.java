//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {  // перевіримо чи працють створені класи коректно
    public static void main(String[] args) {
        Inventory inventory = new Inventory(); // створили інвентар

        // стоврюємо товари
        Product p1 = new Product("Eb1", "Bread");
        p1.addQuantity(7);
        Product p2 = new Product("Hk2", "Fork");
        p2.addQuantity(10);
        Product p3 = new Product("Em1", "Milk");
        p3.addQuantity(5);

        // додаємо товари
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);

        // виводимо товари
        System.out.println("Inventory:");
        inventory.printProduct();

        // шукаємо товар
        System.out.println("Let's try to find some products:");
        inventory.findProduct("Em1");
        inventory.findProduct("Eb1");
        inventory.findProduct("Gm6");

        // видаляємо товар
        System.out.println("Let's delete product Em1:");
        inventory.removeProduct("Em1");
        System.out.println("Inventory:");
        inventory.printProduct();

    }
}