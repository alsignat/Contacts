package contacts;

import java.util.ArrayList;

public class Phonebook {
    private ArrayList<Contact> contacts;

    public Phonebook() {
        this.contacts = new ArrayList<>();
    }

    public Phonebook(int capacity) {
        this.contacts = new ArrayList<>(capacity);
    }

    public boolean add(Contact contact) {
        return this.contacts.add(contact);
    }

}
