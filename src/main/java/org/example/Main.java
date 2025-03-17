package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********");

        List<Contact> myContacts = new ArrayList<>();
        MobilePhone myPhone = new MobilePhone("123456789", myContacts);

        Contact alice = Contact.createContact("Alice", "555-1234");
        Contact bob = Contact.createContact("Bob", "555-5678");

        myPhone.addNewContact(alice);
        myPhone.addNewContact(bob);

        myPhone.printContact();

        Contact newAlice = Contact.createContact("Alice", "555-9999");
        myPhone.updateContact(alice, newAlice);

        myPhone.printContact();

        myPhone.removeContact(bob);
        myPhone.printContact();

        System.out.println("***********");

        List<Contact> hisContacts = new ArrayList<>();
        MobilePhone hisPhone = new MobilePhone("000-000-00-00", hisContacts);

        Contact jerry = Contact.createContact("Jerry", "11235813");
        Contact matthew = Contact.createContact("Matthew", "23571113");

        System.out.println(jerry.getPhoneNumber().equals(matthew.getPhoneNumber()));
        System.out.println(jerry.getName() + "'s phone number is: " + jerry.getPhoneNumber());
        System.out.println(matthew.getName() + "'s phone number is: " + matthew.getPhoneNumber());

        hisPhone.addNewContact(jerry);
        hisPhone.addNewContact(matthew);
        hisPhone.addNewContact(jerry);

        hisPhone.printContact();

        Contact result = hisPhone.queryContact("matthew");

        if (result != null) {
            System.out.println("Bulunan Contact: " + result.getName() + " - " + result.getPhoneNumber());
        } else {
            System.out.println("Contact bulunamadı.");
        }

        System.out.println("***********");

    }
}
