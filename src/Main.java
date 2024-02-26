import java.util.*;
public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Иван", "123-456");
        phoneBook.addContact("Петр", "987-654");
        phoneBook.addContact("Иван", "111-222");
        phoneBook.addContact("Мария", "333-444");
        phoneBook.addContact("Иван", "123-456");
        phoneBook.addContact("Петр", "983457-654");
        phoneBook.addContact("Иван", "114351-222");
        phoneBook.addContact("Мария", "333-454344");
        phoneBook.addContact("Иван", "122343-456");
        phoneBook.addContact("Петр", "987-632454");
        phoneBook.addContact("Ивано", "11421-222");
        phoneBook.addContact("Марина", "333-444");

        phoneBook.printPhoneBook();
    }
}