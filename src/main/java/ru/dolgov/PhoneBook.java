package ru.dolgov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class PhoneBook {
    private HashMap<String, List<String>> book;



    public PhoneBook() {
        this.book = new HashMap<>();
    }


    /**
     * Больше написан методом тыка но вроде как понял
     * Добавление номера
     * @param surname получаем фамилию
     * @param number получаем номер
     */
    public void add(String surname, String number) {
        if(book.containsKey(surname)){ //Если в коллекции HashMap есть данная фамилия
            book.get(surname).add(number); //Добавляем к ней номер
        }else {
            List<String> lst = new ArrayList<>(); //Создаем коллекцию List
            lst.add(number); // Добавляем номер в List
            book.put(surname,lst); //Добавляем ключ surname и номер
        }
    }

    public void get(String surname){
        /**
         * Если есть Фамилия, то вы водим номера если нет, то выводим
         * System.out.println("В справочнике нет записи для фамилии "+surname);
         */
        if(book.containsKey(surname)){
            System.out.println("Вы запросили номера на фамилию:"+ surname);
            System.out.println(book.get(surname));
        }else {
            System.out.println("В справочнике нет записи для фамилии "+surname);
        }

    }
}
