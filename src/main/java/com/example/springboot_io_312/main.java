package com.example.springboot_io_312;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Set<String> hSetOddNumbers = new HashSet<String>();

        hSetOddNumbers.add("One");
        hSetOddNumbers.add("Three");
        hSetOddNumbers.add("Five");

        //using enhanced for loop

        StringBuilder roleList = new StringBuilder();

        for( String strCurrentNumber : hSetOddNumbers ){
            roleList.append(strCurrentNumber).append(" ");
            System.out.println( strCurrentNumber );
        }

        System.out.println(roleList);

        List<String> listOfCars = new ArrayList<String>(hSetOddNumbers);
        Collections.reverse(listOfCars);
        System.out.println(listOfCars);

    }

}
