package com.applicationull.iubatsolutions;

/**
 * Created by Tipu on 3/14/2018.
 */

public class Detail {
    String id;
    String bookName;
    String writer;
    String price;
    String yourName;
    String contact;

    public Detail(){

    }

    public Detail(String id, String bookName, String writer, String price, String yourName, String contact) {
        this.id = id;
        this.bookName = bookName;
        this.writer = writer;
        this.price = price;
        this.yourName = yourName;
        this.contact = contact;
    }

    public String getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getWriter() {
        return writer;
    }

    public String getPrice() {
        return price;
    }

    public String getYourName() {
        return yourName;
    }

    public String getContact() {
        return contact;
    }
}
