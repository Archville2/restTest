package org.my.test.rest;

public class Greeting {

    private final long id;
    private final String contentString;

    public Greeting(long id, String contentString) {
        this.id = id;
        this.contentString = contentString;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return contentString;
    }
}
