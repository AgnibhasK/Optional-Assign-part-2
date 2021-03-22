package com.knoldus;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class PhoneBookCrawlerTest {

    public ExpectedException expectedException = ExpectedException.none();
    private final PhoneBookCrawler phoneBookCrawler = new PhoneBookCrawler(new PhoneBook());

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundTest1() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("Rex"), Optional.of("9866778899"));
    }


    @Test
    public void findPhoneNumberByNameAndPunishIfNothingFoundTest2() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Not Found");

        phoneBookCrawler.findPhoneByNameAndPunishIfNothingFound("Agnibhas");
    }



    @Test
    public void findPhoneNumberByNameAndPrintPhoneBookIfNothingFoundTest1() {
        String Excpected = "9866778899";
        String result = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Rex");
        assertEquals(Excpected,result);
    }

    @Test
    public void findPhoneNumberByNameAndPrintPhoneBookIfNothingFoundTest2() {
        String Excpected = "PhoneBook{phoneBook={Brie=9878986590, Rex=9866778899, Robert=9871253678, Taylor=9878986591, Chadwick=9877685940}}";
        String value = phoneBookCrawler.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Agnibhas");
        assertEquals(Excpected, value);
    }



    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreamsTest1() {
        assertEquals(phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Robert"), Optional.of("9871253678"));
    }

    @Test
    public void findPhoneByNameAndPunishIfNothingFoundUsingStreamsTest2() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Not Found");

        phoneBookCrawler.findPhoneByNameAndPunishIfNothingFoundUsingStreams("Agnibhas");
    }


    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreamsTest1() {
        String Expcected = "9877685940";
        String value = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundStreams("Chadwick");
        assertEquals(Expcected,value);
    }
    @Test
    public void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreamsTest2() {
        String Expcected = "PhoneBook{phoneBook={Brie=9878986590, Rex=9866778899, Robert=9871253678, Taylor=9878986591, Chadwick=9877685940}}";

        String value = phoneBookCrawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundStreams("Agnibhas");
        assertEquals(Expcected,value);
    }


    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest1() {
        String Excpected = "9877685940";
        String result = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("Chadwick","98");
        assertEquals(Excpected,result);
    }
    @Test
    public void findPhoneNumberByNameOrNameByPhoneNumberTest2() {
        String Excpected = "Brie";
        String result = phoneBookCrawler.findPhoneNumberByNameOrNameByPhoneNumber("B","9878986590");
        assertEquals(Excpected,result);

    }


}