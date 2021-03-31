package exercise5.library;

import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws MalformedURLException { //throws æemo nauèiti uskoro

        Book book = new Book(1351, "The Hitchhiker's Guide to the Galaxy", "Douglas Adams");
        Dictionary dict = new Dictionary(1652, "Croatia-English dictionary", "Franck Francky", "Croatian", "English");
        Magazine magazine = new Magazine(1871, "Hacker", "computer games", 321);
        DigitalItem di = new DigitalItem(2162, "Microsoft Encarta", "DVD", 50);
        TextBook tb = new TextBook(3176, "Demystified C++", "Šribar & Motik", "ASP", 0);
        EItem ei = new EItem(3217, "Programming in Java", new URL("http://java.zemris.fer.hr/nastava/opjj/book-2015-09-30.pdf"));

        LibraryItem[] items = new LibraryItem[] {book, dict, magazine, di, tb, ei};

        for (LibraryItem item : items) {
            System.out.println(item.getId() + " " + item.getName());
            if (item instanceof ItemWithCashDeposit && ((ItemWithCashDeposit)item).hasCashDeposit())
                System.out.println(" +- cash deposit: " + ((ItemWithCashDeposit)item).getCashDepositAmount());
        }
    }

}
