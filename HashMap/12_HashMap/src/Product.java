import java.util.ArrayList;

// 1. Створіть клас Product з полями productCode, name та quantity.
class Product {
    private String productCode;
    private String name;
    private int quantities;

    public Product(String code, String name) {
        this.productCode = code;
        this.name = name;
        this.quantities = 0;
    }

    public String getCode() { // дістаємо код товару
        return productCode;
    }

    public void addQuantity(int quantity) { // додаємо кількість до товару
        quantities += quantity;
    }

    @Override
    public String toString() { // змінюємо метод toString() на зручний нам
        return "Code: " + productCode + "; Name: " + name + "; Quantity: " + quantities;
    }
}