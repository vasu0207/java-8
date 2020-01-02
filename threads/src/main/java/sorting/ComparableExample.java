package main.java.sorting;

import java.util.*;

public class ComparableExample{

    String s1  = "Srinivas Kota";
    String s2 = "Naga mani";
    String s3 = "durga Prasad";
    String s4 = "Bramara kota";
    List<String> secondNames = new ArrayList<>();

    public void  splitMethod(){




        Map<String , String> map = new HashMap<>();

        String s11 = s1.split(" ")[1];
        String s22 = s2.split(" ")[1];
        String s33 = s3.split(" ")[1];
        String s44 = s4.split(" ")[1];

        map.put(s11, s1);
        map.put(s22, s2);
        map.put(s33, s3);
        map.put(s44, s4);

        secondNames.addAll( map.keySet());

        System.out.println("Before sort");
        secondNames.forEach(System.out::println);

        Collections.sort(secondNames);

        System.out.println("\n After sort");
        secondNames.forEach(System.out::println);



    }

    public static void main(String[] args) {
        System.out.println("Entered Main");
        new ComparableExample().splitMethod();
        System.out.println("Exist Main");
    }

}
