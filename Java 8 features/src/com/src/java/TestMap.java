package com.src.java;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestMap {
    public static void main(String[] args) {
    System.out.println("Entered Main**********");
        List<String> list = Arrays.asList("javaDEVJournal", ".net");
        List<String> collect = list.stream()
               // .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
        File file  = new File("");

        System.out.println("Exist Main(***************");
    }

}
