package br.edu.unisep.app;

import br.edu.unisep.contact.BusinessContact;
import br.edu.unisep.contact.Contact;
import br.edu.unisep.contact.PersonalContact;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.println("Enter the type of contact: ");
        System.out.println("1 - Personal");
        System.out.println("2 - Business");

        var contactType = sc.nextInt();

        Contact contact = null;

        if (contactType == 1) {
            contact = new PersonalContact();
        } else {
            contact = new BusinessContact();
        }

        contact.setName("Aparicio");
        contact.setEmail("aparicio@gmail.com");
        contact.setAddress("Aparicio's street");
        contact.setCity("Francisco Beltrão");
        contact.setCellPhone("98888-1234");

        // Check if the object attributed to the variable contact is of type PersonalContact
        if (contact instanceof PersonalContact) {
            var personal = (PersonalContact) contact;

            personal.setTwitter("oaparicio");
            personal.setFacebook("ofacedoaparicio");
            personal.setNickname("Apá");
        } else {
            var business = (BusinessContact) contact;

            business.setCompany("Aparicio's Inc.");
            business.setRole("Boss");
            business.setBusinessPhone("9999-1234");
        }

        System.out.println(contact.getInfo());
    }
}
