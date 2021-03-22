package com.knoldus;
import java.util.Optional;



    public class Main {
        public static void main(String args[]) {
            PhoneBook object1 = new PhoneBook();
            PhoneBookCrawler object2 = new PhoneBookCrawler(new PhoneBook());




// Exercise 1:


            System.out.println("-----------------------Excercise - 1 ----------------------------");

            Optional result = object1.findPhoneByName("Rex");

            System.out.println(String.valueOf(result.get()));


            System.out.println("-----------------------Excercise - 2 ----------------------------");

// Exercise 2:


            Optional result2 = object2.findPhoneByNameAndPunishIfNothingFound("Rex");
            System.out.println(String.valueOf(result2.get()));

            System.out.println("IF Nothing is found  :");

            Optional result3 = object2.findPhoneByNameAndPunishIfNothingFound("Agnibhas");
            System.out.println(String.valueOf(result3.get()));


// Exercise 3:


            System.out.println("-----------------------Excercise - 3 ----------------------------");



            String result4 = object2.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Chadwick");
            System.out.println(String.valueOf(result4));

            System.out.println("IF Nothing found :");

            String result5 = object2.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Agnibhas");
            System.out.println(String.valueOf(result5));


//        Exercise 5

            System.out.println("-----------------------Excercise - 5 ----------------------------");



            Optional result6 = object2.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Brie");
            System.out.println(String.valueOf(result6.get()));

            System.out.println("IF Nothing found :");

            Optional result7 = object2.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Agnibhas");
            System.out.println(String.valueOf(result7.get()));

// Exercise 6


            System.out.println("-----------------------Excercise - 6 ----------------------------");


            String result8 = object2.findPhoneByNameAndPrintPhoneBookIfNothingFoundStreams("Chadwick");
            System.out.println(String.valueOf(result8));

            System.out.println("IF Nothing found :");

            String result9 = object2.findPhoneByNameAndPrintPhoneBookIfNothingFoundStreams("Agnibhas");
            System.out.println(String.valueOf(result9));


//        Exercise 7

            System.out.println("-----------------------Excercise - 7 ----------------------------");


            String result10 = object2.findPhoneNumberByNameOrNameByPhoneNumber("Rober","9871253678");
            if(result10 != null) {
                System.out.println(result10); }
            else {
                System.out.println("Not Found");
            }
        }
    }
