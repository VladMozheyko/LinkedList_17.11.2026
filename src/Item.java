/**
 * Элемент связного списка - в нем хранится элемент списка и ссылка на следующий
 */
public class Item {
    public int value;  // Само значение
    public Item next;  // Ссылка на следующий элемент

    public Item(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
