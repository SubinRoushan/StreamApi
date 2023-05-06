package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {
    public static void main(String[] args) {
        List<Integer> i1=Arrays.asList(1,2,3,4,5);
        Integer[] name={1,2,3,4,5};

        //Empty Stream
        Stream<Integer> str= Stream.empty();
        str.forEach(i-> System.out.println(i));

        //Store-> object/collection
        Stream<Integer> str1=Stream.of(name);
        str1.forEach(e-> System.out.println(e));

        //List/Set
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Stream<Integer> str2=list.stream();
        str2.forEach(e-> System.out.println(e));


        //Using filter (find starting name with S)
       List<String> str3=List.of("Subin","Sujit","Sudhanshu","Raj","Jay");
       List<String> st = str3.stream().filter(i->i.startsWith("S")).collect(Collectors.toList());
        System.out.println(st);

        //using map (Find square of every element)
        List<Integer> list2=List.of(2,3,4,12,1);
        List<Integer> st1=list2.stream().map(e->e*e).collect(Collectors.toList());
        System.out.println(st1);

        //Print in different ways
        str3.stream().forEach(e-> System.out.println(e));
        str3.stream().forEach(System.out::println);

        //Sorting function
        list2.stream().sorted().forEach(System.out::print);









    }
}