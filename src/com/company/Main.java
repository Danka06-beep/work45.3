package com.company;

import java.util.*;

public class Main {
    static TreeSet<Book> bookSet;
    static TreeMap<String, ArrayList<Book>> bookMap;
    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        bookSet = new TreeSet<>();
        bookMap = new TreeMap<>();
        bookMap.put("Фантакстика", new ArrayList<Book>());
        bookMap.put("Фентези", new ArrayList<Book>());
        bookMap.put("Боевик", new ArrayList<Book>());
        System.out.println("Хотите создать жанр?");
        if(sc.nextLine().equals("Да")){
            addGenre();
        }


        while (true) {
            System.out.println("Введите данные по книге");
            String author = sc.nextLine();
            String name = sc.nextLine();
            String years = sc.nextLine();
            String genre = sc.nextLine();
            Book book = new Book(author, name, years, genre);
            System.out.println("Хотите добавить свой жанр");
            if(sc.nextLine().equals("Да")){
                bookMap.get(addGenre()).add(book);
                break;
            }

            System.out.println("Выберите жанр книги");
            int number = 1;
            for (String i : bookMap.keySet()) {
                System.out.println(number + " " + i);
                number++;
            }
            int input = sc.nextInt();
            bookMap.get(bookMap.keySet().toArray()[input - 1]).add(book);
            sc.nextLine();
            System.out.println("Введите end для вывода");
            if (sc.nextLine().equals("end")) {
                break;
            }
        }
        for (Map.Entry<String, ArrayList<Book>> e : bookMap.entrySet()) {
            System.out.println(e.getKey());
            for (Book book1 : e.getValue()) {
                System.out.println(book1);
            }
        }

    }

    public static String addGenre(){
        System.out.println("Введите жанры");
        String input = sc.next();
        bookMap.put(input, new ArrayList<Book>());
        return input;

    }
}

