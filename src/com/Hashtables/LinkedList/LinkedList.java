package com.Hashtables.LinkedList;

public class LinkedList {
    static class ListElement {
        ListElement next;
        String data;
    }
    private ListElement head;
    private ListElement tail;
    public int size;


    public void add(String data){
        ListElement ptr = new ListElement();
        ptr.data = data;

        if(head == null) {
            head = ptr;
        }
        else {
            tail.next = ptr;
        }
        tail = ptr;
        size++;
    }
    public void printList() {
        ListElement h = head;       //получаем ссылку на первый элемент
        while (h != null)           //пока элемент существуе
        {
            if(h.next != null)
                System.out.print(h.data + ", "); //печатаем его данные
            else
                System.out.println(h.data + "; "); //печатаем его данные
            h = h.next;                     //и переключаемся на следующий
        }
    }
    public void delEl(String data) {
        if(head == null)        //если список пуст -
            return;             //ничего не делаем

        if (head == tail && head.data.equals(data)) {     //если список состоит из одного элемента
            head = null;        //очищаем указатели начала и конца
            tail = null;
            size --;
            return;             //и выходим
        }

        if (head.data.equals(data)) {    //если первый элемент - тот, что нам нужен
            head = head.next;       //переключаем указатель начала на второй элемент
            size --;
            return;                 //и выходим
        }

        ListElement h = head;       //иначе начинаем искать
        while (h.next != null) {    //пока следующий элемент существует
            if (h.next.data.equals(data)) {  //проверяем следующий элемент
                if(tail == h.next)      //если он последний
                {
                    tail = h;           //то переключаем указатель на последний элемент на текущий
                }
                h.next = h.next.next;   //найденный элемент выкидываем
                size--;
                return;                 //и выходим
            }
            h = h.next;                //иначе ищем дальше
        }

        System.out.println("element " + data + "not found");
    }
    public LinkedList()
    {
        head = null;
        tail = null;
        size = 0;
    }
}
