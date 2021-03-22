package com.knoldus;

import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PhoneBookCrawler {


    private PhoneBook phoneBook;


    public PhoneBookCrawler(final PhoneBook phoneBook) {

        this.phoneBook = phoneBook;
    }


    public Optional findPhoneByNameAndPunishIfNothingFound(final String name) {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.findPhoneByName(name);

        return (result.isPresent()) ? Optional.of(result.get()) : Optional.of("Not Found");
    }


    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(final String name) {
        return phoneBook.findPhoneByName(name).orElseGet(() -> phoneBook.toString());
    }


    public Optional findPhoneByNameAndPunishIfNothingFoundUsingStreams(final String name) {
        PhoneBook phoneBook = new PhoneBook();
        Optional result = phoneBook.getPhoneBookList().entrySet().stream()
                .filter(e -> name.equals(e.getKey()))
                .map(Map.Entry::getValue)
                .findFirst();

        return (result.isPresent()) ? Optional.of(result.get())
                : Optional.of("Not Found");
    }


    public String findPhoneByNameAndPrintPhoneBookIfNothingFoundStreams(final String name) {
        PhoneBook phoneBookObj = new PhoneBook();
        Map<String, String> phoneBookMap = phoneBookObj.getPhoneBookList();
        String result = phoneBookMap.entrySet().stream()
                .filter(map -> name.equals(map.getKey()))
                .map(Map.Entry::getValue)
                .collect(Collectors.joining());
        return (result.equals("")) ? phoneBookObj.toString() : result;
    }


    public String findPhoneNumberByNameOrNameByPhoneNumber(final String name, final String phoneNumber)
    {
        return Stream.of(phoneBook.findPhoneByName(name),
                phoneBook.findNameByPhoneNumber(phoneNumber),
                phoneBook.findPhoneByName("Rex"))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .findFirst().get();
    }


    public PhoneBook getPhoneBook() {
        return phoneBook;
    }

}