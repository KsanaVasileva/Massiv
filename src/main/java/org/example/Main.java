package org.example;

public class Main {

    public static String[] removeName() {
        String[] names = {
                "Petya",
                "Anya",
                "Olya",
                "Kolya",
                "Slava"
        };
        String removeName = "Olya";

        // ???
        String[] tmp = new String[names.length - 1];
        int copyToIndex = 0;
        for (String name : names) {
            if (!name.equals(removeName)) {
                tmp[copyToIndex] = name;
                copyToIndex++;
            }
        }
        return tmp;
    }

    //Класс с добавлением двух продуктов
    public static String[] addTwoProduct() {
        String[] names = {
                "Яблоко",
                "Ананас",
                "Творог",
                "Хлеб",
        };
        String addProductOne = "Бананы";
        String addProductTwo = "Кокос";


        String[] tmp = new String[names.length + 2];
        int copyToIndex = 0;
        for (String name : names) {
                tmp[copyToIndex] = name;
                copyToIndex++;
            }

        tmp[copyToIndex] = addProductOne;
        copyToIndex++;

        tmp[copyToIndex] = addProductTwo;
        return tmp;
    }

    public static void main(String[] args) {
        String[] result = removeName();
        System.out.println("\nЭлементов в новом массиве имен: " + result.length);

        String[] products = addTwoProduct();
        System.out.println("\nДобавленный массив продуктов " + products.length);
        System.out.println("Содержимое массива продуктов:");
        for (String product : products) {
            System.out.println("  - " + product);
        }
    }
}