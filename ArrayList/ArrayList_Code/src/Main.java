import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // 1. створення списку масиву, додавання  кольорів, виведення колекції
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("green");
        color.add("yellow");

        // 2. ітерація по всіх елементах списку масиву
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }

        // 3. вставка елемента у список масиву на першу позицію
        color.add(0, "white");
        System.out.println();
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        System.out.println(color.get(1)); // 4. отримання елемента (за заданим індексом) зі списку масиву
        color.set(0, "brown"); // 5. оновлення конкретного елемента списку заданим елементом
        System.out.println();
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        System.out.println(color.remove(2)); // 6. видалення третього елемента зі списку масиву
        System.out.println();
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        System.out.println(color.contains("red")); // 7. пошук елемента у списку масиву
        System.out.println(color.contains("grey"));

        Collections.sort(color); // 8. сортування заданого списку масиву
        System.out.println("8 task");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        ArrayList <String> color2 = (ArrayList)color.clone(); // 9. копіювання одного списку масиву в інший
        System.out.println();
        for (int i = 0; i < color2.size(); i++) {
            System.out.println(color2.get(i));
        }
        Collections.reverse(color); // 10. реверсування елементів у списку масиву (метод reverse() класу Collections)
        System.out.println("10 task");
        for (int i = 0; i < color.size(); i++) {
            System.out.println(color.get(i));
        }
        System.out.println(color.equals(color2)); // 11. порівняння двох списків масиву (метод equals)

        color2.clear(); // 12. очищення списку масиву (метод isEmpty)

        System.out.println(color2.isEmpty()); // 13. перевірка, чи список масиву є порожнім
        System.out.println(color.isEmpty());

        color.ensureCapacity(10); // 14. збільшення розміру списку масиву

        ((ArrayList<String>) color).trimToSize(); // 15. обрізання місткості списку масиву до поточного розміру (метод trimToSize)
} }