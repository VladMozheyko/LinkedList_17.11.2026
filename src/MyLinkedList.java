/**
 * Односвязный однонаправленный список
 */
public class MyLinkedList {
    private Item head; // Голова списка
    private int count; // Количество элементов списка

    //Полиморфизм(с древнегреч. многоформие) - позволяет создавать методы с одинаковым названием, но разным набором параметров.
    //Это нужно, когда у нас есть задача создать несколько вариантов решения метода. Рассмотрим создание объекта для связного списка
    //Один из них сразу инициализирует голову, второй просто создает объект

    /**
     * Конструктор - метод, который выделяет память под объект
     * @param head
     */
    public MyLinkedList(Item head) {
        this.head = head;
    }

    /**
     * Просто выделяю память под список, без первого элемента
     */
    public MyLinkedList() {
    }

    public void add(Item item){
        if(head == null){
            head = item;     // Если список пуст, добавляем элемент в голову
        }
        else {
            Item iterator = head;
            while (iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = item;
        }
    }

    public void out(){
        Item iterator = head;
        while (iterator != null){
            System.out.print(iterator.value + " ");
            iterator = iterator.next;
        }
        System.out.println();


    }
}
