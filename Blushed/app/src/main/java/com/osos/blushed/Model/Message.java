package com.osos.blushed.Model;

public class Message {

String person;
String data;


    public Message(String person, String data) {
        this.person = person;
        this.data = data;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
