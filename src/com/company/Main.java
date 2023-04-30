package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String str = "string";
        int integer = 1;
        boolean bool = false;
        Character character = 'f';

        if (integer == 1) {
            System.out.println(String.format("integer değeri: %d String ise %s", integer, str));
        }
        System.out.println("------ArrayList------");
        //ArrayList
        List<String> stringList = new ArrayList<>();
        stringList.add("element1");
        stringList.add("element2");
        stringList.add("element3");
        stringList.add("element4");

        stringList.forEach((index) -> {
            System.out.println(index);
        });
        //veya
        stringList.forEach(System.out::println);

        System.out.println("------LinkedList------");
        //Linked List
        List<String> linkedList = new LinkedList<>();

        System.out.println("------Stack------");
        //Genelde aynı anda gelen reqleri sırayla işlem yaptırmak için stack kullanılabilir.
        //Örneğin; aynı anda verilen siparişleri sıralamak için.
        Stack<String> stack = new Stack<>();
        stack.push("element1");
        stack.push("element2");
        stack.push("element3");
        stack.push("element4");

        //.pop işlemi en son eklenen değeri döner ve siler.
        //.peek işlemi son eklenen veriyi döner.
        System.out.println("Stack peek: " + stack.peek());
        System.out.println("Stack pop: " + stack.pop());
        System.out.println("popdan sonra: " + stack);

        System.out.println("------HashSet------");

        //hashset aynı elementi kaydetmemizi engelleyen yapıdır.
        //sağ tarafta hangi implementasyonu kullanacağımızı seçiyoruz.
        // HashSet hashSet = new ArrayHashSet();
        HashSet hashSet = new LinkedHashSet();

        hashSet.add("Element1");
        hashSet.add("Element2");
        hashSet.add("Element3");
        hashSet.add("Element1"); // Element 1 zaten eklendiği için hata verir.

        System.out.println("------HashMap------");

        Map<String, Integer> integerMap = new HashMap<>();
        integerMap.put("Key1", 1);
        integerMap.put("Key2", 2);
        integerMap.put("Key3", 3);
        System.out.println(integerMap.values());
        System.out.println(integerMap.keySet());

        //Aynı anda hem key hem value lere erişmek istiyorsak, entrySet kullanabiliriz.
        for (Map.Entry<String, Integer> entry : integerMap.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("------Stream------");
        List<Integer> streamExampleList = new ArrayList<>();
        streamExampleList.add(1);
        streamExampleList.add(3);
        streamExampleList.add(2);
        streamExampleList.add(5);

        // Stream api kullanarak filtreleme ile liste doldurma:
        // 1 e eşit olanlar ile yeni liste oluştur.
        System.out.println(
                streamExampleList.stream().filter((index) -> index == 1).collect(Collectors.toList()));
        // 3 den küçük olanlar ile yeni liste oluştur.
        System.out.println(
                streamExampleList.stream().filter((index) -> index < 3).collect(Collectors.toList()));

        //Bütün değerleri toplamak
        Integer totalSumOfList = streamExampleList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(totalSumOfList);

        System.out.println("------builder------");



    }
}