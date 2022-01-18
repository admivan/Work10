package ru.dolgov;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Выполнение задания 1");
            String[]words={ // Создаем массив
                    "безмятежный", "безошибочно", "безошибочно", "безынициативный",  "безынициативный",
                    "безынтересный", "безыскусный ", "безысходный",
                    "белиберда", "белладонна", "беллетристика", "белорус", "бельэтаж"
            };
            statistics(words); // вызываем метод
        System.out.println("\n***************************************\n");

        System.out.println("Выполнения задания 2\n");
        PhoneBook phone =new PhoneBook();
        
        //Добавление номеров
        phone.add("Долгов", "3432434");
        phone.add("Крылов", "12312213213");
        phone.add("Кадыров", "343432434324");
        phone.add("Долгов", "343243432124");
        phone.add("Долгов", "342321332434");
        phone.add("Крылов", "1221321323");
        phone.add("Сафиулин", "23432434324");
        phone.add("Долгов", "343243432124");

        //Получение номеров
        phone.get("Долгов");
        phone.get("Крылов");
        phone.get("Кадыров");
        phone.get("Сафиулин");

        //Запрос не существующего номера
        phone.get("Сабутин");

    }

    /**
     * Выполнение метода статистика повторяющееся слов
     * @param statwords получаем массив
     */
    public static void statistics(String[] statwords){
        Set<String> set = new HashSet<>(List.of(statwords));
        System.out.println("Массив");
        System.out.println(Arrays.toString(statwords));// Вывод оригинала массива
        System.out.println("Слова без повторения");
        System.out.println(set); // Вывод массива без повторяющихся слов
        System.out.println("Частота слов");
        for (String key:set) { //Присвоим переменой key слова без повторения
            System.out.println(key+": "+ Collections.frequency(List.of(statwords),key));//Выводим key потом вызываем класс
            // Collections c методом frequency для получения частоты слов в коллекции

        }
    }
}
