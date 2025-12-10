import java.util.HashMap;

// 2. Створіть клас Inventory, який містить HashMap<String, Product> для зберігання товарів.
class Inventory {
    private HashMap<String, Product> products;

    public Inventory() {
        products = new HashMap<>();
    }
// 3. Реалізуйте методи для додавання, видалення та пошуку товарів за кодом.
    public void addProduct(Product product) { // додаємо продукт за кодом
        products.put(product.getCode(), product);
    }

    public void removeProduct(String code) { // видаляємо продукт за кодом
        products.remove(code);
    }

    public void findProduct(String code) { // шукаємо продукт за кодом
        Product student = products.get(code);
        if (student == null) {
            System.out.println(code);
            System.out.println("There is no such product :(");
        } else {
            System.out.println(code);
            System.out.println(student);
        }
    }
// 3. Реалізуйте метод для виведення всіх товарів.
    public void printProduct() { // виводимо всі продукти
        for (Product s : products.values()) {
            System.out.println(s);
        }

    }
}