package com.knoldus;

import org.junit.Test;

import java.util.Optional;

import static junit.framework.TestCase.assertEquals;

public class PhoneBookTest {

    PhoneBook phoneBook = new PhoneBook();

    @Test
    public void findPhoneByNameTest() {
        assertEquals(phoneBook.findPhoneByName("Rex"), Optional.of("9866778899"));
    }

    @Test
    public void findPhoneByNameTestNegative(){
        PhoneBook obj = new PhoneBook();
        assertEquals(Optional.empty(),obj.findPhoneByName("Agnibhas"));
    }

}