package com.knoldus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook{
  public static final Map<String, String> phoneBookList = new HashMap<String, String>() {
      {
          put("Rex", "9866778899");
          put("Robert", "9871253678");
          put("Chadwick", "9877685940");
          put("Brie", "9878986590");
          put("Taylor", "9878986591");
      }
    };
    public Map<String, String> getPhoneBookList() {
        return phoneBookList;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBook=" + phoneBookList +
                '}';
    }

    public Optional<String> findPhoneByName(String name)
    {
        return (phoneBookList.containsKey(name)) ? Optional.of(phoneBookList.get(name)) : Optional.empty();
    }

    public Optional<String> findNameByPhoneNumber(final String phoneNumber) {
        for (Map.Entry<String, String> entry : phoneBookList.entrySet()) {
            if (entry.getValue().equals(phoneNumber)) {
                return Optional.of(entry.getKey());
            }
        }
        return Optional.empty();
    }

}

